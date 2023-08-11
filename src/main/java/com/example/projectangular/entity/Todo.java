package com.example.projectangular.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name ="username" , nullable = false )
    private String username;
    @Column(name ="description" , nullable = false )
    private String description;
    @Column(name ="time")
    private LocalDate time;
    @Column(name ="boolean" , nullable = false )
    private boolean isDone;

}