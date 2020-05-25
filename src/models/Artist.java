package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "tblartist")
@NamedQuery(
        name="artSelect",
        query="SELECT a FROM Artist AS a"
    )
@Entity
public class Artist {
    @Id
    @Column(name = "artist_id", nullable = false)
    private Integer id;

    @Column(name = "artist_name", nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

}
