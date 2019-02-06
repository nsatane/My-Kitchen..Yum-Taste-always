package MyFoodPassion.models;



//import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


//@Entity
//@Table(name = "posts")
public class  Post {

    //   @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //  @Column(nullable = false, length = 300)
    @NotEmpty(message = "Your Post must have title")
    private String title;

    //  @Lob
    //   @Column(nullable = false)
    private String body;
    public User author;

    // @Column(nullable = false)
    private Date date = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return "Post{}";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post() {
    }
    public Post(Long id, String title, String body, User author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
   /** public void setAuthor(User author) {
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }
    public Post(Long id, String title, String body, User author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    //  @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User author;

**/


