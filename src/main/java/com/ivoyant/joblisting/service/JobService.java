package com.ivoyant.joblisting.service;

import com.ivoyant.joblisting.entity.Job;
import com.ivoyant.joblisting.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;


    public Job createJob(Job job) {
        return jobRepository.save(job);
    }


    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }


    @Cacheable(value="Job",key="#id")
    public Optional<Job> getJobById(long id) {
        return jobRepository.findById(id);
    }


    @CachePut(value="Job",key="#id")
    public Job updateJob(long id, Job job) {
        job.setId(id);
        return jobRepository.save(job);
    }


    @CacheEvict(value="Job",key="#id")
    public void deleteJob(long id) {
        jobRepository.deleteById(id);
    }
}

