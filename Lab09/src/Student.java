public class Student {
    private String firstname = "Hello";
    private String lastname ="World";
    public Student(String firstname,String lastname){
        this.lastname=lastname;
        this.firstname=firstname;

    }
    public String toString(){
        return "My firstname"+firstname+" "+"My last name"+lastname;
    }

    public static void main(String[] args) {
        Student p = new Student("Li","Haizhao");
        System.out.println(p.toString());
    }
}
