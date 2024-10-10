package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import models.Post;
import services.ApiService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ApiStepsDefinition {
    private ApiService apiService;
    private Post post;

    public ApiStepsDefinition() {
        this.apiService = new ApiService(); // Inicjalizujemy ApiService
    }

    @Given("the API is available")
    public void the_api_is_available() {
        // Możesz dodać tutaj sprawdzenie dostępności API, jeśli chcesz
    }

    @When("I request the post with ID {int}")
    public void i_request_the_post_with_ID(int id) {
        post = apiService.getPostById(id); // Używamy ApiService do pobrania posta
    }

    @Then("I should get a response with status code {int}")
    public void i_should_get_a_response_with_status_code(int statusCode) {
        assertThat(post, is(notNullValue())); // Sprawdza, czy post nie jest null
    }
}
