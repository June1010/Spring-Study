package hello.core.singleton;

public class SingletonService {
    // 자바가 뜰 때 객체가 생성되어 올라감.
    private static final SingletonService instance = new SingletonService();

    // public으로 열어서 객체가 필요한 경우 이 메서드를 통해서만 조회하도록 설정.
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private으로 선언해서 외부에서 new키워드를 이용한 객체 생성 방지
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
