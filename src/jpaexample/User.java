package jpaexample;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public User() {
    }

    /**
     * Constructor
     *
     * @param name
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * getId
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * getName
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
