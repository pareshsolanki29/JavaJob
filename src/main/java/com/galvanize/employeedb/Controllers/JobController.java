package com.galvanize.employeedb.Controllers;

import com.galvanize.employeedb.Entities.Employee;
import com.galvanize.employeedb.Entities.Job;

import com.galvanize.employeedb.Services.EmployeeService;
import com.galvanize.employeedb.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/job")
public class JobController {

    private JobService jobService;
    private EmployeeService employeeService;

    @Autowired
    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @PostMapping("/")
    public  Job save(@RequestBody Job job){ return  jobService.saveJob(job);}


}
