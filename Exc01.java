
public class Exc01
{
    public Exc01()
    {
    }

    public static void main(String [] args)
    {
        /*Shape s1 = new Shape(10, "blue");
        System.out.println(s1.toString());*/
        
        Shape s2 = new Circle(1, "yellow", 2);
        System.out.println(s2.toString());
        
        Shape s3 = new Rectangle(4, "red", 5, 6);
        System.out.println(((Rectangle) s3).getArea());
        
    }
}
