
public class MyDateTime {

	MyDate date;
	MyTime time;
	

	public MyDateTime(MyDate date, MyTime time) {
		this.date =  date;
		this.time = time;
	}

	public void incrementDay() {
		date.incrementDay();
		
	}

	public void incrementHour() {
		incrementHour(1);
	}

	public void decrementHour(int i) {
		int dayDiff = i / 24;
		int hourDiff = i % 24;
	if(i >= 24) {
		if(dayDiff == 0) {
			decrementDay(dayDiff);
		}
		time.hour -= hourDiff;
	}else {
		decrementDay(dayDiff);
	}		
}

	public void incrementMinute(int i) {
		// TODO Auto-generated method stub
		
	}

	public void incrementYear(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementDay() {
		date.decrementDay();
	}

	public void decrementYear() {
		// TODO Auto-generated method stub
		
	}

	public void decrementMonth() {
		// TODO Auto-generated method stub
		
	}

	public void incrementDay(int i) {
		date.incrementDay(i);
	}

	public void decrementMonth(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementDay(int i) {
		date.decrementDay(i);
	}

	public void incrementMonth(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementYear(int i) {
		// TODO Auto-generated method stub
		
	}

	public void incrementMonth() {
		// TODO Auto-generated method stub
		
	}

	public void incrementYear() {
		// TODO Auto-generated method stub
		
	}

	public boolean isBefore(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfter(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public void incrementHour(int i) {
		if(i >= 24) {
			int dayDiff = i  / 24;
			int hourDiff= i % 24;
			time.hour += hourDiff;
			incrementDay(dayDiff);
			if(time.hour == 24) {
				time.hour = 0;
				incrementDay();
			}
		}else {
			time.hour++;
		}
	}
	
	public void decrementMinute(int i) {
		// TODO Auto-generated method stub
		
	}

	public String dayTimeDifference(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return date + " " + time;
	}
}
