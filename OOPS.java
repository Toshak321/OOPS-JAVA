public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // create object
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}

class Pen { // class 
    String color;

    void setColor(String newColor) {  //constructor
        color = newColor;
    }
}