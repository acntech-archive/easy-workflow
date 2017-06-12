package no.acntech.workflow.engine.service;

import no.acntech.workflow.core.entity.Action;
import no.acntech.workflow.core.entity.Step;
import no.acntech.workflow.core.entity.Workflow;
import no.acntech.workflow.core.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class WorkflowService {

    private final WorkflowRepository workflowRepository;

    @Autowired
    public WorkflowService(final WorkflowRepository workflowRepository) {
        this.workflowRepository = workflowRepository;
    }


    @Transactional
    public Workflow createWorkflow() {
        Workflow workflow = new Workflow();
        workflow.setId(UUID.randomUUID().toString());
        workflow.setName("DUMMY_WORKFLOW");

        Step step = new Step();
        step.setId(UUID.randomUUID().toString());
        step.setName("DUMMY_STEP");
        step.setWorkflow(workflow);

        Action action = new Action();
        action.setId(UUID.randomUUID().toString());
        action.setName("DUMMY_ACTION");
        action.setType("DUMMY_ACTION_TYPE");
        action.setStep(step);

        return workflowRepository.save(workflow);
    }
}
