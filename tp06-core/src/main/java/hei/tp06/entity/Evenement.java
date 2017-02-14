package hei.tp06.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Anaïck on 14/02/2017.
 */
@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date start;
    private Date end;
    @Column(name="title")
    private String title;
    @Column(name="color")
    private String color;
    @Column(name="description")
    private String description;

    public Evenement(){}

    public Evenement(Date start, Date end, String title, String color, String description) {
        this.start = start;
        this.end = end;
        this.title = title;
        this.color = color;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
