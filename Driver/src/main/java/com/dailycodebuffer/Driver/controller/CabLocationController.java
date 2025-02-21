package com.dailycodebuffer.Driver.controller;

import com.dailycodebuffer.Driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int range=100;
        while(range>0)
        {
            cabLocationService.updateLocation(Math.random() + " ," +Math.random());
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated")
        , HttpStatus.OK);
    }
}
/*@RestController:

Purpose: Marks the class as a RESTful controller.
Function: Indicates that the class is ready to handle HTTP requests.
@RequestMapping("/location"):

Purpose: Maps HTTP requests to specific handler methods.
Function: Specifies that this controller handles requests sent to /location.
CabLocationController:

Purpose: The name of the controller class.
Function: Manages cab location updates.
@Autowired:

Purpose: Automatically wires the CabLocationService bean into the controller.
Function: Allows the controller to use the service's methods for operations.
CabLocationService cabLocationService:

Purpose: A dependency of the controller.
Function: Presumably contains methods related to updating cab locations.
@PutMapping:

Purpose: Indicates that the updateLocation() method handles HTTP PUT requests.
Function: Maps PUT requests to the method.
Components of the Statement
ResponseEntity<>:

Purpose: Represents the entire HTTP response, including status code, headers, and body.
Function: Used to control the HTTP response returned by the controller method.
Map.of("message", "Location Updated"):

Purpose: Creates an immutable map with a single key-value pair.
Function: In this context, it creates a map with a key "message" and a value "Location Updated".
Example: { "message": "Location Updated" }
HttpStatus.OK:

Purpose: Represents the HTTP status code.
Function: Indicates that the request was successful.
Value: HttpStatus.OK corresponds to the HTTP status code 200.
*/
