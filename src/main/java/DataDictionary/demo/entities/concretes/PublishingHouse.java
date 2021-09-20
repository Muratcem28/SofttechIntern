package DataDictionary.demo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publishingHouses")
public class PublishingHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "adress")
    private String address;

    @Column (name = "mail")
    private String mail;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "publishingHouse_Author",
               joinColumns = @JoinColumn( name = "PublishingHouse" ),
               inverseJoinColumns = @JoinColumn( name = "author_id" ))
    private List<Author> authors;
}
