package com.redhat.demo.webfront.controllers;

import com.redhat.demo.webfront.model.MotionPicture;
import com.redhat.demo.webfront.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class RequestsController {

    @Value("${server.url.demo}")
    private String url;
    private RestTemplate rest = new RestTemplate();
    public List<MotionPicture> listOfMP(){
        return rest.getForObject(url,List.class);
    }

    public void addNewMp(MotionPicture motionPicture){
        rest.postForEntity(url+"addNew", motionPicture, void.class);
    }

    public MotionPicture getMPbyID(int id){
        String idURL =  url + "get/" + id;
        return (rest.getForObject(idURL , MotionPicture.class));
    }

    public void deleteByID(int id){
        String idURL =  url + "delete/" + id;
        rest.delete(idURL);
    }
}
