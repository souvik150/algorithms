import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Strobo {
    public static boolean isStrobo(String i){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('8', '8');
        map.put('0', '0');

        int l = 0, r = i.length() - 1;

        while(l < r){
            if(!map.containsKey(i.charAt(l))) return false;
            if(map.get(i.charAt(l)) != i.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        if(isStrobo(a)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
