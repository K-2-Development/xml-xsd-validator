import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {saveAs} from "file-saver";
import {FileDescription} from "./file-description";
import {FileDeleteResponse} from "./FileDeleteResponse";

@Injectable({
  providedIn: 'root'
})
export class FilesService {

  files: Map<number, FileDescription>;

  filesArray: FileDescription[];

  constructor(private http: HttpClient) {
    this.filesArray = [];
    this.files = new Map();
    this.loadAllFiles();
  }

  addFile(file: FileDescription) {
    this.files.set(file.id, file);
    this.filesArray.unshift(file);
  }

  loadAllFiles() {
    this.files = new Map();
    this.http.get<FileDescription[]>("/api/v1/files").subscribe(
      (response: FileDescription[]) => {
        this.filesArray = response;
        response.forEach(
          (fileDescription: FileDescription) => {
            this.files.set(fileDescription.id, fileDescription);
          }
        )
      }
    );
  }


  public downloadFileBy(id: number) : void {
    let filename = "";
    let fileDescription = this.files.get(id);
    if(fileDescription != undefined) {
      filename = fileDescription.originalFilename;
    }
    this.http.get(`/api/v1/files/${id}`, {responseType: "blob"}).subscribe(
      (blob: Blob) => {
        saveAs(
          blob,
          filename
        );
      }
    );
  }

  public deleteFile(id: number) {
    if (this.files.has(id)) {
      this.http.delete<FileDeleteResponse>(`/api/v1/delete/${id}`).subscribe(
        (response: FileDeleteResponse) => {
          if (response.successful) {
            this.files.delete(response.id);
            const index = this.filesArray.findIndex( (file) => file.id === id);
            if(index != -1)
            {
              this.filesArray.splice(index, 1);
            }
          }
          else
          {
            console.log("File not found in Minio")
          }
        })
    }
    else
    {
      console.log("This file ("+id+") no present in current cash")
    }
  }
}
