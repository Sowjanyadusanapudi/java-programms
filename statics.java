/* 1. class Static
{
 static int a=1;
static int b=2;
int c=3;
int d=4;
static{
System.out.println("static");
}
static{
System.out.println(a+b);
}
{
System.out.println("instance");
}
{
System.out.println(c+d);
}
static void stati()
{
System.out.println(a*b);
}
static void stat()
{
System.out.println(a);
}
public void sta()
{
System.out.println(c);
}
public void st()
{
System.out.println(c+d);
}
public static void main(String args[])
{
Static s=new Static();
s.stati();
s.stat();
s.sta();
s.st();
}
}
output:  static
               3
               instance
               7
               2
               1
               3
               7  */


/*2. class Static
{
int a=20;
int b=10;
static void method()
{
Static s=new Static();
System.out.println(s.a);
System.out.println(s.b);
}
public static void main(String[] args)
{
System.out.println("Main Method");
method();
}
}

output: Main Method
              20
              10     */


/* 3. class Static
{
static int a=20;
static int b=10;
void print()
{
System.out.println(a);
System.out.println(b);
}
public static void main(String[] args)
{
System.out.println("Main Method");
Static s=new Static();
s.print();
}
}

output: Main Method
              20
              10   */

/* 4. class Static
{
void instance()
{
System.out.println("welcome");
}
static void staticmethod()
{
Static s = new Static();
s.instance();
}
public static void main(String[] args) {
System.out.println();
staticmethod();  
}
}

output: welcome */


/* 5. class Static
{
static void a()
{
System.out.println("welcome");
}
void b()
{
a();
}
public static void main(String[] args) 
{
Static s = new Static();
s.b();  
}
}
output:  welcome */


/* 6. class Static
{    
    static int a = 10;
    static int b = 15;
    int c = 20;
    int d = 25;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Static s = new Static();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}

output: Static Variables:
             10
             15
             Instance Variables:
             20
             25  */


/* 7. class Static
{
    static void a()
    {
        System.out.println("Welcome");
    }
    void ins()
    {
        System.out.println("Back to home");
    }
    public static void main(String[] args)
    {
        System.out.println();
        a();
        Static s=new Static();
        s.ins();
    }
}
output:   Welcome
                Back to home    */
