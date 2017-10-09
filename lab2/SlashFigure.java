public class SlashFigure {
    public static void main(String[] args) {
        int size = 7;
        for (int i=1; i<=size; i++) {
            for (int j=1; j<=2*i-2; j++) {
                System.out.print("\\");
            }
            for (int j=1; j<=26-4*i; j++) {
                System.out.print("!");
            }
            for (int j=1; j<=2*i-2; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }

    }
}
