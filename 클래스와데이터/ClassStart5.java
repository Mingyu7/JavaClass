public class ClassStart5
{
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 12;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 90;

        Student[] students = {student1,student2};

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : "+ s.age + " 나이 : " + s.age + " 점수 : " + s.grade);
        }

        for (Student s : students) { // 향상된 for문 *iter* 단축키
            System.out.println("이름 : "+ s.age + " 나이 : " + s.age + " 점수 : " + s.grade);
        }






    }
}

