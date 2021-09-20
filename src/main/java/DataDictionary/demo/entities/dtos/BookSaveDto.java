package DataDictionary.demo.entities.dtos;

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
