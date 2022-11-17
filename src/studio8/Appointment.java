package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(int month, int day, int year, int hour, int minute) {
		this.date=new Date (month,day,year,false);
		this.time=new Time (hour,minute,true);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment a1= new Appointment (12,25,2003,12,59);
		Appointment a2= new Appointment (12,25,2003,12,59);
		Appointment a3= new Appointment (9,16,2000,8,1);
		
		HashSet<Appointment> calandar = new HashSet<Appointment>();
		calandar.add(a1);
		calandar.add(a2);
		calandar.add(a3);
		System.out.println(calandar);
	}

}
