package com.smartparking.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.smartparking.domain.Parking;

@RepositoryRestResource(collectionResourceRel = "parking", path = "parking")
public interface ParkingRepository extends MongoRepository<Parking, Long> {

}
