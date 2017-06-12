package no.acntech.workflow.engine.component;

import no.acntech.workflow.core.entity.Workflow;
import no.acntech.workflow.engine.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkflowEngine {

    private final WorkflowService workflowService;

    @Autowired
    public WorkflowEngine(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    public Workflow startWorkflow() {
        return workflowService.createWorkflow();
    }
}
