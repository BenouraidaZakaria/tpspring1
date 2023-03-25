package ma.pfe.entities;

import javax.persistence.*;


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
