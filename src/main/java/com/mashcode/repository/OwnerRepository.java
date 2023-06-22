package com.mashcode.repository;


import  org.springframework.data.repository.CrudRepository;

import com.mashcode.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
