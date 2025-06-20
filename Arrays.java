/*1. public class Arrays
{
public static void main(String[] args){
int a[]={1,2,3,4,5,6,7,8,9,10};
int sum=0;
for( int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("Sum is:"+sum);
}
}
output: Sum is:55  */


/*2. public class Arrays{
public static void main(String[] args){
int a[]={1,2,3,4,5,6,7,8,9};
int sum=0;
float avg;
for( int i=0;i<a.length;i++){
sum=sum+a[i];
}
avg=sum/a.length;
System.out.println("Average is:"+avg);
}
}
output:  Average is:5.0  */


/*3. import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of an array:");
int n;
n=s.nextInt();
int a[]={14,01,20,05};
for(int i=0;i<a.length;i++){
if(a[i]==n){
System.out.println("Index value of " +a[i] + " is:" +i);
}
}
}
}
output: Enter the value of an array:20
              Index value of 20 is:2    */


/*4. import java.util.Scanner;
public class Arrays{
public static void main(String args[])
{
int n;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={14,01,20,05};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
found = true;
}
}
if(found)
{
System.out.println("found a specified value ");
}
else {
System.out.println("not found a specified value");
}
}
}
output: Enter the value of n:01
              found a specified value
            
              Enter the value of n:3
              not found a specified value    */


/*5.import java.util.Scanner;
public class Arrays
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
int a[]={14,01,20,25,05};
System.out.print("Enter the value of n to remove from an array:");
n=s.nextInt();
int arr[]=new int[a.length-1];
for(int i=0,k=0;i<a.length;i++)
{
if(a[i]!=n)
{
 arr[k]=a[i];
 k++;
}
}
System.out.println("Array after removal:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}
output:  Enter the value of n to remove from an array:25
               Array after removal:
               14
               1
               20
               5    */


/*6. import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
int i,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Display the values of array a:");
for(i=0;i<n;i++){
System.out.println(a[i]);
}
System.out.println("Display the values of array b:");
for(i=0;i<n;i++){
System.out.println(b[i]=a[i]);
}
s.close();
}
}
output:  Enter the size of an array:4
               Enter the values of an array:14 01 20 05
               Display the values of array a:
               14
               1
               20
               5
               Display the values of array b:
               14
               1
               20
               5       */


/*7.import java.util.Scanner;
public class Arrays
{
public static void main(String args[])
{
int n,position;
Scanner s=new Scanner(System.in);
int a[]={14,01,20,05};
System.out.print("Enter the value of n to insert into an array:");
n=s.nextInt();
System.out.print("Enter the position (0 to " + a.length + ") to insert n: ");
position=s.nextInt();
int arr[]=new int[a.length+1];
for(int i=0,k=0;i<arr.length;i++)
{
if(i == position)
{
 arr[i]=n;
}
else{
arr[i]=a[k];
k++;
}
}
System.out.println("Array after insertion:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}
output:  Enter the value of n to insert into an array:4
               Enter the position (0 to 4) to insert n: 2
               Array after insertion:
               14
               1
               4
               20
               5   */


/*8. import java.util.Scanner;
public class Arrays
{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of array:");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("Enter " + n + " values:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int min=a[0];
int max=a[0];
for(int i=1;i<n;i++){
if(a[i]<min){
min=a[i];
}
if(a[i]>max){
max=a[i];
}
}
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
s.close();
}
}
output:  Enter the size of array:4
               Enter 4 values:
               14
               01
               20
               05
               Minimum value: 1
               Maximum value: 20    */


/*9. import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of array:");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("Enter " + n + " values:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Reversed Array:");
for(int i=n-1;i>=0;i--){
System.out.print(a[i]+ " ");
}
s.close();
}
}
output:  Enter the size of array:4
               Enter 4 values:
               14
               01
               20
               05
               Reversed Array:
               5 20 1 14    */


/* 10. public class Arrays{
public static void main(String[] args){
int a[]={14,01,01,20,05,20};
System.out.println("Duplicate elements are:");
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]==a[j]){
System.out.println(a[i]);
}
}
}
}
}
output: Duplicate elements are:
              1
              2  */


/*11. public class Arrays{
public static void main(String[] args){
int a1[]={14,01,20,05};
int a2[]={14,10,27,20};
System.out.println("Common elements are:");
for(int i=0;i<a1.length;i++){
for(int j=0;j<a2.length;j++){
if(a1[i]==a2[j]){
System.out.println(a1[i]);
}
}
}
}
}
output:    Common elements are:
                 14
                 20    */


/*12. import java.util.Scanner;
class Arrays{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}

output:    Enter size: 10
                Enter elements:
                1
                2
                5
                6
                9
                5
                6
                7
                6
                5
               Array without duplicates: 1 2 5 6 9 7     */


/*15. import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of array:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int evenCount=0,oddCount=0;
for(int i=0;i<n;i++){
if(a[i]%2==0){
evenCount++;
}
else{
oddCount++;
}
}System.out.println("Number of even numbers: " + evenCount);
System.out.println("Number of odd numbers: " + oddCount);
s.close();
}
}
output:   Enter the size of array:4
                Enter the elements:
                14
                01
                20
                05
                Number of even numbers: 2
                Number of odd numbers: 2        */
