import {Injectable} from "@angular/core";
import {Http, Response} from "@angular/http";
import "rxjs/Rx";
import {Observable} from "rxjs/Observable";
import {Workflow} from "../model/workflow";

@Injectable()
export class WorkflowService {

  constructor(private http: Http) {
  }

  getWorkflow(): Observable<Workflow> {
    return this.http.get('/api/workflow')
      .map((response: Response) => response.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }
}
