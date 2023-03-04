package com.example.demo.calculator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CalculatorController {
    private final CalculatorService service;

    @PostMapping()
    public List<CalculatorResponse> calculator(@RequestBody CalculatorRequest request,
                                               @RequestParam CountType countType,
                                               @RequestParam CreditType creditType) {
        return service.calculator(request, countType ,creditType);

    }
}
