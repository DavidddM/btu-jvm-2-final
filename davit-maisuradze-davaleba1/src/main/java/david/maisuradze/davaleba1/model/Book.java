package david.maisuradze.davaleba1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;

    @ManyToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Author> authors = new ArrayList<>();


    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Tag> tags = new ArrayList<>();
}
