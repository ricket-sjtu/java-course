public class Mysteries3 {
    public static void main(String[] args) {
        mystery3(3, 20);
    }

    public static void mystery3(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }
}
