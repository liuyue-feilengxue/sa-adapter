package cn.edu.scau.sec.tangxuexi.adapter;

public class ObjectAdapter implements Target{

	@Override
	public void printDate(String calendarString) {
		//��stringת������int
		String[] calendarStrings = calendarString.split("\\.");
		int year = Integer.parseInt(calendarStrings[0]);
		int month = Integer.parseInt(calendarStrings[1]);
		int day = Integer.parseInt(calendarStrings[2]);
		//��Ϊ����
		Adaptee adaptee = new Adaptee();
		System.out.println("������������");
		adaptee.printCalendar(year,month,day);
	}
}