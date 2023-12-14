package counstruct.ex;

public class BookMain {
    public static void main(String[] args) {

        // 기본 생성자
        Book book1 = new Book();
        book1.displayInfo();

        // 매개변수 두개만 받는 생성자
        Book book2 = new Book("Hello Java","Seo");
        book2.displayInfo();

        // 모든 매개변수 받는 생성자
        Book book3 = new Book("JPA 프로그래밍","Kim",700);
        book3.displayInfo();
    }

}
