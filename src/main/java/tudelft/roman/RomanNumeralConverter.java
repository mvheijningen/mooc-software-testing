package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String numeral) {
        String s = numeral.toUpperCase();
        int result = 0;
        int sameCharCount = 1;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;
            char lastChar = i>0 ? s.charAt(i-1) : 'a';
            if(toString().charAt(i)==lastChar) {
                sameCharCount+=1;
            } else {
                sameCharCount=1;
            }
            if(sameCharCount>3) {
                return -1;
            }

            if(currentNumber >= next)
                result += currentNumber;
            else {
                if (sameCharCount > 1) {
                    return -1;
                }
                result -= currentNumber;
            }
        }

        return result;
    }

    public static void main (String[] args) {
        RomanNumeralConverter rn = new RomanNumeralConverter();
        System.out.print(rn.convert("IIIIIV"));
    }
}
