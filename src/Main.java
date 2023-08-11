import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(" == 프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);

    int lastArticleId = 0;

    while (true){
      System.out.println("명령어 ) ");
      String cmd = sc.nextLine();


      if (cmd.equals("article list")){
        System.out.println("게시글이 없습니다.");
      }
      else if (cmd.equals("article write")){
        int id = lastArticleId +1;
        lastArticleId =id;
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String note = sc.nextLine();

        System.out.printf("%d번 글이 생성되었습니다\n", id);
      }
      else if (cmd.equals("system exit")){
        break;
      }
      else {
        System.out.printf("존재하지 않는 명령어입니다\n");
        continue;
      }
    }
    System.out.printf("== 프로그램 종료 ==");

  }
}