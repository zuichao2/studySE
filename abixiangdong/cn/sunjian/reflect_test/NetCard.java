package cn.sunjian.reflect_test;

public class NetCard implements PCI {

	@Override
	public void open() {
		System.out.println("net open..");
	}

	@Override
	public void close() {
		System.out.println("net close...");
	}

}
