package com.ivoyant.joblisting.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document(collection = "joblisting")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Job {
        @Id
        private String id;
        private String title;
        private String description;
        private String location;
        private double salary;
    }


