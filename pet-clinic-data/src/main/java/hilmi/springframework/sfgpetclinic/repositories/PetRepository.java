package hilmi.springframework.sfgpetclinic.repositories;

import hilmi.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
