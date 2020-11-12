import java.util.stream.IntStream;

public class Task1 {

    public int returnMissingInteger(int K[], int N){
        for(int i = 1; i <= N+1; i++){
            if(!contains(K, i)){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(int K[],int num){
        boolean result = IntStream.of(K).anyMatch(x -> x == num);
        return result;
    }
    public static void main(String[] args) {
        int N = 4;
        int K [] = {3,5,4,1};
        Task1 task1 = new Task1();
        int missingVal = task1.returnMissingInteger(K, N);
        System.out.println("Missing integer is "+missingVal);
    }

}
