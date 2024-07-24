package hellojpa;
import javax.persistence.*;


@Entity
public class Member {
    @ Id

    private Long id;
    @Column(name = "name")
    private String username;


    public Member(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setUsername(String username) {
        this.username = username;
    }
}