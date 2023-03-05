package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.services.StudentService;

import ma.pfe.services.StudentServiceImpl;
import org.apache.juli.logging.Log;
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
    @PostMapping
    public StudentDTO save(@RequestBody StudentDTO dto) {
        LOG.debug("Start  save Dto: {}", dto);

            StudentDTO result= service.save(dto);
        LOG.debug("end  create");
        return result;
    }
    @PutMapping
    public StudentDTO update(@RequestBody StudentDTO dto) {
        LOG.debug("Start  update Dto: {}", dto);
        StudentDTO result= service.update(dto);
        LOG.debug("end  update");
        return result;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOG.debug("Start  delete",id);
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
