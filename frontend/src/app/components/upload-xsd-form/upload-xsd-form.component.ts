import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {UploadFileService} from "../upload-file.service";
import {HttpEvent, HttpEventType} from "@angular/common/http";

@Component({
  selector: 'app-upload-xsd-form',
  templateUrl: './upload-xsd-form.component.html',
  styleUrls: ['./upload-xsd-form.component.css']
})
export class UploadXsdFormComponent implements OnInit {

  @ViewChild("progress")
  progressBar!: ElementRef<HTMLDivElement>;

  progress: number;
  progressBarVisibility: boolean;
  file: File | undefined;

  constructor(private uploadFileService: UploadFileService) {
    this.progress = 0;
    this.progressBarVisibility = false;
  }

  ngOnInit(): void {
  }

  uploadFile() {
    if(this.file != undefined) {
      this.uploadFileService.sendFile(this.file)
        .subscribe((event: HttpEvent<any>) => {
          switch (event.type) {
            case HttpEventType.Sent:
              this.progressBarVisibility = true;
              break;
            case HttpEventType.ResponseHeader:
              break;
            case HttpEventType.UploadProgress:
              var eventTotal = event.total ? event.total : 0;
              this.progress = Math.round(event.loaded / eventTotal * 100);
              this.updateProgress(this.progress);
              console.log(`Uploaded! ${this.progress}%`);
              break;
            case HttpEventType.Response:
              this.progress = 100;
              this.progressBarVisibility = false;
              break;
          }
        });
    }
  }

  private updateProgress(value: number){
    this.progressBar.nativeElement.style.width = `${value}%`
  }

  onChosenFileChange(event:any) {
    this.file = event.target.files[0];
  }

}
