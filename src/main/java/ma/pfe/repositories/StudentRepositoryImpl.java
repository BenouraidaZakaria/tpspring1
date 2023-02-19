package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentRepositoryImpl implements StudentRepository{


    @Override
    public StudentEntity create(StudentEntity entity) {
        return null;
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }
}
