package hwJava5;

import java.util.*;
import java.util.Map.Entry;

public class hwJTask1 {
    static String[] sort(String[] str, int n)
    {
        TreeMap<Integer, ArrayList<String> > map
            = new TreeMap<Integer, ArrayList<String> >();
  
        for (int i = 0; i < n; i++) {
  
            map.putIfAbsent(str[i].length(),
                            new ArrayList<String>());
            map.get(str[i].length()).add(str[i]);
        }
  
        int temp = 0;
  
        for (Entry<Integer, ArrayList<String> >
                 e : map.entrySet()) {
  
            for (int i = 0; i < e.getValue().size(); i++) {
  
                str[temp] = e.getValue().get(i);
                temp++;
            }
        }
        return str;
    }
    static void printArraystring(String str[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }
  
   
    public static void main(String args[])
    {
        String[] arr = { "если", "вы", "можете", "мечтать", "об", "этом", "вы", "можете", "это", "сделать" };
        int n = arr.length;
        arr = sort(arr, n);
        printArraystring(arr, n);
    }
}
