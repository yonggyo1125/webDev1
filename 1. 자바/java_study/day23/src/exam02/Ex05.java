package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int c = 10;
        Calculator cal = (a,b) -> {
            //c = 20; 변경 불가 -> final : 지역변수의 상수화
            return a + b + c;
        };


    }
}
