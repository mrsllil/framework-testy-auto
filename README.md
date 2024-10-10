# Framework Testowy - API Testy Automatyczne

## Opis projektu

Projekt ma na celu stworzenie frameworka do automatyzacji testów API przy użyciu języka Java, bibliotek RestAssured, Cucumber oraz JUnit. Framework jest zaprojektowany w celu ułatwienia testowania i weryfikacji zachowań API zgodnie z zasadami BDD (Behaviour Driven Development).

## Użyte technologie

- **Java**: Wersja 17, język programowania używany do budowy aplikacji.
- **Maven**: Narzędzie do zarządzania zależnościami i budowania projektu, które ułatwia dodawanie bibliotek oraz zarządzanie wersjami.
- **Spring Boot**: Framework, który upraszcza tworzenie aplikacji backendowych, zapewniając łatwe uruchamianie i konfigurowanie aplikacji opartych na Springu.
- **RestAssured**: Biblioteka do testowania API, która umożliwia pisanie czytelnych i zrozumiałych testów w celu weryfikacji zachowania API.
- **JUnit**: Framework do testowania w Javie, który zapewnia mechanizm do pisania i uruchamiania testów jednostkowych.
- **Cucumber**: Framework do BDD (Behavior Driven Development), który umożliwia pisanie testów w języku naturalnym, co pozwala na lepszą współpracę pomiędzy zespołami technicznymi a nietechnicznymi.

## Używane API

W projekcie korzystam z API [JSONPlaceholder](https://jsonplaceholder.typicode.com), które jest fikcyjnym API do testowania i prototypowania. Udostępnia różne zasoby, takie jak posty, komentarze, użytkownicy, itp., co umożliwia testowanie funkcji związanych z obsługą danych.

## Jak uruchomić projekt

Aby uruchomić projekt, upewnij się, że masz zainstalowane następujące oprogramowanie:

- Java JDK (w wersji 17 lub wyższej)
- Maven

Następnie wykonaj poniższe kroki:

1. Skopiuj projekt na lokalny dysk.
2. Otwórz terminal i przejdź do katalogu projektu.
3. Wykonaj polecenie `mvn clean install`, aby zainstalować wszystkie zależności.
4. Uruchom testy przy pomocy Cucumbera.

## BDD z Cucumber

Cucumber umożliwia pisanie testów w zrozumiały sposób, korzystając z naturalnego języka, co ułatwia współpracę z osobami, które nie są programistami. Scenariusze są napisane w plikach `.feature`, a kroki są zdefiniowane w klasach w języku Java.

## Jak dodać zależność w Maven

1. Otwórz plik `pom.xml`.
2. Użyj skrótu do otwarcia okna generowania: (Alt + Insert).
3. Kliknij na przycisk „Add dependency”.

## Kontakt

Klaudia Więcko  
Email: [klaudia.wiecko@gmail.com](mailto:klaudia.wiecko@gmail.com)

