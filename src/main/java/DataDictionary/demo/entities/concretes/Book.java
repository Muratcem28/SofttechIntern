package DataDictionary.demo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "price")
    private Integer price;

    @Column (name = "published_at")
    private String publishedAt;

    @ManyToOne()
    @JoinColumn(name = "author_id")
    private Author author;



}
