/*  1. public class javabasics
{
 public static void main(String[] args)
{
System.out.println("my name is Sowjanya");
}
}

output: my name is Sowjanya   */


/* 2. public  class javabasics
{
static void printMyName()
{
System.out.println("My name is Sowji");
}
public static void main(String[] args)
{
printMyName();
}
}

output:My name is Sowji  */



/* 3. public class javabasics
{
public static void main(String[] args)
{
System.out.println("It shows the single line comment");
System.out.println("It shows the mulit line comment");
System.out.println("It shows the documentation comment");  
}
}

output: It shows the single line comment
        It shows the mulit line comment
        It shows the documentation comment   */


/* 4. import java.io.*;
import java.util.Scanner;
public class javabasics
{
static byte b;
static short s;
static int i;
static long l;
static float f;
static double d;
static char c;
static boolean bo;
public static void main(String[] args)
{
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(c);
System.out.println(bo);
}
}

output: 0
        0
        0
        0
        0.0
        0.0  */


/* 5. public class javabasics
{
int number=10;
public void showNumber()
{
int number=20;
System.out.println("local number:"+number);
System.out.println("global number:"+this.number);
}
public static void main(String[] args)
{
javabasics obj=new javabasics();
obj.showNumber();
}
}

output: local number:20
        global number:10  */



/* 6. public class javabasics
{
void sayHello()
{
System.out.println("Hello World");
}
public static void main(String[] args)
{
javabasics obj=new javabasics();
obj.sayHello();
}
}

output:  Hello World   */
