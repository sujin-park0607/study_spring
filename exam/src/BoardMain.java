import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();

        while(true){
            System.out.printf("1.전체리스트 2.등록 0.종료>");
            int select = scanner.nextInt();

            if(select == 1){
                boardService.getBoardList();
            }
            else if(select == 2){
                boardService.save();
            }
            else{
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }
    }
}
