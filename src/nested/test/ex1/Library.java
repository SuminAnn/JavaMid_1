package nested.test.ex1;

public class Library {

    private int count;
    private Book[] books;

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    } //Book 객체를 밖에서 사용하는 경우에는 따로 만들어 주는게 좋다

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    
    public void addBook(String title, String author){
        //검증 로직을 처리하고
        if(count >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }

        //정상 로직 처리
        books[count++] = new Book(title, author);

        // if(count < books.length){
        //     books[count++] = new Book(title, author);
        // }else{
        //     System.out.println("도서관 저장 공간이 부족합니다");
        // }
    }


    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }
}
