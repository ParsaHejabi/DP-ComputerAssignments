public class Adapter extends Triangle implements IFoursquare{
    @Override
    public double FoursquareSurface(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        return (Triangle.surface(x1, y1, x2, y2, x3, y3) + Triangle.surface(x1, y1, x4, y4, x3, y3));
    }
}
