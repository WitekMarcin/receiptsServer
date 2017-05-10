/*
 * Copyright (c) Marcin Witek 2017
 */

package org.receiptsServerApplication.service;

import org.receiptsServerApplication.model.RecipeProvider;
import org.receiptsServerApplication.repository.RecipeProviderRepository;
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
