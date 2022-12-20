package PackageConroller;


import PackageService.ServiceBuzz;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Data@NoArgsConstructor
public class ControllerBuzz {
    private  ServiceBuzz buzzObject ;

    @Autowired
    public ControllerBuzz(ServiceBuzz buzzObject) {
        this.buzzObject = buzzObject;

    }

    @GetMapping("/FizzBuzz")
    public ArrayList<String> getBuzzResult() {
        ArrayList<String> buzzResultList = buzzObject.fizzBuzz(6);
        return buzzResultList;

    }
}
