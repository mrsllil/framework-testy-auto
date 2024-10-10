import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    // Testuje endpoint dla konkretnego posta
    @Test
    public void testGetEndpoint() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Ustala bazowy URL API

        // Wykonuje zapytanie GET dla konkretnego posta
        given().
                when().
                get("/posts/1").
                then().
                assertThat().
                statusCode(200). // Sprawdza, czy odpowiedź ma status 200
                body("userId", equalTo(1)); // Sprawdza, czy userId posta jest równy 1
    }

    // Testuje, czy API zwraca wszystkie posty
    @Test
    public void testGetAllPosts() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Ustala bazowy URL API

        // Wykonuje zapytanie GET dla wszystkich postów
        given().
                when().
                get("/posts").
                then().
                assertThat().
                statusCode(200). // Sprawdza, czy odpowiedź ma status 200
                body("size()", equalTo(100)); // Zakładając, że API zwraca 100 postów
    }

    // Testuje pobieranie komentarzy dla konkretnego posta
    @Test
    public void testGetCommentsForPost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Ustala bazowy URL API

        // Wykonuje zapytanie GET dla komentarzy do posta o postId = 1
        given().
                when().
                get("/comments?postId=1").
                then().
                assertThat().
                statusCode(200). // Sprawdza, czy odpowiedź ma status 200
                body("[0].postId", equalTo(1)) // Sprawdza, czy pierwszy komentarz dotyczy postu o postId = 1
                .body("[0].name", equalTo("id labore ex et quam laborum")) // Sprawdza konkretne pole w pierwszym komentarzu
                .body("[0].email", equalTo("Eliseo@gardner.biz")); // Sprawdza email
    }

    // Testuje, czy odpowiedź z komentarzami jest tablicą
    @Test
    public void testResponseIsArray() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Ustala bazowy URL API

        // Wykonuje zapytanie GET dla komentarzy do posta o postId = 1
        given().
                when().
                get("/comments?postId=1").
                then().
                assertThat().
                statusCode(200). // Sprawdza, czy odpowiedź ma status 200
                body("$", isA(List.class)); // Sprawdza, czy odpowiedź jest tablicą
    }

    // Testuje, czy API zwraca odpowiednią liczbę komentarzy dla posta
    @Test
    public void testGetNumberOfCommentsForPost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Ustala bazowy URL API

        // Wykonuje zapytanie GET dla komentarzy do posta o postId = 1
        given().
                when().
                get("/comments?postId=1").
                then().
                assertThat().
                statusCode(200). // Sprawdza, czy odpowiedź ma status 200
                body("size()", equalTo(5)); // Zakładając, że API zwraca 5 komentarzy dla tego posta
    }

}
