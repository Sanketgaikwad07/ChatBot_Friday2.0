package com.springAi.Friday.Controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping
public class AIcontroller {



    private ChatClient chatClient;
    @Autowired
    public AIcontroller(ChatClient.Builder builder) {
        this.chatClient = builder.build();

    }

    @GetMapping("/chat")
public ResponseEntity<String> chat(@RequestParam(value="q",required = true) String g){

var result=chatClient.prompt(g).call().content();

    return ResponseEntity.ok(result);



    }


}
