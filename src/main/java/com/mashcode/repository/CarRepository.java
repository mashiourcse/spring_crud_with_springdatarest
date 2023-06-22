package com.mashcode.repository;

import org.springframework.data.repository.CrudRepository;

import com.mashcode.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
}
