package com.rawate.theappbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tutorials")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="published")
    private boolean published;

}
