package com.ivoyant.joblisting.service;

import com.ivoyant.joblisting.entity.Job;
import com.ivoyant.joblisting.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<Job> getJobById(String id) {
        return jobRepository.findById(id);
    }

    public Job updateJob(String id, Job job) {
        job.setId(id);
        return jobRepository.save(job);
    }

    public void deleteJob(String id) {
        jobRepository.deleteById(id);
    }
}

