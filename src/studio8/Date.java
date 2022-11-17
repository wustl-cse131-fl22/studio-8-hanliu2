package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month=month;
		this.day=day;
		this.year=year;
		this.isHoliday=isHoliday;
	}
	
	public String toString() {
		return this.month + " " + this.day + " " + this.year + " " + this.isHoliday;
	}


    public static void main(String[] args) {
    	Date d1= new Date(12,25,2000,true);
    	Date d2= new Date(12,25,2000,true);
    	Date d3= new Date(6,29,2004,true);
    	Date d4= new Date(11,2,1969,true);
    	Date d5= new Date(5,16,2003,true);
    	//System.out.println(d1.hashCode());
    	//System.out.println(d2.hashCode());
     	//System.out.println(d2.equals(d1));
    	
    	LinkedList<Date> list = new LinkedList <Date>();
    	list.add(d1);
     	list.add(d2);
     	list.add(d3);
     	list.add(d1);
     	list.add(d1);
     	System.out.println(list);
     	
     	HashSet<Date> set = new HashSet <Date>();
    	set.add(d1);
     	set.add(d2);
     	set.add(d3);
     	set.add(d1);
     	set.add(d1);
     	System.out.println(set);

    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	

}
