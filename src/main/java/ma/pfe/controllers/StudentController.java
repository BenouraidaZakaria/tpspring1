package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.services.StudentService;

import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentService service;
    StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping("/save")
    public StudentDTO create(@RequestBody StudentDTO dto) {
        LOG.debug("Start  create");
            StudentDTO result= service.create(dto);
        LOG.debug("end  create");
        return result;
    }
    @PutMapping("/update")
    public StudentDTO update(@RequestBody StudentDTO dto) {
        LOG.debug("Start  update");
        StudentDTO result= service.update(dto);
        LOG.debug("end  update");
        return result;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id) {
        LOG.debug("Start  delete");
        boolean result= service.delete(id);
        LOG.debug("end  delete");
        return result;
    }
    @GetMapping
    public List<StudentDTO> readAll() {
        LOG.debug("Start  readAll");
        List<StudentDTO> result= service.readAll();
        LOG.debug("end  readAll");
        return result;
    }
}
