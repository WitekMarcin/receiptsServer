/*
 * Copyright (c) Marcin Witek 2017
 */

package org.receiptsServerApplication.api;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.receiptsServerApplication.model.RecipeProvider;
import org.receiptsServerApplication.service.RecipeProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReceiptsControllerIT {

    private MockMvc mockMvc;

    @MockBean
    RecipeProviderService recipeProviderRepository;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testBodyHasToBeNotEmpty() throws Exception {
        mockMvc.perform(
                post("/sendRecipe")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testOnlyPostMethodIsAllowed() throws Exception {
        RecipeProvider recipe = new RecipeProvider();
        recipe.setPathToThePicture("MyName");
        String json = new Gson().toJson(recipe);

        mockMvc.perform(
                post("/sendRecipe")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk());

        mockMvc.perform(
                get("/sendRecipe")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isMethodNotAllowed());
    }

}
