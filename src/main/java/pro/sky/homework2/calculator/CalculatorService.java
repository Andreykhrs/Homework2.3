package pro.sky.homework2.calculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";

    }

    public int calculatorPlus(int num1, int num2) {
        return num1 + num2;

    }

    public int calculatorMinus(int num1, int num2) {
        return num1 - num2;

    }

    public int calculatorMultiply(int num1, int num2) {

            return num1 * num2;

    }

    public int calculatorDivide(int num1, int num2) {

            return num1 / num2;


    }


}
