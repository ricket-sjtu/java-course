public class Season {
    public static void main(String[] args) {
        int month = 3;
        int date = 22;
        printSeason(month, date);
    }

    public static void printSeason(int month, int date) {
        //3.16-6.15: Spring
        //6.16-9.15: Summer
        //9.16-12.15: Fall
        //12.16-3.15: Winter
        if (month < 3) {
            System.out.println("Winter");
        } else if (month < 6) {
            if (month == 3 && date < 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Spring");
            }
        } else if (month < 9) {
            if (month == 6 && date < 16) {
                System.out.println("Spring");
            } else {
                System.out.println("Summer");
            }
        } else if (month < 12) {
            if (month == 9 && date < 16) {
                System.out.println("Summer");
            } else {
                System.out.println("Fall");
            }
        } else if (month==12 && date < 16){
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
        
    }
}
