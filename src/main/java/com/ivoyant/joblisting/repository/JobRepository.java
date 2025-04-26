package com.ivoyant.joblisting.repository;

import com.ivoyant.joblisting.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;

//public interface JobRepository extends MongoRepository<Job,String> {
//}

public interface JobRepository extends JpaRepository<Job,Long> {
}
