package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/example")
@Api(value = "Example Resource", description = "shows example")
public class ExampleResource {

    @ApiOperation(value = "Returns example")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful example")
            }
    )
    @GetMapping
    public String example() {
        return "example";
    }

    @ApiOperation(value = "Returns example")
    @PostMapping("/post")
    public String examplePost(@RequestBody final String example) {
        return example;
    }

    @ApiOperation(value = "Returns example")
    @PutMapping("/put")
    public String examplePut(@RequestBody final String example) {
        return example;
    }
}

