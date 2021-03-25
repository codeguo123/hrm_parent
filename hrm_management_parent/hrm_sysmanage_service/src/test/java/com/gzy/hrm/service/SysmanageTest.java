package com.gzy.hrm.service;

import com.gzy.hrm.SysManage9001Application;

import com.gzy.hrm.domain.Systemdictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith (SpringRunner.class)
@SpringBootTest(classes = SysManage9001Application.class)
public class  SysmanageTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @Test 
    public void test() throws Exception{

        for (Systemdictionary systemdictionary : systemdictionaryService.selectList (null)) {
            System.out.println (systemdictionary);
        }
     }
    
}
