package services;

import io.restassured.RestAssured;
import models.Post;
import models.Comment;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiService {
    // Ustalamy bazowy URL API
    public ApiService() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    // Metoda do pobierania posta po ID
    public Post getPostById(int id) {
        return given()
                .when()
                .get("/posts/" + id)
                .then()
                .statusCode(200) // Sprawdzamy, czy odpowiedź ma status 200
                .extract()
                .as(Post.class); // Zwracamy jako obiekt Post
    }

    // Metoda do pobierania wszystkich komentarzy dla danego posta
    public List<Comment> getCommentsForPost(int postId) {
        return given()
                .when()
                .get("/comments?postId=" + postId)
                .then()
                .statusCode(200) // Sprawdzamy, czy odpowiedź ma status 200
                .extract()
                .jsonPath().getList("", Comment.class); // Zwracamy listę komentarzy
    }

    // Metoda do pobierania wszystkich postów
    public List<Post> getAllPosts() {
        return given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200) // Sprawdzamy, czy odpowiedź ma status 200
                .extract()
                .jsonPath().getList("", Post.class); // Zwracamy listę postów
    }
}
