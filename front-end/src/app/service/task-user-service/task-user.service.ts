import { Observable } from "rxjs/internal/Observable";
import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "src/environments/environment";
import { TaskUser } from "src/app/model/task-user/task-user";


@Injectable({
    providedIn: 'root'
})
export class TaskUserService { 
    private apiUrl = environment.apiUrl;

    constructor(private http: HttpClient) { }

    public getTaskUsers(): Observable<TaskUser[]> {
        return this.http.get<TaskUser[]>(`${this.apiUrl}/taskUser/all`);
    }

    public addTaskUser(taskUser: TaskUser): Observable<TaskUser> {
        return this.http.post<TaskUser>(`${this.apiUrl}/taskUser/add`, taskUser);
    }

    public updateTaskUser(taskUser: TaskUser): Observable<TaskUser> {
        return this.http.put<TaskUser>(`${this.apiUrl}/taskUser/update`, taskUser);
    }

    public deleteTaskUser(taskUserId: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/taskUser/delete/${taskUserId}`);
    }
}