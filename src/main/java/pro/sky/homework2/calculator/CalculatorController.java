package pro.sky.homework2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping (path = "/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


   @GetMapping()
    public String calculator() {
        return calculatorService.calculator();
    }
    @GetMapping(path= "/plus")
    public String calculatorPlus(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Параметр(ы) отсутствует(ют)!";

        } else {
        return num1 + " + " + num2 + " = " + calculatorService.calculatorPlus(num1, num2);
        }
    }
    @GetMapping(path= "/minus")
    public String calculatorMinus(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Параметр(ы) отсутствует(ют)!";

        } else {
            return num1 + " - " + num2 + " = " + calculatorService.calculatorMinus(num1, num2);
        }
    }

    @GetMapping(path= "/multiply")
    public String calculatorMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Параметр(ы) отсутствует(ют)!";

        } else {
            return num1 + " * " + num2 + " = " + calculatorService.calculatorMultiply(num1, num2);
        }
    }
    @GetMapping(path= "/divide")
    public String calculatorDivide(@RequestParam(value = "num1", required = false) Integer num1,
                                   @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Параметр(ы) отсутствует(ют)!";

        } else if (num2 == 0) {
            return "Делить на 0 нельзя!";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.calculatorDivide(num1, num2);
        }
    }



}
