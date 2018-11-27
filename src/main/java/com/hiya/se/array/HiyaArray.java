package com.hiya.se.array;

import java.util.Arrays;
import java.util.List;

public class HiyaArray
{
    public static void main(String[] args)
    {
        String s[] = new String[10];
        String[] s1 = new String[10];
        
        int a[] = {1,3,6,0,2,8,10};
        int []a1 = {1,3,6,0,2,8,10};
        
        
        String s2[] = new String[10];
        String t[] = s2;
        System.out.println(t.length);
        
        //toString,把数组按照字符串内容输出 
        System.out.println(Arrays.toString(a1));
        
        //fill方法：把整个数组里的每一个元素的值进行替换为val
        Arrays .fill(a1, 3);
        System.out.println(Arrays.toString(a1));
        
        int []a5={10,20,30};
        int []b5={10,20,30};
        int []c5={1,2,3};
        boolean isEqual=Arrays.equals(a5,b5);
        System.out.println(isEqual);
        System.out.println(Arrays.equals(a5,c5));
        
        Arrays.sort(b5);
        
        //BinarySearch:找到元素在数组当中的下标。
        int index=Arrays.binarySearch(a5,20);
        
        //把数组转换成 list
        List l1 =  Arrays.asList(a5);
       
        //把 list转换成数组
       Object []a6=  l1.toArray();
       
       
       Arrays.asList(a5).stream().forEach(e -> {System.out.println(e);});
       Arrays.asList(a5).stream().forEach(System.out::println);
       
       
    }
}
