import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i < n+1; i++){
            if (i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            } else if (i%3==0){
                answer.add("Fizz");
            } else if (i%5==0){
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
