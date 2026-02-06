package day8;

public class ColorTV extends TV {
	private static final String size = null;
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	void printProperty() {
		System.out.println(getSize() +"인치 "+color+"컬러 ");
	}
}