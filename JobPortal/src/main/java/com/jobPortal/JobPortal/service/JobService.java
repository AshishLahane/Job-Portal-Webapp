package com.jobPortal.JobPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.JobPortal.JobPost;
import com.jobPortal.JobPortal.Repo.JobRepo;

@Service

public class JobService {
	
	@Autowired
	 JobRepo repo;
	
	
	// method to add a jobPost

	public void addJob(JobPost JobPost) {
		repo.addJob(JobPost);
		
	}
	
	//method to return all JobPosts
	
	public  List<JobPost> getAllJobs(){
		return repo.getAllJobs();
	}

}
