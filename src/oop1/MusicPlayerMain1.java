package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean state = false;

        //음악 플레이어 켜기
        state = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 불륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 불륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 불륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인 ");

        if(state) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        }
        else {
            System.out.println("음악 플레이 OFF");
        }

        //음악 플레이어 끄기
        state = false;
        System.out.println("음악플레이를 종료합니다 ");


    }
}
