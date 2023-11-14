
public class Circle extends Shape
{
    private int _amountOfEdges;
    //private String _color;
    private double _radius;
    
    public Circle(int amountOfEdges, String color, double radius)
    {
        super(amountOfEdges, color);
        _amountOfEdges = amountOfEdges;
        //_color = color;
        _radius = radius;
    }
    
    public String toString()
    {
        //return "Amount of edges in the shape is " + _amountOfEdges +
        //", color of the shape is " + _color +
        return super.toString() + ", the radius is " + _radius;
    }
    
    public double getArea()
    {
        return _radius * _radius * Math.PI;
    }
}
