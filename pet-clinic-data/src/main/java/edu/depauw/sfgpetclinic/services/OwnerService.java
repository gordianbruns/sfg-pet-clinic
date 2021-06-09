package edu.depauw.sfgpetclinic.services;

import edu.depauw.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
