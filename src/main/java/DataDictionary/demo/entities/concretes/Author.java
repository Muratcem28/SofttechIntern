package DataDictionary.demo.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authors")
@JsonIgnoreProperties
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column
    @Temporal(TemporalType.DATE)
    private Date yearOfBirth;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
