import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {UploadFileService} from "../upload-file.service";
//import {HttpEvent, HttpEventType} from "@angular/common/http";
import {FilesService} from "../files.service";
import {HttpEvent, HttpEventType} from "@angular/common/http";

@Component({
  selector: 'app-upload-xsd-form',
  templateUrl: './upload-xsd-form.component.html',
  styleUrls: ['./upload-xsd-form.component.css']
})
export class UploadXsdFormComponent implements OnInit {

  @ViewChild("progress")
  progressBar!: ElementRef<HTMLDivElement>;

  @ViewChild("selectedFile")
  selectedFile!: ElementRef<HTMLParagraphElement>;

  progress: number;
  file: File | undefined;

  constructor(private uploadFileService: UploadFileService, private filesService: FilesService) {
    this.progress = 0;
  }

  ngOnInit(): void {
  }

  uploadFile() {

    if(this.file != undefined) {
      this.uploadFileService.sendFile(this.file)
        .subscribe((event: HttpEvent<any>) => {
          switch (event.type) {
            case HttpEventType.Sent:
              break;
            case HttpEventType.ResponseHeader:
              break;
            case HttpEventType.UploadProgress:
              var eventTotal = event.total ? event.total : 0;
              this.progress = Math.round(event.loaded / eventTotal * 100);
              this.updateProgress();
              break;
            case HttpEventType.Response:
              this.filesService.addFile(event.body);
              this.progress = 100;
              this.progressBar.nativeElement.style.backgroundColor = "#00ff59";
              break;
          }
        });
    }

  }


  private updateProgress(){
    this.progressBar.nativeElement.style.width = `${this.progress}%`
  }

  onChosenFileChange(event:any) {
    this.file = event.target.files[0];
    if (this.file !== undefined)
      this.selectedFile.nativeElement.innerText = this.file?.name;

    this.progressBar.nativeElement.style.width = "0";
    this.progressBar.nativeElement.style.backgroundColor = "#0099ff";
  }

}
