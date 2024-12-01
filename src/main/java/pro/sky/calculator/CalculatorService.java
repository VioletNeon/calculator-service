package pro.sky.calculator;

interface CalculatorService {
    String greetings();

    String plus(String firstNum, String secondNum);

    String minus(String firstNum, String secondNum);

    String multiply(String firstNum, String secondNum);

    String divide(String firstNum, String secondNum);
}
