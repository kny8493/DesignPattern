package Singleton;

public class Singleton {
    // static 프로그램 실행전에 하나메모리에 할당해서 끝날때까지 유지가됨
    // 왜 static인가? 외부에서 호출하는것을 금지하기위해 -> 싱글톤이라는 의미는 해당 클래스에서 인스턴스가 딱 한개만 존재하는것
    // 동기화 적용한 싱글톤
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("create");
        slowdown();
    }
    public static synchronized Singleton getInstance( ) {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
