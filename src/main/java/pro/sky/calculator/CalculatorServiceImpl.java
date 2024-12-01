package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private final String EMPTY_PARAM_ERROR_MSG = "Задайте числовые параметры!";
    private final String NOT_A_NUMBER_ERROR_MSG = "Введите числовой параметр!";
    private final String COLOR_FOR_SUCCESS = "green";
    private final String COLOR_FOR_ERROR = "red";
    private final String EQUALS = " = ";

    public String greetings() {
        return this.wrapInHtml("Добро пожаловать в калькулятор!", "blue");
    }

    public String plus(String firstNum, String secondNum) {
        String result;

        if (firstNum == null || secondNum == null || firstNum.isEmpty() || secondNum.isEmpty()) {
            return this.wrapInHtml(EMPTY_PARAM_ERROR_MSG, COLOR_FOR_ERROR);
        }

        int firstParam;
        int secondParam;

        try {
            firstParam = Math.abs(Integer.parseInt(firstNum));
            secondParam = Math.abs(Integer.parseInt(secondNum));
        } catch (Exception e) {
            return this.wrapInHtml(NOT_A_NUMBER_ERROR_MSG, COLOR_FOR_ERROR);
        }

        result = firstParam + " + " + secondParam + EQUALS + (firstParam + secondParam);

        return this.wrapInHtml(result, COLOR_FOR_SUCCESS);
    }

    public String minus(String firstNum, String secondNum) {
        String result;

        if (firstNum == null || secondNum == null || firstNum.isEmpty() || secondNum.isEmpty()) {
            return this.wrapInHtml(EMPTY_PARAM_ERROR_MSG, COLOR_FOR_ERROR);
        }

        int firstParam;
        int secondParam;

        try {
            firstParam = Math.abs(Integer.parseInt(firstNum));
            secondParam = Math.abs(Integer.parseInt(secondNum));
        } catch (Exception e) {
            return this.wrapInHtml(NOT_A_NUMBER_ERROR_MSG, COLOR_FOR_ERROR);
        }

        result = firstParam + " - " + secondParam + EQUALS + (firstParam - secondParam);

        return this.wrapInHtml(result, COLOR_FOR_SUCCESS);
    }

    public String multiply(String firstNum, String secondNum) {
        String result;

        if (firstNum == null || secondNum == null || firstNum.isEmpty() || secondNum.isEmpty()) {
            return this.wrapInHtml(EMPTY_PARAM_ERROR_MSG, COLOR_FOR_ERROR);
        }

        int firstParam;
        int secondParam;

        try {
            firstParam = Math.abs(Integer.parseInt(firstNum));
            secondParam = Math.abs(Integer.parseInt(secondNum));
        } catch (Exception e) {
            return this.wrapInHtml(NOT_A_NUMBER_ERROR_MSG, COLOR_FOR_ERROR);
        }

        result = firstParam + " * " + secondParam + EQUALS + (firstParam * secondParam);

        return this.wrapInHtml(result, COLOR_FOR_SUCCESS);
    }

    public String divide(String firstNum, String secondNum) {
        String result;

        if (firstNum == null || secondNum == null || firstNum.isEmpty() || secondNum.isEmpty()) {
            return this.wrapInHtml(EMPTY_PARAM_ERROR_MSG, COLOR_FOR_ERROR);
        }

        int firstParam;
        int secondParam;

        try {
            firstParam = Math.abs(Integer.parseInt(firstNum));
            secondParam = Math.abs(Integer.parseInt(secondNum));
        } catch (Exception e) {
            return this.wrapInHtml(NOT_A_NUMBER_ERROR_MSG, COLOR_FOR_ERROR);
        }

        if (firstParam == 0 || secondParam == 0) {
            return this.wrapInHtml("Делить на 0 - нельзя!", COLOR_FOR_ERROR);
        }

        result = firstParam + " / " + secondParam + EQUALS + ((float) firstParam / secondParam);

        return this.wrapInHtml(result, COLOR_FOR_SUCCESS);
    }

    private String wrapInHtml(String item, String color) {
        return "<div style='position:absolute;top:50%;left:50%;transform:translate(-50%);font-size:32px;font-weight:500;color:" + color + "'>" + item + "</div>";
    }
}
