public class TASalary {
    public static void main(String[] args) {
        double hours = 11;
        double salary = 4.00;
        System.out.println("TA will be paid " + pay(salary, hours));
    }

    public static double pay(double salary, double time) {
        double pay;
        if (time < 8) {
            pay = salary * time;
        } else {
            pay = salary * 8 + salary * 1.50 * (time-8);
        }
        return pay;
    }

}
