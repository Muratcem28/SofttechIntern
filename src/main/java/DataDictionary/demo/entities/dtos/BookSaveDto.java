package DataDictionary.demo.entities.dtos;

import DataDictionary.demo.entities.concretes.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveDto {
    private String name;
    private int price;
    private String publishedAt;
    private int authorId;
}
