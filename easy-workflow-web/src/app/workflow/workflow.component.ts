import {Component, OnInit} from "@angular/core";
import {WorkflowService} from "./service/workflow.service";
import {Workflow} from "./model/workflow";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.css']
})
export class WorkflowComponent implements OnInit {

  workflowForm: FormGroup;
  post: any;
  workflow: Workflow;

  constructor(private formBuilder: FormBuilder, private workflowService: WorkflowService) {
    this.workflowForm = formBuilder.group({
      'name': [null, Validators.compose([
        Validators.required,
        Validators.minLength(1),
        Validators.maxLength(100)
      ])]
    });
  }

  ngOnInit() {
  }

  getWorkflow() {
    this.workflowService.getWorkflow()
      .subscribe((data: Workflow) => this.workflow = data);
  }
}
