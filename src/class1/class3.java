package class1;

public class class3 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 90;
        student1.grade = 15;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 80;
        student2.grade = 16;


        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2 .name + " 나이 : " + student2.age + " 성적 : " + student2.grade);


    }
}
