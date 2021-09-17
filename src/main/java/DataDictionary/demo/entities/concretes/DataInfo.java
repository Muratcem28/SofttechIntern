package DataDictionary.demo.entities.concretes;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class DataInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "tableName")
    private String tableName;

    @Column (name = "columnName")
    private String columnName;

    @Column (name = "comment")
    private String comment;
}
