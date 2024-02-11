class cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
}


public class getset {
    public static void main(final String[] args) {
        cylinder myCylinder= new cylinder();
        myCylinder.setHeight(12);
        int h= myCylinder.getHeight();
        System.out.println(h);

        
    }
    
}
