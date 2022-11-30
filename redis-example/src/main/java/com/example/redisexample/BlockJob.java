package com.example.redisexample;

import com.example.redisexample.entity.Coin;
//import com.example.redisexample.service.CoinService;
import com.example.redisexample.service.XrpService;
import com.example.redisexample.service.impl.CoinServiceImpl;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
public class BlockJob extends QuartzJobBean {

    @Autowired
    private CoinServiceImpl coinService;


    @Override
    public void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
            System.out.println("*****RUN JOB*****");
            Coin coin = new Coin();
            coin.setId(1);
            coin.setName("XRP");
            coin.setLatestblock(1);
            coinService.saveCoin(coin);
        }
}

