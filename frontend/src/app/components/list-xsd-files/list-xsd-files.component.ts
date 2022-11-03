import { Component, OnInit } from '@angular/core';
import {FilesService} from "../files.service";
import {FileDescription} from "../file-description";

@Component({
  selector: 'app-list-xsd-files',
  templateUrl: './list-xsd-files.component.html',
  styleUrls: ['./list-xsd-files.component.css']
})
export class ListXsdFilesComponent implements OnInit {

  files: FileDescription[];


  constructor(public filesService: FilesService) {
    this.files = this.filesService.filesArray;
    console.log(this.files);
  }

  ngOnInit(): void {

  }
}
