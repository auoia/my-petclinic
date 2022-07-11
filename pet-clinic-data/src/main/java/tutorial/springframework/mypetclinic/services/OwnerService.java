package tutorial.springframework.mypetclinic.services;

import tutorial.springframework.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
