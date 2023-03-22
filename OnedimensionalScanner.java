import java.util.*;


class OnedimensionalScanner{
 public static void main (String args [])
 {
 int age;
 Scanner sc= new Scanner (System.in);
 System.out.println("Age: ");
 age = sc.nextInt();
 int a[] = new int[age];
 
 int num;
 System.out.println("Contact Number: ");
 num = sc.nextInt();
 int a[] = new int[num];

 
 int zip;
 Scanner sc= new Scanner (System.in);
 System.out.println("Zip Code: ");
 zip = sc.nextInt();
 int a[] = new int[zip];

 
 System.out.print("Others: " + age + num + zip);
 
 
 
 }

}
