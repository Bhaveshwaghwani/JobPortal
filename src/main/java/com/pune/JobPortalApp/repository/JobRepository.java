
package com.pune.JobPortalApp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pune.JobPortalApp.model.JobPost;

@Repository
public class JobRepository {

    List<JobPost> jobs= new ArrayList<>();

    public JobRepository(){
        
    jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
    jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",3, List.of("HTML", "CSS", "JavaScript", "React")));
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }
    
    public void addJobPost(JobPost job){
        jobs.add(job);
    }
}
