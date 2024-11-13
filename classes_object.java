public class classes_object {

    int noOFwheels ;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfseats;
    public void drive(){
        System.out.println("car is driving");
        currentFuelInLitres--;
    }
    public void addFuel(float fuel){
        currentFuelInLitres+=fuel;
    }
    public float currentFuelLevel(){
        return currentFuelInLitres;
    }
//    public static void main(String[] args) {
//
//    }
public static void main(String[] args) {
        String s2 = "hemant";
        String s3 = "sikarwar";
    String s = String.join("/", s2,s3);
    String Name =  (s2+s3);
    System.out.println(Name);
    System.out.println(s);
    String new1 = "";
    for (int i = s2.length()-1; i >=0 ; i--) {
        new1 += s2.charAt(i);
    }
    System.out.println(new1);
}
}
