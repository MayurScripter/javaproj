class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x");
        this.x = x;
    }
    
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}


public class inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(4);
        System.out.println(b.getX());

        derived d= new derived();
        d.setY(6);
        System.out.println(d.getY());
        
    }
    
}
