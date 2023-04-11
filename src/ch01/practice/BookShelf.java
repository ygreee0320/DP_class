package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book>  { 
  //jdk에서 제공하는 인터페이스인 Iterable 이용함. 자동 임포트됨
  private Book[] books;  //배열 선언
  //private List<Book> books = new ArrayList<Book>(); //선언과 생성을 동시에
  private int last = 0;  // 마지막에 꽂힌 위치, 책의 갯수

  public BookShelf(int maxsize) {
    //배열 생성
    this.books = new Book[maxsize];
  }
  
  // 책 꽂는 메소드
  public void appendBook(Book book) {
    books[last] = book;
    //books.add(book); //리스트일때
    last++;
  }

  // 책 가져오는 메소드
  public Book getBookAt(int index) {
    // public Book getBookFrom(int index) {
    return books[index];
  }
  
  // 책 갯수를 반환하는 메소드
  public int getLength() {
    return last;
  }

  // 자신의 iterator를 반환하는 메소드
  @Override
  // public BookShelfIterator iterator() {
  public Iterator<Book> iterator() { // 부모타입으로 작성하기
    return new BookShelfIterator(this);
    // return new BookShelfIteratorBackward(this); //뒤에 꽂힌 책부터
  }
}
