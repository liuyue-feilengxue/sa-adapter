package cn.edu.scau.sec.tangxuexi.adapter;

public class ObjectAdapter implements Target{

	@Override
	public void printDate(String calendarString) {
		//将string转成三个int
		String[] calendarStrings = calendarString.split("\\.");
		int year = Integer.parseInt(calendarStrings[0]);
		int month = Integer.parseInt(calendarStrings[1]);
		int day = Integer.parseInt(calendarStrings[2]);
		//成为对象
		Adaptee adaptee = new Adaptee();
		System.out.println("对象适配器：");
		adaptee.printCalendar(year,month,day);
	}
}