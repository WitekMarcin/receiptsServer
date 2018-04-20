/*
 * Copyright (c) Marcin Witek 2017
 */

package com.example.radioaktywny.receipts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Marcin  on 10.05.2017.
 */
@Entity
public class RecipeProvider {

    @Id
    @GeneratedValue
    private Long id;

    private String pathToThePicture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPathToThePicture() {
        return pathToThePicture;
    }

    public void setPathToThePicture(String pathToThePicture) {
        this.pathToThePicture = pathToThePicture;
    }

}
