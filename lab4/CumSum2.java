public class CumSum2 {
    public static void main(String[] args) {
        int low = (int)(args[1]);
        int high = (int)(args[2]);
        int sum = 0;
        for (int i=low; i<=high; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
