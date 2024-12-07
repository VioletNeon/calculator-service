package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public int plus(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int minus(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public float divide(int firstNum, int secondNum) {
        return (float) firstNum / secondNum;
    }
}
