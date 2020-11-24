package cn.edu.scau.sec.tangxuexi.adapter;


public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void printDate(String calendarString) {
		// 将calendarString转换为三个int
		String[] calendarStrings = calendarString.split("\\.");
		int year = Integer.parseInt(calendarStrings[0]);
		int month = Integer.parseInt(calendarStrings[1]);
		int day = Integer.parseInt(calendarStrings[2]);
		//继承
		System.out.println("类适配器：");
		printCalendar(year,month,day);
	}
}