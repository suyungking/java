import java.util.ArrayList;
import java.util.List;
public class ArrayListex {
    public static void main(String[] args) {
        List<Board> list =new ArrayList<>();

        list.add(new Board("제목 1 ","내용1", "글쓴이 1"));
        list.add(new Board("제목 2 ","내용2", "글쓴이 2"));
        list.add(new Board("제목 3 ","내용3", "글쓴이 3"));
        list.add(new Board("제목 4 ","내용4", "글쓴이 4"));
        list.add(new Board("제목 5 ","내용5", "글쓴이 5"));

        int size =list.size();
        System.out.println("총 개체 수 : " + size);
        System.out.println();

        Board board =list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent()+ "\t" + board.getWriter() + "\t");
        System.out.println();

        for(int i=0; i < list.size(); i++){
            Board  b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);


        for(Board b : list ){
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }


    }
}
