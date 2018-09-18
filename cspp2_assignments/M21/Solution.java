import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;

class FoodLog {
	private	String foodName;
	private int foodQuantity;
	private String date;
	private String time;

	public FoodLog(String ftime, int fquantity, String fname, String fdate) {
		foodName = fname;
		foodQuantity = fquantity;
		date = fdate;
		time = ftime;
	}
	public String getFoodName() {
		return this.foodName;
	}
	public String getFoodDate() {
		return this.date;
	}
	public int getFoodQuantity() {
		return this.foodQuantity;
	}
	public String getFoodTime() {
		return this.time;
	}
	public String toString() {
		String s = "Food" + "\n";
		s += "Date:" + date + "\n";
		s += "Time:" + time + "\n";
		s += "Name:" + foodName + "\n";
		s += "Quantity:" + foodQuantity + "\n";
		return s;
	}
}

class WaterLog {
	private int waterQuantity;
	private String waterDateTime;

	public WaterLog(int wQuantity, String wdateTime) {
		waterQuantity = wQuantity;
		waterDateTime = wdateTime;
	}
	public int getWaterQuantity() {
		return this.waterQuantity;
	}
	public String getWaterTime() {
		return this.waterDateTime;
	}
	public String toString() {
		String s = "Water" + "\n";
		s += "Date:" + waterDateTime + "\n";
		s += "Quantity:" + waterQuantity + "ml" + "\n"; 
		return s;
	}

}

class SleepLog {
	private String sleepStart;
	private String sleepEnd;
	private String date;
	SleepLog(String start, String end, String sdate) {
		sleepStart = start;
		sleepEnd = end;
		date = sdate;
	}
	public String getSleepStart() {
		return this.sleepStart;
	}
	public String getSleepDate() {
		return this.date;
	}
	public String getSleepEnd() {
		return this.sleepEnd;
	}
	public String toString() {
		String s = "Sleep" + "\n";
		s += "Date : " + date + "\n";
		s += "Starttime : " + sleepStart + "\n";
		s += "Endtime : " + sleepEnd + "\n";
		return s;
	}

}
class ActivityLog {
	private String activityName;
	private String activityDate;
	private String notes;
	private String activityStartTime;
	private String activityEndTime;
	public ActivityLog(String aname, String anotes, String adate, String aStartTime, String aEndTime) {
		activityName = aname;
		notes = anotes;
		activityDate = adate;
		activityStartTime = aStartTime;
		activityEndTime = aEndTime;

	}
	public String getActivityName() {
		return this.activityName;
	}
	public String getActivityNotes() {
		return this.notes;
	}
	public String getActivityDate() {
		return this.activityDate;
	}
	public String getActivityStartTime() {
		return this.activityStartTime;
	}
	public String getActivityEndTime() {
		return this.activityEndTime;
	}
	public String toString() {
		String s = "PhysicalActivity" + "\n";
		s += "Name : " + activityName + "\n";
		s += "Notes : " + notes + "\n";
		s += "Date : " + activityDate + "\n";
		s += "Starttime : " + activityStartTime + "\n";
		s += "Endtime : " + activityEndTime + "\n";
		return s;
	}


}
class WeightLog {
	private String weight;
	private String fat;
	private String weightDate;
	private String weightTime;
	
	WeightLog(String wt, String fatt, String wdate, String wTime) {
		weight = wt;
		weightTime = wTime;
		fat =fatt;
		weightDate = wdate;
	}
	public String getWeight() {
		return this.weight;
	}
	public String getWeightTime() {
		return this.weightTime;
	}
	public String getWeightDate() {
		return this.weightDate;
	}
	public String getFat() {
		return this.fat;
	}
	public String toString() {
		String s = "Weight" + "\n";
		s += "Date:" + weightDate + "\n";
		s += "Time:" + weightTime + "\n";
		s += "Weight:" + weight + "\n";
		s += "Fat:" + fat + "\n";
		return s;
	}
}

class FitByte {
	private List<ActivityLog> activitiesLogs;
	private List<FoodLog> foodLogs;
	private List<WaterLog> waterLogs;
	private List<SleepLog> sleepLogs;
	private List<WeightLog> weightLogs;

	FitByte() {
		activitiesLogs = new List<ActivityLog>();
		foodLogs = new List<FoodLog>();
		waterLogs = new List<WaterLog>();
		sleepLogs = new List<SleepLog>();
		weightLogs = new List<WeightLog>();
	}
	public List<WaterLog> getWaterLog() {
		return waterLogs;
	}
	// public WaterLog getWaterLog(int index) {
	// 	return waterLogs.get(index);
	// }
	public List<SleepLog> getSleepLog() {
		return sleepLogs;
	}
	public List<FoodLog> getFoodLog() {
		return foodLogs;
	}
	public List<ActivityLog> getActivityLog() {
		return activitiesLogs;
	}
	public List<WeightLog> getWeightLog() {
		return weightLogs;
	}
	public void addFood(FoodLog food) {
		foodLogs.add(food);
	}

	public void addWater(WaterLog water) {
		waterLogs.add(water);
	}

	public void addSleep(SleepLog sleep) {
		sleepLogs.add(sleep);
	}

	public void addActivity(ActivityLog act) {
		activitiesLogs.add(act);
	}

	public void addWeight(WeightLog weight) {
		weightLogs.add(weight);
	}
	public void getSummary() {
		System.out.print(getFoodLog());
		System.out.print(getWaterLog());
		System.out.print(getActivityLog());
		System.out.print(getWeightLog());
		System.out.print(getSleepLog());
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FitByte input = new FitByte();
		while (scan.hasNext()) {
			String[] line = scan.nextLine().split(" ");
			switch (line[0]) {
				case "Food":
					String[] tokens = line[1].split(",");
					FoodLog food = new FoodLog(tokens[0],
						Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
					input.addFood(food);
				break;
				case "Water":
					tokens = line[1].split(",");
					WaterLog water = new WaterLog(Integer.parseInt(tokens[0]), tokens[1]);
					input.addWater(water);
				break;
				case "PhysicalActivity":
					tokens = line[1].split(",");
					ActivityLog activity = new ActivityLog(tokens[0], tokens[1],
						tokens[2], tokens[3], tokens[4]);
					input.addActivity(activity);
				break;
				case "Sleep":
					tokens = line[1].split(",");
					SleepLog sleep = new SleepLog(tokens[0], tokens[1], tokens[2]);
					input.addSleep(sleep);
				break;
				case "Weight":
					tokens = line[1].split(",");
					WeightLog weight = new WeightLog(tokens[0], tokens[1], tokens[2], tokens[3]);
					input.addWeight(weight);
				break;
				case "Foodlog":
					System.out.println(input.getFoodLog());
				break;
				case "Waterlog":
					System.out.println(input.getWaterLog());
				break;
				case "PhysicalActivitylog":
					System.out.println(input.getActivityLog());
				break;
				case "Weightlog":
					System.out.println(input.getWeightLog());
				break;
				case "Sleeplog":
					System.out.println(input.getSleepLog());
				break;
				case "Summary":
					// System.out.println(input.getSummary());
				input.getSummary();
				break;
				default:
				break;

			}
		}
	}
}