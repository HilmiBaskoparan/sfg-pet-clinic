package hilmi.springframework.sfgpetclinic.repositories;

import hilmi.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
