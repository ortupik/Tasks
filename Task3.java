public class Task3 {
    public static int findNumberWays(int n) {
        if (n == 1 || n == 0){
            return 1;
        }else if (n == 2){
            return 2;
        }else{
            return findNumberWays(n - 2) + findNumberWays(n - 1);
        }
    }
    public static void main(String[] args) {
        int numStones = 20;
        int numWays = findNumberWays(numStones);
        System.out.println("Number of ways: "+numWays);
    }
}
