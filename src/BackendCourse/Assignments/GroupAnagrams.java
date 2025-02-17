package BackendCourse.Assignments;


import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for( String str : strs ){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            // If the key (sortedStr) is not in the map, add it with a new list
            map.putIfAbsent(sortedStr, new ArrayList<>());
            // Add the original string to the corresponding list
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan"};
        List<List<String>> result = groupAnagrams(strs);

        for(List<String> ans:result){
            System.out.println(ans);
        }
    }
}