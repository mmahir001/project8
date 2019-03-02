package problem.solving;

public class FivonacciSeries {
    public static void main(String[] args) {

        int n = 10, next = 0, prev = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(next + " , ");
            int sum = next + prev;
            next = prev;
            prev = sum;
        }
    }
}