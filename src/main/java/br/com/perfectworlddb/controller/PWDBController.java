package br.com.perfectworlddb.controller;

import br.com.perfectworlddb.model.User;
import br.com.perfectworlddb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
public class PWDBController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{cpf}")
    public Optional<User> getCpf(@PathVariable String cpf) {
        return userRepository.findByCpf(cpf);
    }

    @Transactional
    @PostMapping("/user")
    public ResponseEntity<Object> createItems(@RequestBody User request) {

        Optional<User> user = userRepository.findByCpf(request.getCpf());

        if (user.isEmpty()) {
            userRepository.save(request);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("null");
        }
    }

    @PutMapping("/user/{cpf}")
    @Transactional
    public ResponseEntity<Object> atualiza(@RequestBody User request){

        Optional<User> user = userRepository.findByCpf(request.getCpf());

        if (user.isPresent()) {
            userRepository.save(request);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("null");
        }
    }

    @Transactional
    @DeleteMapping("/user/{cpf}")
    public ResponseEntity<Object> deleteItem(@PathVariable String cpf) {

        Optional<User> optional = userRepository.findByCpf(cpf);

        if(optional.isPresent()) {
            userRepository.deleteByCpf(cpf);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("null");
        }
    }

}
