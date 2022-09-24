import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    List<Board> boardList = new ArrayList<>();

    public void getBoardList(){
        System.out.println("== 게시물 리스트 ==");
        System.out.println("no\ttitle\tdate");
        if(boardList.isEmpty()){
            System.out.println("글이 없습니다.");
        }
        else{
            int cnt = 1;
            for(Board b : boardList){
                System.out.println(cnt +"\t"+ b.getTitle() +"\t"+ b.getDate());
                cnt ++;
            }
        }

        return;
    }

    public void save(){
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.printf("제목:");
        String title = scanner.nextLine();
        board.setTitle(title);

        System.out.printf("작성자:");
        String user = scanner.nextLine();
        board.setUser(user);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        board.setDate(formatter.format(date));

        boardList.add(board);
        System.out.println("글이 추가 되었습니다.");
    }
}
