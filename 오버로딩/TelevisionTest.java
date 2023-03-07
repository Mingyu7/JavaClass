
public class TelevisionTest {

	public static void main(String[] args) {
		
		System.out.println("--------"+"Tv개수: "+Television.getTvCount()+"--------");
		
		Television tv = new Television();
		System.out.println("--------"+"Tv개수: "+Television.getTvCount()+"--------");
		tv.print();
		
		Television tv1 = new Television(10);
		System.out.println("--------"+"Tv개수: "+Television.getTvCount()+"--------");
		tv1.print();
		
		Television tv2 = new Television(11,5);
		System.out.println("--------"+"Tv개수: "+Television.getTvCount()+"--------");
		tv2.print();

		Television tv3 = new Television(10, 10, true);
		System.out.println("--------"+"Tv개수: "+Television.getTvCount()+"--------");
		tv3.print();
		
		

	}

}
