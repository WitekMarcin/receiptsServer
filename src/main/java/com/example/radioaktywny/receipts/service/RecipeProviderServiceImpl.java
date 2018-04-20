/*
 * Copyright (c) Marcin Witek 2017
 */

package com.example.radioaktywny.receipts.service;

import com.example.radioaktywny.receipts.model.RecipeProvider;
import com.example.radioaktywny.receipts.repository.RecipeProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marcin  on 10.05.2017.
 */
@Service
public class RecipeProviderServiceImpl implements RecipeProviderService {

    @Autowired
    RecipeProviderRepository recipeProviderRepository;

    @Override
    public boolean save(RecipeProvider recipeProvider) {
        recipeProviderRepository.save(recipeProvider);
        return true;
    }
}
