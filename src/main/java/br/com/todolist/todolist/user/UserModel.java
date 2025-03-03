package br.com.todolist.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "name")
    private String name;
    
    @Column(name = "password")
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
