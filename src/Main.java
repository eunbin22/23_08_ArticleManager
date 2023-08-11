import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(" == 프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);

    int lastArticleId = 0;
    List<Article> articles = new ArrayList<>();

    while (true){
      System.out.println("명령어 ) ");
      String cmd = sc.nextLine().trim(); //양옆에 있는 공백을 자르는 trim

      if (cmd.equals("article write")){
        int id = lastArticleId +1;
        lastArticleId =id;
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String note = sc.nextLine();

        Article article = new Article(id, title, note);
        articles.add(article);


        System.out.printf("%d번 글이 생성되었습니다\n", id);
      }
      else if (cmd.equals("article list")){
        if (articles.size() == 0){
          System.out.println("게시글이 없습니다.");
          continue;
        } else {
          for (int i = articles.size() -1 ; i >= 0 ; i--) {
            Article article = articles.get(i);
            System.out.printf("%d번 글 |  %s\n", article.id, article.title);
          }
        }
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
class Article{
  int id;
  String title;
  String note;
  Article(int id, String title, String note){
    this.id = id;
    this.title = title;
    this.note = note;
  }
}

// <데이터베이스>
// DB를 배워야 영속저장 가능. DBMS
// JAVA에서는 JDBC가 있어야 한다. : 표준 인터페이스. 데이터베이스에서 자료를 Query해서 데이터를 외부에 저장. (영속성이 생김)
// SQL = mariaDB  SQLYog