package ma.pfe.entities;

import javax.persistence.*;
import java.util.List;


@Entity
public class StudentEntity {
    @EmbeddedId
    private StudentId studentId;
    @Column(name="name_student")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue", column=@Column(name="rue")),
            @AttributeOverride(name="avenue", column=@Column(name="avenue")),
            @AttributeOverride(name="num", column=@Column(name="num"))
    })
    private Adresse adresse;

    @ManyToMany
    private List<CourseEntity> courses;

    @ManyToOne
    @JoinColumn(name="fk_niveau_id")
    private NiveauEntity niveau;

    public NiveauEntity getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauEntity niveau) {
        this.niveau = niveau;
    }
    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
