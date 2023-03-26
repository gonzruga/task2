package com.springcourse.task2;


import org.springframework.web.bind.annotation.*;

@RestController


public class postPublisher {

    @RequestMapping(value="/name", method = RequestMethod.POST, consumes = "application/json")
    public String postFullNames(@RequestBody taskPost post){
        return "Full name: " +post.getFirstName()+ " " +post.getLastName();
}


}
