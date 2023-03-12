package spring.net.mydream.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public interface BaseEntity extends Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id = null;
    Integer getId();
    void setId(Integer id);

}
