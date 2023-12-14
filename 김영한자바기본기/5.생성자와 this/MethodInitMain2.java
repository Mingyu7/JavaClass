package counstruct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        Memberinit memberinit1 = new Memberinit();
        memberinit1.initMember("user1",15,90);

        Memberinit memberinit2 = new Memberinit();
        memberinit1.initMember("user2",18,80);

        Memberinit[] members = {memberinit1,memberinit2};

        for (Memberinit s : members) {
            System.out.println("이름 : "+s.name+" 나이 : "+ s.age + " 성적 : "+s.grade);
        }

    }

    static void initMember(Memberinit member,String name,int age,int grade){
        member.name=name;
        member.age=age;
        member.grade=grade;
    }
}
