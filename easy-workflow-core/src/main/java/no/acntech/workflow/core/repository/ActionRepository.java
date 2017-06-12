package no.acntech.workflow.core.repository;

import no.acntech.workflow.core.entity.Action;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends CrudRepository<Action, String> {
}
