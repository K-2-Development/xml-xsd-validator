import {Component, Input, OnInit} from '@angular/core';
import {FileDescription} from "../../file-description";
import {FilesService} from "../../files.service";

@Component({
  selector: 'app-xsd-list-item',
  templateUrl: './xsd-list-item.component.html',
  styleUrls: ['./xsd-list-item.component.css']
})
export class XsdListItemComponent implements OnInit {

  @Input("file")
  fileDescription!: FileDescription

  constructor(public fileService: FilesService) { }

  ngOnInit(): void {
  }

  download(){
    this.fileService.downloadFileBy(this.fileDescription.id);
  }

  delete(){
    this.fileService.deleteFile(this.fileDescription.id);
  }
}
