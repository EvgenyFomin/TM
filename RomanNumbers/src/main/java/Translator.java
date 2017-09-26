import java.io.*;
import java.util.*;


public class Translator {

    private HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();


    Translator() {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    private int decimal(String roman) {
        int res = 0;
        int current = 0;
        int cifer;
        for (int i = roman.length()-1; i > -1; i--) {
            try {
                cifer = dictionary.get(roman.charAt(i));
                if (cifer < current) res -= cifer;
                else {
                    res += cifer;
                    current = cifer;
                }

            } catch (NullPointerException e) {
                System.err.println("Введен невозможный символ");
                System.exit(1);

            }

        }
        return res;
    }

    public String toDecimal(InputStream input) {
        StringBuilder res = new StringBuilder();
        Scanner in = new Scanner(input);
        String current;
        String help;
        help = in.nextLine();
        help = help.trim();
        while (help.length() != 0) {
            current = help.substring(0, (help.indexOf(" ") == -1) ? help.length() : help.indexOf(" "));
            if (current.equals("et")) res.append('+');
            else res.append(decimal(current));
            help = help.substring((help.indexOf(" ")) == -1 ? help.length() : help.indexOf(" ") + 1, help.length());

        }
        res.append("\n");
        return res.toString();
    }

    public String toRoman(int decimal) {
        StringBuilder res = new StringBuilder();
        List<Integer> values = new ArrayList<Integer>(dictionary.values());
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
            }
        });


        for (Integer cifer: values) {
            while (decimal >= cifer) {
                decimal -= cifer;
                res.append(getKeyByValue(dictionary, cifer));
            }
        }
        return res.toString();
    }

}
