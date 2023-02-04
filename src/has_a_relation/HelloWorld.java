package has_a_relation;
import java.util.Scanner;

class Address
{
    String plot_no, area, city;
    Address(String pl, String ar, String ct)
    {
        plot_no = pl;
        area = ar;
        city = ct;
    }
}

class Student
{
    String name;
    int result, rollno;
    Address ad1;
    void setStudentDetails(int r, int res, String n, Address ad)
    {
        rollno = r;
        result = res;
        name = n;
        ad1 = ad;
    }
    void show()
    {
        System.out.println("Roll Number "+rollno);
        System.out.println("Name "+name);
        System.out.println("Result "+result);
        System.out.println("Plot Number "+ad1.plot_no);
        System.out.println("Area "+ad1.area);
        System.out.println("City "+ad1.city);
    }
}
class HelloWorld {
    public static void main(String[] args) 
    {
    Address ad = new Address("307 Frientd colony ", "katol road ", " Nagpur")    ;
    Student st1 = new Student();
    st1.setStudentDetails(101, 75,"Rishabh",ad);
    st1.show();
    }
}

