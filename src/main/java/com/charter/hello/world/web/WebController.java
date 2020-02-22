package com.charter.hello.world.web;

import com.charter.hello.world.model.HelloWorldResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    HelloWorldResponse helloWorldResponse = new HelloWorldResponse();

    @GetMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody
    HelloWorldResponse getMessage(){
        return helloWorldResponse;
    }

    @PostMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody
    void postMessage(@RequestBody HelloWorldResponse request){
        helloWorldResponse.setMessage(request.getMessage());
    }
}
