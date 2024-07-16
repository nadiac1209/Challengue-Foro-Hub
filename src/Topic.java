import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String message;

    @NotNull
    private LocalDateTime creationDate;

    @NotEmpty
    private String status;

    @NotEmpty
    private String author;

    @NotEmpty
    private String course;
}
