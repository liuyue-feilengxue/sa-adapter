package cn.edu.scau.sec.tangxuexi.client;

import cn.edu.scau.sec.tangxuexi.adapter.ClassAdapter;
import cn.edu.scau.sec.tangxuexi.adapter.ObjectAdapter;
import cn.edu.scau.sec.tangxuexi.adapter.Target;

public class AdapterClient {

	public static void main(String[] args) {
		//����������
		Target objectAdapter = new ObjectAdapter();
		objectAdapter.printDate("2020.11.22");
		//��������
		Target classAdapter = new ClassAdapter();
		classAdapter.printDate("2020.11.23");
	}
}