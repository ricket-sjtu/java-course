public class Temperatures {

    public static void main(String[] args) {

        double bodyTemp = fToC(98.6);
        double freezing = fToC(32);

        System.out.println("The normal body temperature (98.6F) is " + bodyTemp + "C");
        System.out.println("The freezing temperature (32F) is " + freezing + "C");

    } 

    public static double fToC(double tempF) {
        return (tempF - 32) * 5.0 / 9.0;
    }   
}
