package cn.sunjian.reflect_test;


public class Mainboard {

	public void run(){
		System.out.println("main board run...");
	}
	
	public void usePCI(PCI p){
		if (p!=null) {
			p.open();
			p.close();
		}
	}

}
