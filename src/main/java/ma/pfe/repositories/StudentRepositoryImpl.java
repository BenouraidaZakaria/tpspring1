package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentRepositoryImpl implements StudentRepository{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public StudentEntity save(StudentEntity entity) {
//        return null;
        LOG.debug("Start  create");
        StudentEntity result= null;
        LOG.debug("end  create");
        return result;
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
//        return null;
        LOG.debug("Start  update");
        StudentEntity result= null;
        LOG.debug("end  update");
        return result;
    }

    @Override
    public boolean delete(long id) {
//        return false;
        LOG.debug("Start  delete");
        boolean result= false;
        LOG.debug("end  delete");
        return result;
    }

    @Override
    public List<StudentEntity> readAll() {
//        return null;
        LOG.debug("Start  readAll");
        List<StudentEntity> result= null;
        LOG.debug("end  readAll");
        return result;
    }
}
