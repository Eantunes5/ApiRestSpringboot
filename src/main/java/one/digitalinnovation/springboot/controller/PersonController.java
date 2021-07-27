package one.digitalinnovation.springboot.controller;


import one.digitalinnovation.springboot.dto.MessageResponseDTO;
import one.digitalinnovation.springboot.entity.Person;
import one.digitalinnovation.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created peson with ID " + savedPerson.getId())
                .build();
    }
}
