package DataDictionary.demo.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishingHouseSaveDto {
    private String name;
    private String address;
    private String mail;
    private int authorId;
}
