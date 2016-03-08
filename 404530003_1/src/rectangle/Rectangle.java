package rectangle;
public class Rectangle 
{
	public static void main(String[] args) 
	{
            RectangleTester Rec1 = new RectangleTester(18,57,15,25);
            RectangleTester Rec2 = new RectangleTester(47,60,0,12);
            System.out.println(Rec1.toString()+"\n"+"Area = "+Rec1.getWidth()*Rec1.getHeight()+"\n"+"perimeter = "+2*(Rec1.getWidth()+Rec1.getHeight())+"\n\n"+
            Rec2.toString()+"\n"+"Area = "+Rec2.getWidth()*Rec2.getHeight()+"\n"+"perimeter = "+2*(Rec2.getWidth()+Rec2.getHeight())+"\n\n"+"End of Output!");
	}
}
class RectangleTester
{
    public double height;
    public double width;
    public double X;
    public double Y;
    public RectangleTester(double h,double w,double x,double y)
    {
        height = h;
        width = w;
        X = x;
        Y = y;
    }
    public double getWidth()
    {
    	return width;
    }
    public double getHeight()
    {
    	return height;
    }
    public String toString()
    {
    	return "java.Rectangle[x="+X+",y="+Y+",width="+width+",height="+height+"]";
    }
}
