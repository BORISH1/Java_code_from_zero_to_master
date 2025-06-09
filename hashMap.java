import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Borish",234);
        map.put("Alex",235);
        map.put("Poirei",241);
        map.put("Lenil",123);
        System.out.println(map);
        System.out.println(map.get("Borish"));
        System.out.println(map.containsKey("Borish"));
    }
}
