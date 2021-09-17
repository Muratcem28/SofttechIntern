package DataDictionary.demo.dataAccess.abstracts;

import DataDictionary.demo.entities.concretes.Book;
import DataDictionary.demo.entities.dtos.BookWithAuthorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {


    /*
    Book getByBookName(String bookName);
    Book getByBookId(int bookId);
    Book getByBookNameAndAuthor_AuthorId(String bookName, int authorId);


    List<Book> getByBookNameOrAuthor_AuthorId(String bookName, int authorId);

    List<Book> getByAuthor_AuthorIdIn(List<Integer> authors);

    List<Book> getByAuthor_AndAuthorIn(List<Integer> books);

    List<Book> getByBookNameContains(String bookName);

    @Query("From Book where bookName=:bookName and author.authorId=:authorId")
    List<Book> getByNameAndAuthor_AuthorId(String bookName, int authorId);

    @Query("Select new DataDictionary.demo.entities.dtos.BookWithAuthorDto(b.id, b.bookName, a.authorName) From Author a inner Join a.books b")
    List<BookWithAuthorDto> getBookWithAuthorDetails();

*/
    /*  @Query(nativeQuery = true,value = "SELECT * FROM Book WHERE id=:id")
    Book getFirstById(String id);
    Book getById(Integer id);       */
}
