package ch01.practice;

public class BookShelf implements Iterable<Book>  { 
  //jdk에서 제공하는 인터페이스인 Iterable 이용함. 자동 임포트됨
  private Book[] books;  //배열 선언
  private int last = 0;  // 마지막에 꽂힌 위치, 책의 갯수

  public BookShelf(int maxsize) {
    //배열 생성
    this.books = new Book[maxsize];
  }
  
  // 책 꽂는 메소드
  public void appendBook(Book book) {
    books[last] = book;
    last++;
  }

  // 책 가져오는 메소드
  public Book getBookAt(int index) {
    return books[index];
  }
  
  // 책 갯수를 반환하는 메소드
  public int getLength() {
    return last;
  }

  // 자신의 iterator를 반환하는 메소드
  @Override
  public BookShelfIterator iterator() {
    return new BookShelfIterator(this);
  }
}
