package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentRepository repository;
    private StudentMapper mapper;

    @Override
    public StudentDTO save(StudentDTO dto) {
//        return mapper.convertToDTO(repository.create(mapper.convertToEntity(dto)));
        LOG.debug("Start  create");
        StudentDTO result= mapper.convertToDTO(repository.save(mapper.convertToEntity(dto)));
        LOG.debug("end  create");
        return result;
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
//        return mapper.convertToDTO(repository.update(mapper.convertToEntity(dto)));
        LOG.debug("Start  update");
        StudentDTO result= mapper.convertToDTO(repository.update(mapper.convertToEntity(dto)));
        LOG.debug("end  update");
        return result;
    }

    @Override
    public boolean delete(long id) {
//        return repository.delete(id);
        LOG.debug("Start  delete");
        boolean result= repository.delete(id);
        LOG.debug("end  delete");
        return result;
    }

    @Override
    public List<StudentDTO> readAll() {
//        return mapper.convertToDTOs(repository.readAll());
        LOG.debug("Start  readAll");
        List<StudentDTO> result= mapper.convertToDTOs(repository.readAll());
        LOG.debug("end  readAll");
        return result;
    }
}
