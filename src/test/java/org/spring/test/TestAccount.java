package org.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.service.AccountService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAccount {
	
	@Resource(name="accountService")
    private AccountService accountService;
     
    @Test
    public void testTransfer() {
        accountService.transfer("张三", "李四", 100d);
    }
}
