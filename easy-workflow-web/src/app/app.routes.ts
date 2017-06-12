import {ModuleWithProviders} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {AppComponent} from "./app.component";
import {WorkflowComponent} from "./workflow/workflow.component";

export const routes: Routes = [
  {path: '', redirectTo: '/', pathMatch: 'full'},
  {path: 'workflow', component: WorkflowComponent},
  {path: '**', component: AppComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
