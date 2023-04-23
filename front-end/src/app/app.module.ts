import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { TaskUserFormComponent } from './components/task-user-form/task-user-form.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { TaskUserService } from './service/task-user-service/task-user.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    TaskUserFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [TaskUserService],
  bootstrap: [AppComponent]
})
export class AppModule { 
  title = 'Task App';
}
