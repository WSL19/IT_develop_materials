package com.ti.aop;

import com.ti.aop_anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_anno.xml")
public class AopTest {

    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test1(){
        targetInterface.save();
    }
}
