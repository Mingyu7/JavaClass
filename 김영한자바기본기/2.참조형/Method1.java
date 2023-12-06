package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90); // 반환된 주소값을 복사함
        Student student2 = createStudent("학생2", 20, 80);

        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name,int age,int grade){
        Student student = new Student(); //  Student 주소값 생성
        student.name=name;
        student.age = age;
        student.grade=grade;
        return student; // 주소값 반환해서 복사해서 사용

    }

    static void initStudent(Student student,String name,int age,int grade){
        student.name=name;
        student.age=age;
        student.grade=grade;
    }
    static void printStudent(Student student){
        System.out.println("이름 = " + student.name + " 나이 = " + student.age + " 성정 = " + student.grade);
    }
}
