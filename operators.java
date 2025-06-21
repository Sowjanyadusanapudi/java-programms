/*1. class operators
{
public static void main (String args[])
{
 int a=3;
 int b=7;
 System.out.println(a+b);
 System.out.println(a-b);
 System.out.println(a*b);
 System.out.println(a/b);
}
}
output: 10
        -4
        21
         0    */


/*2. class operators
{
public static void main(String[] args)
{
int i=14;
System.out.println(i++);
System.out.println(++i);
System.out.println(i--);
System.out.println(--i);
}
}
output: 14
        16
        16
        14  */


/*3. public class operators
{
public static void main(String[] args)
{
int a=14;
int b=20;
System.out.println((a==b)?b:a);
}
}
output: 14  */


/* 4. import java.io.*;
class operators
{
public static void main(String[] args)
{
int a=14;
int b=20;
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<=b);
System.out.println(a>=b);
}
}
output: false
        true
        true
        false
        true
        false  */


/*5. import  java.io.*;
class operators
{
public static void main(String[] args)
{
int a=3;
int b=4;

System.out.println((a<b)&&(a<b));
System.out.println((a<b)||(a<b));
}
}
output: true
        true   */


/*6. class operators
{
public static void main (String args[])
{
 int a=3;
 int b=7;
 System.out.println(a<b);
 System.out.println(a<=b);
 System.out.println(a>b);
 System.out.println(a>=b);
}
}
output: true
        true
        false
        false */


/*7. import java.util.*;
public class operators
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  if(a==b&&b==c)
  {
   System.out.println("All are same");
  }
  else
  {
   if(a>b&&a>c)
  {
   System.out.println(a+" is large");
  }
  else if(b>c)
  {
   System.out.println(b+" is large");
  }
  else
  {
   System.out.println(c+" is large");
  }
  if(a<b&&a<c)
  {
   System.out.println(a+" is small");
  }
  else if(b<c)
  {
   System.out.println(b+" is small");
  }
  else
  {
   System.out.println(c+" is small");
  }
 }
 }
}
output: 14
        20
        15
        20 is large
        14 is small     */
