public class Krug {
    private double radius;
Krug(double radius)
{
 this.radius=radius;
}
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double diametr (double radius)
    {
        return radius*2;
    }
    public  double dlina(double radius)
    {
        return 2*Math.PI*radius;
    }
    public double Plosh(double radius)
    {
        return Math.PI*radius*radius;
    }
}
