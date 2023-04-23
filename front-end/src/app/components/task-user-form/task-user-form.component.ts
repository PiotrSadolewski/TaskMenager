import { Component } from '@angular/core';
// import { ActivatedRoute, Router } from '@angular/router';
import { TaskUser } from 'src/app/model/task-user/task-user';
import { TaskUserService } from 'src/app/service/task-user-service/task-user.service';

@Component({
  selector: 'app-task-user-form',
  templateUrl: './task-user-form.component.html'
})
export class TaskUserFormComponent {
  taskUser: TaskUser;

  constructor(
    private taskUserService: TaskUserService) {
      this.taskUser = {} as TaskUser;
    }



  onSubmit() {
    this.taskUserService.addTaskUser(this.taskUser);
  }

}
