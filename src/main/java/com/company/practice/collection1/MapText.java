package com.company.practice.collection1;

import com.company.practice.collection1.Emp;

import java.util.*;

/**
 * Created by Woody on 2016/9/26.
 */
public class MapText {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        Emp emp = new Emp("001","张三");
        Emp emp2 = new Emp("005","李四");
        Emp emp3 = new Emp("004","王一");
        map.put(emp.getE_id(),emp.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());
        map.put(emp3.getE_id(),emp3.getE_name());
        Set<String>set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while(it.hasNext()){
            String str = it.next();//可不用写成（String）it.next()，下同
            String name = map.get(str);
            System.out.println(str+" "+name);
        }
        TreeMap<String,String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator<String>iter = treemap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，key对象升序：");
        while(iter.hasNext()){
            String str = iter.next();
            String name = treemap.get(str);
            System.out.println(str+" "+name);
        }
    }
}
