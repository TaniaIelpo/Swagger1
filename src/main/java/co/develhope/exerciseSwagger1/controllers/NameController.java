package co.develhope.exerciseSwagger1.controllers;

/**
 * @author Tania Ielpo
 */

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value="")
    @ApiOperation(value="Your name",notes="Prints out the name" )
    @ApiResponses({
            @ApiResponse(code=400, message = "BAD DATA INPUT"),
            @ApiResponse(code=500, message = "INTERNAL ERROR FROM SPRING", response = String.class),
            @ApiResponse(code=202, message = "Created")
    })
    public String getYourName(){
        return "My name is Tania";
    }
}
