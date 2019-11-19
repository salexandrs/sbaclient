package com.example.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "operations/v1/feed", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MasterRestService {

  @PostMapping("/kafka")
  public String feedBazarVoice(@RequestBody String command) {
    System.out.println(command);
    return command;
  }
}
