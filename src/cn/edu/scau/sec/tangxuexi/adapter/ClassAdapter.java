package cn.edu.scau.sec.tangxuexi.adapter;


public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void printDate(String calendarString) {
		// ��calendarStringת��Ϊ����int
		String[] calendarStrings = calendarString.split("\\.");
		int year = Integer.parseInt(calendarStrings[0]);
		int month = Integer.parseInt(calendarStrings[1]);
		int day = Integer.parseInt(calendarStrings[2]);
		//�̳�
		System.out.println("����������");
		printCalendar(year,month,day);
	}
}