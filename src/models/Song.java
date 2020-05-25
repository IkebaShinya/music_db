package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "tblsongtitle")
@NamedQuery(
        name="songSelect",
        query="SELECT s FROM Song AS s"
    )
@Entity
public class Song {
    @Id
    @Column(name = "song_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "composition_ymd", nullable = false)
    private Timestamp composition;

    @Column(name = "artist_num", nullable = false)
    private Integer artist_num;

    @Column(name = "tune_num", nullable = false)
    private Integer tune_num;

    @Column(name = "series_num", nullable = false)
    private Integer series_num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String com) {
        this.comment = com;
    }

    public Timestamp getComposition() {
        return composition;
    }

    public void setComposition(Timestamp com) {
        this.composition = com;
    }

    public Integer getArtist_num() {
        return artist_num;
    }

    public void setArtist_num(Integer num) {
        this.artist_num = num;
    }

    public Integer getTune_num() {
        return tune_num;
    }

    public void setTune_num(Integer num) {
        this.tune_num = num;
    }

    public Integer getSeries_num() {
        return series_num;
    }

    public void setSeries_num(Integer num) {
        this.series_num = num;
    }
}
