package cn.bontor.pmms.nodata.task;


import cn.bontor.pmms.nodata.dao.s.CarFlowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import java.util.concurrent.ScheduledFuture;


/**
 * 根据阈值动态修改定时任务
 */
@Component
public class AutoCreateScheduledTask {



    @Autowired
    private CarFlowDao dao;

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    @Scheduled(fixedRate = 5000)
    public void createSheduleWorkorder() {

        //ScheduledFuture<?> future =threadPoolTaskScheduler.schedule(new MyRunnable(1),new CronTrigger(""));

    }

    private class MyRunnable implements Runnable {

        private int i;

        public MyRunnable(int i) {
            this.i = i;
        }

        @Override
        public void run() {

            System.out.println(i+"开始运行了");
        }
    }
}
