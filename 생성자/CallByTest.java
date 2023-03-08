class CallBy{
	void add(int num) {
		++num;
	}
	void add(int [] num) {
		for(int i=0;i<num.length;i++) {
			++num[i];
		}
	}
}

public class CallByTest {

	public static void main(String[] args) {
		CallBy cb1 = new CallBy();
		int num=10;
		cb1.add(num);
		System.out.println(num);
		
		int [] nums = {0,1,2,3,4};
		cb1.add(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+"   ");
		}
	}

}
