package no.acntech.workflow.core.repository;

import no.acntech.workflow.core.entity.Step;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends CrudRepository<Step, String> {
}
