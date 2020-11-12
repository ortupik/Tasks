public class Task2 {
    public String transformString(String S){
        char strArr[] = S.toCharArray();
        int len = strArr.length;
        int parts = len / 4;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < parts; i++){
            char[] input = S.substring(i * 4,(i + 1)*4).toCharArray();
            char[] result = new char[input.length];
            for (int j = 0; j < input.length; j++){
                result[j] = input[input.length - j - 1];
            }
           sb.append(result);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S =  "Lorem at";
        Task2 task2 = new Task2();
        String result = task2.transformString(S);
        System.out.println(S+" reversed is "+result);
    }
}

