package HeadFirstJava;

/**
 * Created by Алина on 03.09.2016.
 */
import java.util.*;
public class TestTreeGlava16
{
    public static void main(String[] args){
        new TestTreeGlava16().go();
    }

    public void go(){
        Book b1=new Book("Как устроены кошки");
        Book b2=new Book("Постройте заново свое тело");
        Book b3=new Book("В поисках Эмо");

BookCompare bookCompare=new BookCompare();
        TreeSet<Book> book=new TreeSet<Book>(bookCompare);
        book.add(b1);
        book.add(b2);
        book.add(b3);

        System.out.println(book);
    }
}

class Book{
    String title;
    public Book(String t){
        title=t;
    }
}

class BookCompare implements Comparator<Book>{
    public int compare(Book one, Book two){
        return one.title.compareTo(two.title);
    }
}
