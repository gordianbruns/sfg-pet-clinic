package edu.depauw.sfgpetclinic.repositories;

import edu.depauw.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
