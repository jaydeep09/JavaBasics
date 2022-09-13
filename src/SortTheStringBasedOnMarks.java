import java.util.*;

import static java.util.stream.Collectors.toMap;

public class SortTheStringBasedOnMarks {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("harsh95");
        ls.add("megha93");
        ls.add("shivam99");
        ls.add("parag44");
  System.out.println(sortBasedOnMarks(ls));


    }

    static List<String> sortBasedOnMarks(ArrayList<String> A)
    {
    List<String> res = new ArrayList<>();
    HashMap<String, Integer> hs = new HashMap<>();
        for(int i =0;i<A.size();i++){
        String s = A.get(i);
        int marks = (s.length()-2)*10 + s.length()-1;
        hs.put(s, marks);
    }
        Comparator<Map.Entry<String, Integer>> val =
                Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.<String,Integer>comparingByKey().reversed());
        System.out.println(val);

    Map<String, Integer> hsres = hs.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        for(Map.Entry<String, Integer> entry: hsres.entrySet()){
        res.add(entry.getKey());
    }
        return res;
    }
}
