package me.Coe.Utils;

import java.util.Date;
import me.Coe.J.Core;

public abstract class Task implements Runnable{
	protected void start(final long Delay, final boolean Repeat, final long Period, final boolean FixedRate){
		Core.Executor.execute(new Runnable(){
			public void run(){
				try {
					if(Delay >= 1){
						Thread.sleep(Delay);
					}
					boolean Continue = true;
					while(Continue){
						if(FixedRate){
							Core.Executor.execute(this);
						}else{
							this.run();
						}
						if(Period >= 1){
							Thread.sleep(Period);
						}
						Continue = Repeat;
					}
				}catch(InterruptedException Error){
					Error.printStackTrace();
				}
			}
		});
	}

	public void schedule(final long Delay){
		start(Delay, false, 0, false);
	}
	public void schedule(final long Delay, final long Period){
		start(Delay, true, Period, false);
	}
	public void scheduleAtFixedRate(final long Delay, final long Period){
		start(Delay, true, Period, true);
	}
	public void schedule(final Date Time){
		start(Time.getTime() - System.currentTimeMillis(), false, 0, false);
	}
	public void schedule(final Date FirstTime, final long Period){
		start(FirstTime.getTime() - System.currentTimeMillis(), true, Period, false);
	}
	public void scheduleAtFixedRate(final Date FirstTime, final long Period){
		start(FirstTime.getTime() - System.currentTimeMillis(), true, Period, true);
	}
}