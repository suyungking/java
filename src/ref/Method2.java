package ref;

public class Method2 {
    public static void main(String[] args) {


        Student student1 = createStudent("학생1",25,90);
        Student student2 = createStudent("학생2",25,80);

        printStudent(student1);
        printStudent(student2);


    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade=grade;
        return student;
    } // 메서드의 반환 기능을 사용해서 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.  이 참조값만 있으면 해당 인스턴스에 접근할 수있다.


    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 :"  + student.age + " 성적: " + student.grade);
    }
}
