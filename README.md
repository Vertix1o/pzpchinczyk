# pzpchinczyk
-Główne założenia funkcjonalności (na moment przed zrobieniem UML):
-Plansza jest zaprojektowana jako jednowymiarowa zapętlona tablica długości 40. (nie wliczając domków)
-Możliwość gry od 2 do 4 graczy. Metoda inicjalizująca pozwalająca zmienić ilość graczy. Gracze są przechowywani w tablicy.
-Klasa gracza ma swój numer oraz 4 pionki.
-Od indeksu zależy z którego domku startuje gracz (główna plansza zaczyna się w początku planszy czerwonego, z każdym indeksem miejsce wyciągnięcia pionka zmienia się o 10. Czyli np dla 2 graczy, gracz nr 1 zaczyna na polu o numerze 0, a gracz nr 2 wystawia pionki na polu o numerze 20
-Pionki przechowują informacje o swojej pozycji WZGLĘDNEJ. Dodatkowo pozycja pionka jest zawarta pomiędzy 0 a 43 (40 pól z planszy, 4 domki).
-Do ruchu pionka przekazywana jest wylosowana liczba z kostki.
