package com.pune.JobPortalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pune.JobPortalApp.model.JobPost;
import com.pune.JobPortalApp.service.JobService;





@Controller
public class jobController {

    @Autowired
    JobService service;
    
    @RequestMapping({"/", "/home"})
    public String home(){
        return "home";
    }
    
    @RequestMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @RequestMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }
    
    @RequestMapping("/viewalljobs")
    @ModelAttribute
    public String viewJobs(Model model){
        List<JobPost> jobPosts =service.getAllJobs();
        model.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }
}
    

