/*
[A]100
[TA's advise]
1.第13行印出的方法基本上沒有什麼問題, 但這樣寫對於程式的易讀性其實不是很好(如果今天你突然發現這一行某地方有錯可能會花上比較多的時間去debug)
所以如果是我的話, 會建議將計算與印出來的字串分開寫.
2.public是一個很開放性的修飾字, 若你想寫出比較精準的程式碼, 或許可以查查看public、protected、private與不寫之間的差異, 若全部都設定成public的確很好用
但如果今天開發的是一個比較有資安性的程式, 這樣會安全嗎?
3.你寫的很好.
*/
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
