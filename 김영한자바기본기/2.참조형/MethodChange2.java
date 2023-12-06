package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA= new Data();
        dataA.value=10;
        System.out.println("dataA.value = " + dataA.value);
        changer(dataA); // 주소값을 복사 하기 때문에 값이 변함
        System.out.println("dataA.value = " + dataA.value);
    }
    static void changer(Data dataX){
        dataX.value=20;
    }
}
