package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) String firstNum, @RequestParam(value = "num2", required = false) String secondNum) {
        return calculatorService.plus(firstNum, secondNum);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) String firstNum, @RequestParam(value = "num2", required = false) String secondNum) {
        return calculatorService.minus(firstNum, secondNum);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) String firstNum, @RequestParam(value = "num2", required = false) String secondNum) {
        return calculatorService.multiply(firstNum, secondNum);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) String firstNum, @RequestParam(value = "num2", required = false) String secondNum) {
        return calculatorService.divide(firstNum, secondNum);
    }
}
