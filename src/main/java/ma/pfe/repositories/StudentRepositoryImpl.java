package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentRepositoryImpl implements StudentRepository{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public StudentEntity save(StudentEntity entity) {
        return new StudentEntity();
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        return new StudentEntity();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return new ArrayList<>();
    }
}
