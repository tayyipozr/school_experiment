
public class MyDate {

	int day, month, year;

	int[] max_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void incrementDay() {
		day++;
		if (day > max_days[month - 1]) {
			if (month == 1 && inLeapYear())
				day = 29;
			else {
				day = 1;
				incrementMonth();
			}
		}
	}

	public void incrementDay(int i) {
		day += i;

	}

	public void decrementDay() {
		day--;
		if (day == 0) {
			decrementMonth();

			if (month == 2 && inLeapYear())
				day = 29;
			else {
				day = max_days[month - 1];
			}
		}
	}

	private boolean inLeapYear() {
		return year % 4 == 0;
	}

	public void decrementDay(int i) {
		if (day + (-i) <= 0 && day + (-i) > -30) {
			decrementMonth(1);
			day = max_days[month - 1];
		} else {
			day -= i;
		}
	}

	public void incrementYear() {
		year++;

	}

	public void incrementYear(int i) {
		year += i;
	}

	public void decrementYear() {
		year--;
		if (month == 2)
			decrementDay();
	}

	public void decrementYear(int i) {
		year -= i;

	}

	public void incrementMonth() {
		incrementMonth(1);
	}

	public void incrementMonth(int i) {
		int newMonth = (month + i) % 12;
		int yearDiff = 0;
		if (newMonth < 0) {
			newMonth += 12;
			yearDiff = -1;
		}
		yearDiff = (month + i) / 12;
		month = newMonth;
		incrementYear(yearDiff);
		if (inLeapYear() && month == 2) {
			day = 29;
		}
	}

	public void decrementMonth() {
		decrementMonth(1);
	}

	public void decrementMonth(int i) {
		if (month == 12 || month + (-i) < 0) {
			incrementMonth(-i);
			decrementYear();
			day = max_days[month - 1];
		} else
			incrementMonth(-i);

	}

	public boolean isBefore(MyDate anotherDate) {
		if (year <= anotherDate.year) {
			if (month <= anotherDate.month) {
				if (day < anotherDate.day) {
					return true;
				}
			}
		}
		return false;
	}
	public int dayDifference(MyDate anotherDate) {
		int yearDiff = year - anotherDate.year;
		int monthDiff = month - anotherDate.month;
		int dayDiff = day - anotherDate.day;
		int sumDayOfMonth = 0;
		for(int i = 1; i <= monthDiff; i++) {
			sumDayOfMonth += max_days[month-(i+1)];
		}
		
		return yearDiff * 365 + sumDayOfMonth + dayDiff;	
	}

	public boolean isAfter(MyDate anotherDate) {
		if (year >= anotherDate.year) {
			if (month >= anotherDate.month) {
				if (day > anotherDate.day) {
					return true;
				}
			}
		}
		return false;
	}

	public String toString() {
		return "" + year + "-" + (month > 9 ? "" : "0") + month + "-" + (day > 9 ? "" : "0") + day;
	}

}
