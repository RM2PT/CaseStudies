package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.controller.generic.GenericController;
import com.automatedtellermachinesystem.controller.generic.response.GenericResponse;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import com.automatedtellermachinesystem.service.ManageBankCardCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bankcard",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class BankCardController extends GenericController {

    private final ManageBankCardCRUDService manageBankCardCRUDService;

    @Autowired
    public BankCardController(ManageBankCardCRUDService manageBankCardCRUDService) {
        this.manageBankCardCRUDService = manageBankCardCRUDService;
    }

    @PostMapping("/create")
    public @ResponseBody
    GenericResponse createBankCard(@RequestParam int cardId,
                                   @RequestParam CardStatus cardStatus,
                                   @RequestParam CardCatalog cardCatalog,
                                   @RequestParam int password,
                                   @RequestParam float balance) {
        manageBankCardCRUDService.createBankCard(cardId, cardStatus, cardCatalog, password, balance);
        return createSuccessResponse("Bank Card created!");
    }

    @PostMapping("/modify")
    public @ResponseBody
    GenericResponse modifyBankCard(@RequestParam int cardId,
                                   @RequestParam CardStatus cardStatus,
                                   @RequestParam CardCatalog cardCatalog,
                                   @RequestParam int password,
                                   @RequestParam float balance) {
        manageBankCardCRUDService.modifyBankCard(cardId, cardStatus, cardCatalog, password, balance);
        return createSuccessResponse("Bank Card modified!");
    }

    @GetMapping("/queryCard")
    public @ResponseBody
    GenericResponse queryBankCard(@RequestParam int cardId) {
        return createSuccessResponse(manageBankCardCRUDService.queryBankCard(cardId));
    }

    @PostMapping("/delete")
    public @ResponseBody
    GenericResponse deleteBankCard(@RequestParam int cardId) {
        return createSuccessResponse(manageBankCardCRUDService.deleteBankCard(cardId));
    }
}