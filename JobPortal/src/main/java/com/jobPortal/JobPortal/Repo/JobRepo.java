//if getting error in this file plese check lambok depedency and iambok installed in the your ide .

package com.jobPortal.JobPortal.Repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobPortal.JobPortal.JobPost;

@Repository

public class JobRepo {

	
	// arrayList to store store JobPost objects
	
	
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
			
			
			new JobPost (1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
			List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
	
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
				3, List.of("HTML", "CSS", "JavaScript", "React")),
		
			new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
					List.of("Python", "Machine Learning", "Data Analysis"))
			
			));

	
	// method to return all JobPosts
		public List<JobPost> getAllJobs() {
			return jobs;
		}

	// method to save a job post object into arrayList
		public void addJob(JobPost job) {
			jobs.add(job);
			System.out.println(jobs);

		}
}	

