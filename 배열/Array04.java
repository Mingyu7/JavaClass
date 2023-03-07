import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		int[] arr1 = {10,60,30,70,50};
		int[] arr2 = Arrays.copyOf(arr1,arr1.length);
		
		for(int i:arr2)
			System.out.print(i+ " ");
		
		System.out.println();
		System.out.println("-----정렬후-----");
		Arrays.sort(arr1); // Arrays API >>> 오름차순 정렬
		
		for(int i : arr1)
			System.out.print(i+" ");
		
		/*
		int[] arr2=arr1;
		arr1[0] = 100;
		System.out.println(arr1[0]+","+arr2[0]);
		*/
		
		/*
		int []arr2=new int[arr1.length];
		for(int i =0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		
		for(int i =0;i<arr2.length;i++){
			arr2[i]=arr2[i]+10;
		}
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		
			System.out.println();
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		*/

	}

}
