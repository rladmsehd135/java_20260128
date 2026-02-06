package day8;

public class IPTV extends ColorTV{
	String addr;
	
	public IPTV(String addr,int size, int color) {
		super(size,color);
		this.addr = addr;
		// TODO Auto-generated constructor stub
	}	

	@Override
	void printProperty() {
		System.out.print("나의 IPTV는 " + addr +"주소의 ");
		// TODO Auto-generated method stub
		super.printProperty();
	}

}
