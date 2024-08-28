package com.jobPortal.JobPortal;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.jobPortal.JobPortal.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	 JobService service;
	
	
	
	public JobController(JobService service) {
		super();
		this.service = service;
	}

	@GetMapping({"/" , "home"})
	public String home() {
		
		System.out.println("hello");
		return"home.jsp";
	}
	
	@GetMapping("addjob")
	public String addjob() {
		
		return "addjob.jsp";
	}
	
	// controller method for getting all job posts

	@GetMapping("/viewalljobs")
	public String viewalljobs(Model m) {
		
		List<JobPost> jobs= service.getAllJobs();
		m.addAttribute("jobPosts" , jobs);
		return "viewalljobs.jsp";
	}
	
	// controller method for getting all job posts
//	@GetMapping("/viewalljobs")
//	public String viewJobs(Model model) {
//
//		List<JobPost> jobPosts = service.returnAllJobPosts();
//		model.addAttribute("jobPosts", jobPosts);
//		return "viewalljobs";
//	}
	
	
	
	@PostMapping("handleForm")
	public String handleForm(JobPost JobPost) {
		service.addJob(JobPost);
		return "success.jsp";
	}
	
	
}
