# UserDao – Prosta obsługa użytkowników w bazie danych

Projekt zawiera klasę `UserDao`, która umożliwia podstawową obsługę użytkowników w bazie danych SQL (CRUD: Create, Read, Update, Delete). Hasła są bezpiecznie hashowane za pomocą algorytmu BCrypt.

## Funkcjonalności

- Tworzenie nowego użytkownika w bazie (`create`)
- Odczytywanie danych użytkownika po ID (`read`)
- Aktualizacja danych użytkownika (`update`)
- Usuwanie użytkownika po ID (`delete`)
- Wyświetlanie wszystkich użytkowników (`findAll`)
- Bezpieczne hashowanie haseł (BCrypt)

## Struktura projektu

- `UserDao` – główna klasa DAO do obsługi użytkowników
- `User` – klasa encji reprezentująca użytkownika 
- `DbUtil` – narzędzie do uzyskiwania połączenia z bazą 
- Do działania wymagana jest biblioteka `org.mindrot.jbcrypt.BCrypt` do haszowania haseł