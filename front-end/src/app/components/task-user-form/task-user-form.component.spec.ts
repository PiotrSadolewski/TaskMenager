import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskUserFormComponent } from './task-user-form.component';

describe('TaskUserFormComponent', () => {
  let component: TaskUserFormComponent;
  let fixture: ComponentFixture<TaskUserFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TaskUserFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TaskUserFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
