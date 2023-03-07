
public class Operator3Pro {

	public static void main(String[] args) {
		int num = 5;
		String result = (num%2==0)?"Â¦¼ö":"È¦¼ö";
		System.out.println("°á°ú:"+result);
		
		int age = 21;
		String ageresult = (age>=20&& age<30)? "20´ë" : "20´ë¾Æ´Ô";
		System.out.println("°á°ú : "+ageresult);
		
		int toeic = 750;
		char score ='A';
		String scoreresult =(toeic>=700 && score == 'A')? "pass":"fail";
		System.out.println("toeic:"+toeic+",score="+score+",°á°ú:"+scoreresult);
		
	
	
		
	}

}
