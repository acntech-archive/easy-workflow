package no.acntech.workflow.webapp.resource;

import no.acntech.workflow.core.entity.Workflow;
import no.acntech.workflow.engine.component.WorkflowEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping(value = "/api/workflow")
@RestController
public class WorkflowResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkflowResource.class);

    private final WorkflowEngine workflowEngine;

    @Autowired
    public WorkflowResource(WorkflowEngine workflowEngine) {
        this.workflowEngine = workflowEngine;
    }

    @RequestMapping(method = GET)
    public Workflow get() {
        LOGGER.debug("Create workflow operation called");
        return workflowEngine.startWorkflow();
    }
}
