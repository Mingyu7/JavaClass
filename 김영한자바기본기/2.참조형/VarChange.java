package ref;

public class VarChange {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value=10;
        Data dataB = dataA;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);

        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);

        dataA.value=20;  //dataB에는 dataA에 값이 있는 주소가 복사되어있다
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);

        dataB.value=30;
        System.out.println("dataB = " + dataB.value);
        System.out.println("dataA = " + dataA.value);


    }
}
