import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TaskUserFormComponent } from './components/task-user-form/task-user-form.component';

const routes: Routes = [
  { path: 'addUser', component: TaskUserFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
