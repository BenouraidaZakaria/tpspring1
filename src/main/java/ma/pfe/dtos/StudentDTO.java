package ma.pfe.dtos;

import ma.pfe.entities.Adresse;
import ma.pfe.entities.StudentId;

public class StudentDTO {
    private StudentId sid;
    private String name;
    private Adresse adresse;

    public StudentId getSid() {
        return sid;
    }

    public void setSid(StudentId sid) {
        this.sid = sid;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public StudentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" +sid+
                ", name='" + name + '\'' +
                '}';
    }
}
