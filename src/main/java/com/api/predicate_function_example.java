package com.api;

import java.util.Arrays;
import java.util.*;
/*
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;
import java.util.List;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
*/

/*
public class A {
    public static void main(String[] args) {
//    Predicate Functional Interface

//It takes input & produces boolean value output
    Predicate<Integer> val=x->x>300;
   boolean result= val.test(100);
   System.out.println(result);

}}
*/

/*

public class A {
    public static void main(String[] args) {
//    Predicate Functional Interface

//It takes input & produces boolean value output
        Predicate<String> val= x->x.equals("mike");
        System.out.println(val);
        boolean result= val.test("mike");
        System.out.println(result);

    }}

*/

/*

public class A{
    public static void main(String[] args) {

        List<Integer> data= Arrays.asList(10,45,6,97,56,45);
        List<Integer> newData=data.stream().filter(x->x>50).collect(Collectors.toList());
        System.out.println(newData);
    }
} */

/*

 public class predicate_function_example {
     public String userName, mailId;
     public long phoneNo;

     public A(String userName, String mailId, long phoneNo) {
         this.userName = userName;
         this.mailId = mailId;
         this.phoneNo = phoneNo;
     }

     @Override
     public String toString() {
         return "userName:" + userName + "MailId:" + mailId + "Phone number:" + phoneNo;
     }


     public static void main(String[] args) {
 A user =new A("nitish","nitish@gmail.com",7765974067l);
 System.out.println(user.toString());
 Integer ob1=121;
 System.out.println(ob1);
     }
 }


*/
/*
import java.util.Collection;
public class predicate_function_example{


    public static void main(String[] args) {
        Integer a[]={9,5,6,7};

    Stream<Integer> sm=Arrays.stream(a);
        System.out.println(sm);

}}


*/
