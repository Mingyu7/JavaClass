
public class ArrayPro03 {

	public static void main(String[] args) {
		int[] s = {2,5,8,10,1,40,30,70,30,20};
		int min=s[0];
		int max=s[0];
		
		for(int i =1;i<s.length;i++) {
			if(min>s[i]) 
				min=s[i];				
		}
		System.out.println("최소값 : "+min);
		
		for(int i=1;i<s.length;i++) {
			if(max<s[i])
				max=s[i];
		}
		System.out.println("최대값 : "+max);
	}

}
