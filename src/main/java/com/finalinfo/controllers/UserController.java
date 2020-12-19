package com.finalinfo.controllers;

import com.finalinfo.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.Http.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController{

    @Autowired
    private PostRepository postRepository;
    
    //GET todos los Usuarios
    @GetMapping
    public ResponseEntity<?> getUser(){
        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }

    //POST Crear un Usuario
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATE);
    }

    //PUT para modificar un Usuario segun ID
    @PutMapping("/{userId}")
    public ResponseEntity<?> editPost(@PathVariable Long Id, @RequestBody Post user) {
        Post postEdit = postRepository.getOne(Id);
        postEdit.setTitle(post.getTitle());
        return new ResponseEntity<>(postRespository.save(postEdit), HttpStatus.OK);
    }

    //DELETE borrar un Usuario segun Id.
    @DeleteMapping("/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable Long postId, @RequestBody Post user){
        Post postDelete = postRepository.getOne(Id);
        postRepository.delete(postDelete);
        return new ResponseEntity<>(HttpStatus.Ok);
    }

    private Map<Integer, String> inicializarRepo() {
        Map<Integer, String> post = new HashMap<>();
    }
}