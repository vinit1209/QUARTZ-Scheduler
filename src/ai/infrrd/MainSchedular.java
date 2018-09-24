package ai.infrrd;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import ai.infrrd.schedular.CustomSchedular;

public class MainSchedular {

	public static void main(String[] args) throws SchedulerException {
		

		JobDetail jobDetail = JobBuilder.newJob(CustomSchedular.class).build();
		
		
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("CroneTrigger")
							.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(05)
									.repeatForever()).build();
		
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		
		scheduler.start();
		scheduler.scheduleJob(jobDetail, trigger);
		
	}

}
