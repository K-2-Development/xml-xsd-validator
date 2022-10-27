import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadXsdFormComponent } from './components/upload-xsd-form/upload-xsd-form.component';
import { ListXsdFilesComponent } from './components/list-xsd-files/list-xsd-files.component';
import { XsdFileComponent } from './components/xsd-file/xsd-file.component';

@NgModule({
  declarations: [
    AppComponent,
    UploadXsdFormComponent,
    ListXsdFilesComponent,
    XsdFileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
