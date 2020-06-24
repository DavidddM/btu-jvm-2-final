package david.maisuradze.davaleba1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pdfUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Book book;
}
