package counstruct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){ // 생성자 오버로딩
        this(name, age, 50); // this() 사용

    }

    MemberConstruct(String name, int age, int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
