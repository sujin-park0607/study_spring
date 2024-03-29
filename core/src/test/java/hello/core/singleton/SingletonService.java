package hello.core.singleton;

public class SingletonService {

    //자기 자신을 private static으로 생선한다 -> 자바기본이라고 하니 공부하기
    //static이라고 되어있으면 이 명령어 하나만 만들어져서 올라감
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance(){
        return instance;
    }

    //3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
