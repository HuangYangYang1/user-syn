package com.oce.testsync.controller;

import com.oce.testsync.domain.JobTitleBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @PostMapping("/newjob")
    public void newJobSave(JobTitleBean jobTitleBean){
        System.out.println("new job info:" + jobTitleBean);
    }


}
