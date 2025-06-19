/*1. public class loops
         { 
          public static void main (String args[])
         { 
         String s= "Bright IT career";
         for(int n=0;n<10;n++)
         {
         System.out.println(s);
         }
         System.out.println();
         }
         }   
output:Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career
             Bright IT career*/
/*2. public class loops
         { 
          public static void main (String args[])
         { 
         int i=1;
         while(i<=20)
         {
         System.out.println(i);
         i++;
         }
         }
         }
output:1
             2
             3
             4
             5
             6
             7
             8
             9
            10
            11
            12
            13
            14
            15
            16
            17
            18
            19
            20    */
/*3.import java.util.Scanner;
public class loops
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);       
System.out.print("Enter a number a: ");
int a=sc.nextInt();
System.out.print("Enter a number b: ");
int b=sc.nextInt();   
if (a == b) 
{
System.out.println("a is equal to b");
} 
else 
{
System.out.println("a is not equal to b");     
}
}
}
output:Enter a number a: 15
              Enter a number b: 15
              a is equal to b */
/*4.public class loops
{
public static void main(String[] args)
{
for(int i=0;i<20;i++)
{
if(i%2==0)
{
System.out.println("The Even value:"+i);
}
else
{
System.out.println("The Odd value:"+i);
}
}
}
}
output:The Even value:0
             The Odd value:1
             The Even value:2
             The Odd value:3
             The Even value:4
             The Odd value:5
             The Even value:6
             The Odd value:7
             The Even value:8
             The Odd value:9
             The Even value:10
             The Odd value:11
             The Even value:12
             The Odd value:13
             The Even value:14
             The Odd value:15
             The Even value:16
             The Odd value:17
             The Even value:18
             The Odd value:19  */
/*5. import java.util.Scanner;
public class loops
 {
  public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if (a == b && b == c) 
{
 System.out.println("All are Equal");
 }
 else if (a > b && a > c)
 {
  System.out.println("The Largest number is"+ a);
  } 
else if (b > c) 
{
 System.out.println("The Largest number is "+b);
 }
else 
{
 System.out.println("The Largest number is "+c);
}
}
}
output:  15
               20
               35
               The Largest number is 35 */
/*6.public class loops
{
public static void main(String[] args)
{
int i=10;
while(i<100)
{
if(i%2==0)
{
System.out.println(i+" ");
}
i++;
}
}
} 
output:10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98 */
/*7.public class loops
{
public static void main(String[] args)
{
int i = 1;
do 
{
System.out.println(i);
i++;
} 
while (i < 10);
}
}
output: 1
2
3
4
5
6
7
8
9 */
/*8.import java.util.Scanner;
public class loops
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int p = String.valueOf(n).length(); 
int sum = 0;
int temp = n;
while (temp > 0) 
{
int r = temp % 10;
sum += Math.pow(r, p);
temp /= 10;
}
if (n == sum) {
System.out.println(n + " is an Armstrong number.");
} 
else 
{
System.out.println(n + " is not an Armstrong number.");
}
sc.close();
}
}
output: Enter a number: 153
             153 is an Armstrong number. */
/*9. import java.util.Scanner;
public class loops
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
boolean isPrime = true;
if (num <= 1) {
isPrime = false;
}
 else 
{
for (int i = 2; i <= Math.sqrt(num); i++) 
{
if (num % i == 0) {
isPrime = false;
break;
}
}
}
if (isPrime) 
{
System.out.println(num + " is a Prime Number.");
} 
else 
{
System.out.println(num + " is Not a Prime Number.");
}
}
}
output: 1.  Enter a number: 19
                  19 is a Prime Number.
             2. Enter a number: 56
                 56 is Not a Prime Number.  */
/*10. import java.util.Scanner;
public class loops
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);        
System.out.print("Enter a number: ");
int num = sc.nextInt();
int originalNum = num;        
int reversed = 0;
while (num != 0)
{
int digit = num % 10;
reversed = reversed * 10 + digit;
num /= 10;
}
if (originalNum == reversed) 
{
System.out.println(originalNum + " is a Palindrome number.");
} 
else 
{
System.out.println(originalNum + " is NOT a Palindrome number.");
}
}
}
output:1. Enter a number: 5665
                5665 is a Palindrome number.
             2. Enter a number: 23
                 23 is NOT a Palindrome number.  */
/* 11.import java.util.Scanner;
public class loops 
{ 
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);        
int a = sc.nextInt();
switch (a % 2) 
{
case 0:
System.out.println("The number is Even");
break;
case 1:
System.out.println("The number is Odd");
break;
}
}
}
output: 1. 5
                  The number is Odd
              2. 36
                   The number is Even*/
/* 12. import java.util.Scanner;
public class loops
{
public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
System.out.print("Enter gender : ");
char gender = sc.next().toUpperCase().charAt(0); 
 switch (gender) 
{
case 'M':
 System.out.println("Gender: Male");
 break;
 case 'F':
System.out.println("Gender: Female");
break;
default:
System.out.println("Invalid input! Please enter M or F.");
}
}
}
output: Enter gender : f
             Gender: Female   */
/*13.import java.util.Scanner;
public class loops
 {
  public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 int a = 14;
 int b = 01;
 int c =25;
 if (a == b && b == c) 
{
 System.out.println("All are Equal");
 }
 else if (a > b && a > c)
 {
  System.out.println("The Largest number is " + a);
  } 
else if (b > c) 
{
 System.out.println("The Largest number is " + b);
 }
else 
{
 System.out.println("The Largest number is " + c);
}
}
}
output:  The Largest number is 25 */