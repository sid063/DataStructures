package numbers;

public class AngleBetweenHourAndMinute {
	public static void main(String[] args) {
		calculateAngle(9, 60);
	}

	/*
	 * The angle made by hour hand in 12 hours is 360 degree or 60 degree per
	 * hour or 0.5 degree per minute. The angle made by minute hand per hour is
	 * 360 degree or 6 degree per min.
	 */
	private static void calculateAngle(int hour, int min) {
		if (hour > 12 || hour < 0 || min < 0 || min > 60) {
			System.out.println("Wrong input.");
			return;
		}

		if (hour == 12)
			hour = 0;
		if (min == 60)
			min = 0;

		int hourAngle = (60 * hour + min) / 2;
		int minAngle = min * 6;

		System.out.println("Angle is: " + getAngle(hourAngle, minAngle));
	}

	private static int getAngle(int hourAngle, int minAngle) {
		int diff;
		if (hourAngle > minAngle) {
			diff = hourAngle - minAngle;

		} else {
			diff = minAngle - hourAngle;
		}
		System.out.println("Diff: " + diff);
		if (diff > 360)
			return (diff - 360);
		return diff;
	}
}
