package com.qzx.secondhand.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author qzx
 * @create 2021-11-27 9:56
 * @function
 */

@SpringBootTest
class TradeUserServiceTest {
    @Autowired
    TradeUserService tradeUserService;

    @Test
    public void test(){
//        for(int i=0;i<8;i++){
//            tradeUserService.selectall();
//        }
        tradeUserService.selectall();
    }

}