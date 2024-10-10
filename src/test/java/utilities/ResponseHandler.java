package utilities;

public class ResponseHandler {

    // Metoda do sprawdzania statusu kodu
    public static void checkStatusCode(int actualStatusCode, int expectedStatusCode) {
        // Sprawdza, czy status kod jest zgodny
        if (actualStatusCode != expectedStatusCode) {
            throw new AssertionError("Expected status code " + expectedStatusCode + " but got " + actualStatusCode);
        }
    }

}
