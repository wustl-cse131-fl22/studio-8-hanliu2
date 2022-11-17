package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean twelveHour;
	
	public Time (int hour, int minute, boolean twelveHour) {
		this.hour=hour;
		this.minute=minute;
		this.twelveHour=twelveHour;
	}
	
	public String toString() {
		if (this.hour>12) {
			if (twelveHour=true) {
				return this.hour-12 + " " + this.minute;
			}
			else {
				return this.hour + " " + this.minute;
			}
		}
			else {
				return this.hour + " " + this.minute;
			}
	}


	public static void main(String[] args) {
    	Time t1 = new Time(14,25,true);
    	System.out.println(t1);	
    }

}