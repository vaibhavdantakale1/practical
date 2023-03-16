public class Datatype{

int a;
short b;
long c;
double g;
float h;
void show(){
System.out.println("int" +a);
System.out.println("short"+b);
System.out.println("long" +c);
System.out.println("double"+g);
System.out.println("float"+h);
}
public static void main(String args[]){
Datatype object = new Datatype();
System.out.println("The default values are given below:");
object.show();
}}