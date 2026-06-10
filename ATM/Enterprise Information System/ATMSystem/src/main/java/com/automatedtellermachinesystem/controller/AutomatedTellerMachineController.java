package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.controller.generic.GenericController;
import com.automatedtellermachinesystem.controller.generic.response.GenericResponse;
import com.automatedtellermachinesystem.service.AutomatedTellerMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/automatedTellerMachine",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class AutomatedTellerMachineController extends GenericController {

    private final AutomatedTellerMachineService automatedTellerMachineService;

    @Autowired
    public AutomatedTellerMachineController(AutomatedTellerMachineService automatedTellerMachineService) {
        this.automatedTellerMachineService = automatedTellerMachineService;
    }

    @PostMapping("/ejectCard")
    public @ResponseBody
    GenericResponse ejectCard() {
        automatedTellerMachineService.ejectCard();
        return createSuccessResponse("Bank Card ejected!");
    }

    @PostMapping("/inputCard")
    public @ResponseBody
    GenericResponse inputCard(@RequestParam int cardId) {
        automatedTellerMachineService.inputCard(cardId);
        return createSuccessResponse("Bank Card entered successfully!");
    }

    @PostMapping("/inputPassword")
    public @ResponseBody
    GenericResponse inputPassword(@RequestParam int password) {
        return createSuccessResponse(automatedTellerMachineService.inputPassword(password));
    }

    @PostMapping("/printReceipt")
    public @ResponseBody
    GenericResponse printReceipt() {
        return createSuccessResponse(automatedTellerMachineService.printReceipt());
    }

    @PostMapping("/checkBalance")
    public @ResponseBody
    GenericResponse checkBalance() {
        return createSuccessResponse(automatedTellerMachineService.checkBalance());
    }

    @PostMapping("/withdrawCash")
    public @ResponseBody
    GenericResponse withdrawCash(@RequestParam float quantity) {
        return createSuccessResponse(automatedTellerMachineService.withdrawCash(quantity));
    }

    @PostMapping("/depositFunds")
    public @ResponseBody
    GenericResponse depositFunds(@RequestParam float quantity) {
        return createSuccessResponse(automatedTellerMachineService.depositFunds(quantity));
    }
}
