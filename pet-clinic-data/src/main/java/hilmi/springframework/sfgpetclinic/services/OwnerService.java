package hilmi.springframework.sfgpetclinic.services;

import hilmi.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
