/*
 * Copyright (c) Marcin Witek 2017
 */

package com.example.radioaktywny.receipts.api;

import com.example.radioaktywny.receipts.model.RecipeProvider;
import com.example.radioaktywny.receipts.service.RecipeProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReceiptsController {

    @Autowired
    RecipeProviderService recipeProviderService;

    @RequestMapping(path = "/sendRecipe",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RecipeProvider> saveRecipe(@RequestBody RecipeProvider recipe) {

        return new ResponseEntity<RecipeProvider>(HttpStatus.OK);
    }


}
