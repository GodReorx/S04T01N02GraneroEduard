package cat.itacademy.barcelonactiva.granero.eduard.s04.t01.n02.S04T01N02GraneroEduard.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String sayHi(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hola " + name + ". Estas en un proyecto Gradle.";
    }
    @RequestMapping (value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String sayHi2(@PathVariable(required = false) String name){
        return "Hola " + name + ". Estas en un proyecto Gradle.";
    }
}
