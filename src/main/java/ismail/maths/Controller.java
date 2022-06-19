package ismail.maths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PseudoColumnUsage;

@RestController
public class Controller {

    @Autowired
    private MathService mathService;

    @PostMapping("/")
    public Result getAdditionResult(@RequestParam int firstNumber, @RequestParam int secondNumber){
        Result result=  mathService.doAddition(firstNumber, secondNumber);
        return result;


    }


}
