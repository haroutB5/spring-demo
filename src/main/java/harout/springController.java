package harout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springController {
    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "welcome "+ name+" to our page";
    }
}

