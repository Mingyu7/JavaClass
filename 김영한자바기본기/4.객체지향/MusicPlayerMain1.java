package opp1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 실행
        data.isOn = true;
        System.out.println("음악 플레이어 실행");


        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //볼륨감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //음악플레이어 상태 확인
        System.out.println("음악 플레이어 상태 : " + data.isOn);
        //음악플레이어 종료
        data.isOn=false;
        System.out.println("종료 합니다. 플레이어 상태 : " + data.isOn);

    }


}
