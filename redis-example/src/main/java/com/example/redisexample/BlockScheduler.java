package com.example.redisexample;

import com.example.redisexample.BlockJob;
//import com.example.redisexample.service.CoinService;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Component
@Service
public class BlockScheduler {

    public void scanLatestBlock() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try {
            JobDetail jobDetail = JobBuilder.newJob().ofType(BlockJob.class)
                    .withIdentity("RUN_QUARTZ", "JOB_GROUP")
                    .storeDurably(true).build();

            String time = "*/2 * * * * ?";
            Trigger jobTrigger = TriggerBuilder.newTrigger().withIdentity("RUN_QUARTZ", "JOB_GROUP")
                    .startNow().withSchedule(CronScheduleBuilder.cronSchedule(time))
                    .build();

            org.quartz.Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail,jobTrigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
