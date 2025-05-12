//package com.ivoyant.joblisting;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class Demo {
//
//
//    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        User user = new User("John", 30);
//
//        // Convert Java object to JSON string
//        String json = mapper.writeValueAsString(user);
//        System.out.println(json); // {"name":"John","age":30}
//    }
//}
//
//class User {
//    private String name;
//    private int age;
//
//    public User(String name, int age)
//    { this.name = name;
//        this.age = age;
//    }
//
//    // Getters and setters required by Jackson
//    public String getName()
//    {
//        return name;
//    }
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//    public int getAge() { return age; }
//    public void setAge(int age) { this.age = age; }
//}
//
//
//
