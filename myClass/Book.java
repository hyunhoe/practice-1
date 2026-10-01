package myClass;
import DB_Element;

/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Book extends DB_Element
{
    private String author; // 저자 이름
    private String bookID; // 책 등록번호
    private String publisher; // 출판사 이름
    private String title; // 책 제목
    private int year; // 출간연도

    /**
     * Book 클래스의 객체 생성자
     */
    public Book(String author, String bookID, 
    String publisher, String title, int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String getID()
    {
        // 여기에 코드를 작성하세요.
        return bookID;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String toSTring()
    {
        return "(" + bookID + ") " + title + ", " + 
                author + ", " + publisher + ", " + year;
    }

}