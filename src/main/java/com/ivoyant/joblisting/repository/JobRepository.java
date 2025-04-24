package com.ivoyant.joblisting.repository;

import com.ivoyant.joblisting.entity.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job,String> {
}
