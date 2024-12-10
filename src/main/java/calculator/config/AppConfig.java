package calculator.config;

import calculator.controller.CalculatorController;
import calculator.service.CalculatorService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class AppConfig {

    public CalculatorController calculatorController() {
        return new CalculatorController(inputView(), outputView(), calculatorService());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private CalculatorService calculatorService() {
        return new CalculatorService();
    }


}