package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "tblseries")
@NamedQuery(
        name="seriesSelect",
        query="SELECT s FROM Series AS s"
    )
@Entity
public class Series {
    @Id
    @Column(name = "series_id", nullable = false)
    private Integer id;

    @Column(name = "series_name", nullable = false)
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
