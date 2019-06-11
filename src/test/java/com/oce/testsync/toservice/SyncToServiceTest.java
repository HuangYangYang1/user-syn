package com.oce.testsync.toservice;

import com.oce.testsync.client.WsClient;
import com.oce.testsync.domain.DepartmentBean;
import com.oce.testsync.domain.DeptRelation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SyncToServiceTest {

    @Autowired
    SyncToService syncToService;
    @Autowired
    WsClient wsClient;


    @Test
    public void getDepartmentInfo() {
        syncToService.getDepartmentInfo();
    }
    @Test
    public void getDepartmentRelation() {
        syncToService.getDepartmentRelation();
    }
    @Test
    public void getUserInfo(){
        syncToService.getUserInfo();
    }

    @Test
    public void getPositionInfo(){
        syncToService.getPositionInfo();

    }
}