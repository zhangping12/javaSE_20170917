package cn.edu.tsinghua.javase.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * 哈希表 java.util.Hashtable
   Hashtable 中 key 是唯一的
 */
public class HashtableTest {
    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>(); // K-key 键 V-value 值

        hashtable.put("k1", "v1");
        hashtable.put("k2", "v2");
        hashtable.put("k3", "v3");
        hashtable.put("k4", "v4");

        System.out.println(hashtable.get("k3"));//v3

        System.out.println(hashtable.size());//4

        System.out.println(hashtable.remove("k3"));//v3代表移除的

//        hashtable.clear();//整个移除，size为0
        System.out.println(hashtable.size());//3

        for (String s : hashtable.keySet()) {
            System.out.println(s + "->" + hashtable.get(s));//k4->v4
        }                                                   //k2->v2
                                                            //k1->v1


        for (String s : hashtable.values()) {//值v4
            System.out.println(s);           // v2
                                             // v1
        }

        /*
          k4->v4
          k2->v2
          k1->v1
         */
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println(hashtable.toString());//{k4=v4, k2=v2, k1=v1}

        System.out.println(hashtable.containsKey("k3"));//false

        System.out.println(hashtable.containsValue("v3"));//false containsValue和contains都是获取的value值
        System.out.println(hashtable.contains("v3"));//false

        System.out.println(hashtable.size());//3
        hashtable.put("k1", "v11");
        System.out.println(hashtable.size()); // 3

        /*
        k4->v4
        k2->v2
        k1->v11
         */
        for (String s : hashtable.keySet()) {
            System.out.println(s + "->"+ hashtable.get(s));
        }

        Hashtable<String, Integer> hashtable1 = new Hashtable<>();
    }
}