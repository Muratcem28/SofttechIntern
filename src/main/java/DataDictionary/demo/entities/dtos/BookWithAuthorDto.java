package DataDictionary.demo.entities.dtos;


import DataDictionary.demo.entities.concretes.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookWithAuthorDto {
    private int id;
    private String bookName;
    private String authorName;
}
