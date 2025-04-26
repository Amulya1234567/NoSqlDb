package com.ivoyant.joblisting.controller;

import com.ivoyant.joblisting.entity.Job;
//import com.ivoyant.joblisting.service.CacheInspectionService;
import com.ivoyant.joblisting.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

//    @Autowired
//    private CacheInspectionService cacheInspectionService;

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Optional<Job> getJobById(@PathVariable long id) {
        return jobService.getJobById(id);
    }

//    @GetMapping("/cacheData")
//    public void getCacheData(){
//        cacheInspectionService.printCacheContents("Job");
//    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable long id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable long id) {
        jobService.deleteJob(id);
    }
}
