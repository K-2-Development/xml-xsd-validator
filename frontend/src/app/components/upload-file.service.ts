import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UploadFileService {

  constructor(private httpClient: HttpClient) { }

  public sendFile(file: File): Observable<any> {
    const formData: FormData = new FormData();
    formData.append("file", file);
    return this.httpClient.post("http://localhost:8088/api/v1/upload", formData, {reportProgress: true, observe: "events"});
  }
}
