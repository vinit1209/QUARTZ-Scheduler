package ai.infrrd.schedular;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class CustomSchedular implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		System.out.println("Schedular is running.... at => " + new Date());
		System.out.println();
		
	}

}
