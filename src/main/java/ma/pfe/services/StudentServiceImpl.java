package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public StudentDTO create(StudentDTO dto) {
        return mapper.convertToDTO(repository.create(mapper.convertToEntity(dto)));
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        return mapper.convertToDTO(repository.update(mapper.convertToEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        return repository.delete(id);
    }

    @Override
    public List<StudentDTO> readAll() {
        return mapper.convertToDTOs(repository.readAll());
    }
}
