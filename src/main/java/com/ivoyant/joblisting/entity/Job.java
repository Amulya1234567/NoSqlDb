package com.ivoyant.joblisting.entity;

import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.*;

//    @Document(collection = "joblisting")
    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Job {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String title;
        private String description;
        private String location;
        private double salary;
    }


