package no.acntech.workflow.core.repository;

import no.acntech.workflow.core.entity.Workflow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkflowRepository extends CrudRepository<Workflow, String> {
}
