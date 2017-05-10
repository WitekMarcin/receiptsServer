/*
 * Copyright (c) Marcin Witek 2017
 */

package org.receiptsServerApplication.api;

import org.receiptsServerApplication.model.RecipeProvider;
import org.receiptsServerApplication.service.RecipeProviderService;
import org.springframework.beans.factory.annotation.Autowired;
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



        return null;
    }


}
