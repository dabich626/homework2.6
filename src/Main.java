import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    private static void task4() {
    }

    private static void task3() {

        List<String> words = new ArrayList<>(List.of("бла","бла", "девять", "восемь", "семь", "семь"));

        for(ArrayList word : words.containsAll()){

            if (words.contains(words)){
                return;
            }
        }
    }

    private static void task2() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        if (nums.size() % 2 == 0){

nums = nums + 2;
            System.out.println(nums);
        }

    }

    private static void task1() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        
        if (nums.size() % 2 == 0){

            System.out.println(nums);
        }
    }
    
    
}