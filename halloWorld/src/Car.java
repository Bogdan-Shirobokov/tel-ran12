public class Car {

    private String color; //public
    private String brand;
    private int hpower;


    public Car() {
        System.out.println("lada");
    }
public Car(String color, String brad, int hpower ){
    this.color = color;
    this.brand = brand;
    this.hpower = hpower;

    //this.dre11ive();
}
    public void dre11ive(int speed) {

        System.out.println("Das auto fahrt " + speed + " KM/h" );

    }

    public void dre11ive() {

        System.out.println("Das auto fahrt...." );

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHpower() {
        return hpower;
    }

    public void setHpower(int hpower) {
        this.hpower = hpower;
    }
}

