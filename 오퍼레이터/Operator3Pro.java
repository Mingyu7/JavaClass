
public class Operator3Pro {

	public static void main(String[] args) {
		int num = 5;
		String result = (num%2==0)?"¦��":"Ȧ��";
		System.out.println("���:"+result);
		
		int age = 21;
		String ageresult = (age>=20&& age<30)? "20��" : "20��ƴ�";
		System.out.println("��� : "+ageresult);
		
		int toeic = 750;
		char score ='A';
		String scoreresult =(toeic>=700 && score == 'A')? "pass":"fail";
		System.out.println("toeic:"+toeic+",score="+score+",���:"+scoreresult);
		
	
	
		
	}

}
