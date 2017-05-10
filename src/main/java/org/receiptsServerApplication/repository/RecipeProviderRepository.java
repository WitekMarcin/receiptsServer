/*
 * Copyright (c) Marcin Witek 2017
 */

package org.receiptsServerApplication.repository;

import org.receiptsServerApplication.model.RecipeProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marcin  on 10.05.2017.
 */
@Repository
public interface RecipeProviderRepository extends JpaRepository<RecipeProvider,Long> {
}
