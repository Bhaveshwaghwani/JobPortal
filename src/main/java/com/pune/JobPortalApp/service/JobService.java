package com.pune.JobPortalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pune.JobPortalApp.model.JobPost;
import com.pune.JobPortalApp.repository.JobRepository;

@Service
public class JobService {
    @Autowired
    public JobRepository repo;

    public void addJob(JobPost jobPost){
        repo.addJobPost(jobPost);

    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
        
    }
    
}
