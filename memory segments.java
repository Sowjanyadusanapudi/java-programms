class ece1
{
int a=20;
int b=10;
static int p=40;
static int q=30;
{
System.out.println("instance 1");
}
{
System.out.println("instance 2");
}
static{
System.out.println("static 1");
}
static{
System.out.println("static 2");
}
void add()
{
System.out.println(a+b);
}
static void sub()
{
System.out.println(p-q);
}
}
class ece2
{
int c=25;
int d=15;
static int r=45;
static int s=35;
{
System.out.println("instance 3");
}
{
System.out.println("instance 4");
}
static{
System.out.println("static 3");
}
static{
System.out.println("static 4");
}
void mul()
{
System.out.println(c*d);
}
static void div()
{
System.out.println(r/s);
}
public static void main (String[] args)
{
ece1 e1=new ece1();
ece2 e2=new ece2();
e1.add();
e1.sub();
e2.mul();
e2.div();
}
}
/*output:  static 3
                  static 4
                  static 1
                  static 2
                  instance 1
                  instance 2
                  instance 3
                  instance 4
                  30
                  10
                  375
                  1    */
