import java.util.HashMap;
import java.util.Map;

public class String13 {
    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0 ;
        int prevalue = 0 ;

        for(int i = s.length() - 1 ; i>=0 ;i--){
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

             // If the current value is less than the previous value, subtract it
            if (currentValue < prevalue) {
                result =result - currentValue;
            }
            else { // Otherwise, add it to the result
                result = result + currentValue ;
            }

            // Update the previous value
            prevalue = currentValue ;
        }
        return result ;
    }
}
