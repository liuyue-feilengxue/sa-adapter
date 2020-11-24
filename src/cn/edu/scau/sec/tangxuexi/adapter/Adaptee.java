package cn.edu.scau.sec.tangxuexi.adapter;


public class Adaptee {
	public void printCalendar(int year,int month,int day) {
		System.out.println("你好，我是被适配的类，你输入的日期是："
							+ year + "年" 
							+month +"月" 
							+ day +"日");
	}

}
