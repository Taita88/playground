package net.tibor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loris")
public class ControllerForSlowLoris {

    @GetMapping("/slow")
    public ResponseEntity<?> giveInfo(){
        System.out.println("Loris attack");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok("this is response");
    }

}
