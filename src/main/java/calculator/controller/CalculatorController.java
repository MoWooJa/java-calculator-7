package calculator.controller;

import calculator.service.CalculatorService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    private InputView inputView;
    private OutputView outputView;
    private CalculatorService calculatorService;

    public CalculatorController(InputView inputView, OutputView outputView, CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void run() {

    }
}
