package com.galvanize.employeedb.Services;

import com.galvanize.employeedb.Entities.Employee;
import com.galvanize.employeedb.Entities.Job;
import com.galvanize.employeedb.Repositories.EmployeeRepository;
import com.galvanize.employeedb.Repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public JobService(JobRepository jobrepository) {
        this.jobRepository = jobrepository;
    }


//    public Iterable<Job> getAllJobsForEmployee(long id) {
//        return this.jobRepository.find();
//    }

    public Job saveJob(Job job) {
        return this.jobRepository.save(job);
    }

    public Optional<Job> getJobById(long id) { return this.jobRepository.findById(id); }
}

