package com.xyt.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.xyt.entity.Grade;
@Repository
public interface GradeRepository extends MongoRepository<Grade, String> {

}
