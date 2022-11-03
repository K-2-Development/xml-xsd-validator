import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadXsdFormComponent } from './components/upload-xsd-form/upload-xsd-form.component';
import { ListXsdFilesComponent } from './components/list-xsd-files/list-xsd-files.component';
import { XsdFileComponent } from './components/xsd-file/xsd-file.component';
import {HttpClientModule} from "@angular/common/http";
import { XsdListItemComponent } from './components/list-xsd-files/xsd-list-item/xsd-list-item.component';
import { IconDownloadComponent } from './components/list-xsd-files/icon-download/icon-download.component';
import { IconTrashComponent } from './components/list-xsd-files/icon-trash/icon-trash.component';

@NgModule({
  declarations: [
    AppComponent,
    UploadXsdFormComponent,
    ListXsdFilesComponent,
    XsdFileComponent,
    XsdListItemComponent,
    IconDownloadComponent,
    IconTrashComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
