package abstr;

abstract class Shape{
	abstract public void calculateArea();
	
}

class SquareShape extends  Shape{
      float ans;
	public SquareShape(float f) {
		// TODO Auto-generated constructor stub
		ans = f*f;
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of square is " +ans+ " sqr units");
	}
	
	
}
class Rectangle extends  Shape{
    float ans1;
	public Rectangle(float f, float g) {
		ans1 = f*g;	
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is " +ans1+ " sqr units");
	}
	
}

public class DiffShape {

	public static void main(String[] args) {
		SquareShape ss = new SquareShape(4.4f);
		ss.calculateArea();
		Rectangle rr = new Rectangle(4.2f,2.1f);
		rr.calculateArea();
		
		Shape s;
		s = new SquareShape(2.2f);
		s.calculateArea();
		s = new Rectangle(2.2f, 2.2f);
		s.calculateArea();
		
		// TODO Auto-generated method stub

	}

}
