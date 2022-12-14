import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {saveAs} from "file-saver";
import {FileDescription} from "./file-description";
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
    this.http.get<FileDescription[]>("http://localhost:8088/api/v1/files").subscribe(
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
    console.log("asdasd");
    this.http.get(`http://localhost:8088/api/v1/files/${id}`, {responseType: "blob"}).subscribe(
      (blob: Blob) => {
        saveAs(
          blob,
          filename
        );
      }
    );
  }

  public deleteFile(id: number) {
    console.log("Waiting for implementation :(.")
  }
}
