
public class Employee extends Person{
	private double daySalary;
	private double overTimeMoney;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	
	
	public double getDaySalary() {
		return daySalary;
	}
	public void setDaySalary(double daySalary) {
		if(daySalary>0){
			this.daySalary = daySalary;
		}else{
			this.daySalary = 21; //that's the minimal day salary in bg for 2016.. google say so
		}
	}
	public double getOverTimeMoney() {
		return overTimeMoney;
	}
	public void setOverTimeMoney(double overTimeMoney) {
		this.overTimeMoney = overTimeMoney;
	}
	
	
	
	double calculateOvertime(double hours){
		double time[] = new double[2];
		time = editHours(hours, time); //i have a problem with using just 1 double for time 
		if(this.age>=18){
			return this.overTimeMoney = (time[0]*1.50*(this.getDaySalary()/8)+time[1]*1.50*(this.getDaySalary()/480));
										//sum of hours + minutes overtime salary
										//8 hours shift => so thats per hour salary and 480 it's 8*60 => for minutes
		}
		return this.overTimeMoney = 0;
	}

	public void showPersonInfo(){
		super.showPersonInfo();
		if(this.isMale){
			System.out.println("His day salary for today /calcolated with overtime hours/:" + (this.getDaySalary()+this.overTimeMoney));
		}else{
			System.out.println("Her day salary for today /calcolated with overtime hours/:" + (this.getDaySalary()+this.overTimeMoney));
		}
	}
	
	double[] editHours(double hours, double [] time){
		time[0] = Math.floor(hours); 
		time[1] = hours%1;
		if(time[1] >= 0.60){
			time[0]++;
			time[1] -= 0.60;
			time[1] *= 100;//i need it to be an integer
		}else{
			time[1] *= 100;
		}
		return time;
	}	
}