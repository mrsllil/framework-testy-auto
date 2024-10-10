package handlers;

import models.Comment;
import utilities.ResponseHandler;

import java.util.List;

public class CommentHandler {

    // Metoda do walidacji komentarzy
    public void validateComments(List<Comment> comments) {
        for (Comment comment : comments) {
            ResponseHandler.checkStatusCode(200, comment.getId()); // Przyjmujemy, że comment.getId() to status kod
        }
    }
}
