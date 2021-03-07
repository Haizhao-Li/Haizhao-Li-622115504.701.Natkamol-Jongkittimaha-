import javax.xml.namespace.QName;

public class Student {
  public String name;
  public int age;
  public double gpa;

    public Student(String mark, int i, double v) {
        this.name=mark;
        this.age=i;
        this.gpa=v;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

    public static void main(String[] args) {
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.00);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);


        System.out.println(std01.getName().equals(std02.getName()));
        System.out.println(std01.getName().equals(std03.getName()));
        System.out.println(std02.getName().equals(std04.getName()));
        System.out.println(std01.getName().equals(std04.getName()));
        System.out.println();
        System.out.println(std01.getAge()==(std02.getAge()));
        System.out.println(std03.getAge()==(std04.getAge()));
        System.out.println(std01.getAge()==(std03.getAge()));
        //This is wrong if using equals, Because it's a int variable or switch it to string value.
//        System.out.println(std01.getAge().equals(std02.getAge()));
//        System.out.println(std03.getAge().equals(std04.getAge()));
//        System.out.println(std01.getAge().equals(std03.getAge()));
        System.out.println();
        System.out.println(std01.getGpa()==(std03.getGpa()));
        System.out.println(std02.getGpa()==(std04.getGpa()));
        System.out.println(std02.getGpa()==(std03.getGpa()));
        //This is wrong if using equals, Because it's a double variable or switch it to string value.
//        System.out.println(std01.getAge().equals(std03.getAge()));
//        System.out.println(std02.getAge().equals(std04.getAge()));
//        System.out.println(std02.getAge().equals(std03.getAge()));

    }
}
