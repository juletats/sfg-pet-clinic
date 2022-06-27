package com.juletats.sfgpetclinic.services;

import com.juletats.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastname);
}
