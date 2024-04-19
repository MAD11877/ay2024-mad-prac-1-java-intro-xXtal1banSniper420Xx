import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //System.out.print("Enter the number of integers you will input: ");
        int count = in.nextInt();
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        //System.out.println("Enter the integers: ");
        for (int i = 0; i < count; i++) {
            int number = in.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        int mode = 0;
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        System.out.println(mode);
        
        in.close();
    }
}

