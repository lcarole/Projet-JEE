package fr.esgi.project_manager_api;

import fr.esgi.project_manager_api.controllers.UserController;
import fr.esgi.project_manager_api.models.User;
import fr.esgi.project_manager_api.services.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.given;

//@SpringBootTest
//@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class ProjectManagerApiApplicationTests {

    /*
    @Autowired
    private MockMvc mvc;
    @MockBean
    private UserService userService;


    @Test
    public void shouldFindAllUser() throws Exception {
        User user1 = new User();
        user1.setLastname("gouro");
        user1.setFirstname("teo");
        user1.setEmail("teogouro@gmail.com");
        user1.setPassword("1234");

        given(this.userService.readAll())
                .willReturn(asList(
                        user1
                )
        );


        this.mvc.perform(get("/all"))
                .andExpect(status().isOk());
        //.andExpect(jsonPath("$.length()", is(1)))
        //.andExpect(jsonPath("$.[0].email", is("teogouro@gmail.com")));
    }
    */

}
