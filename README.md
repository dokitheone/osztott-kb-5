Készíts egy szerver-kliens alkalmazást socketekkel!

Készítsd el a következő három osztályt, ami egy állatkertet, a benne levő ketreceket és a gondozókat fogja tartalmazni:

Allatkert.java osztály:

adattagok:
egy listában tartalmazza az állatkertben található ketreceket
egy másik listában tartalmazza az állatkertben dolgozó gondozókat
metódusok:
double etetesIdeje(): számítsa ki, hogy az állatkertben levő összes állat megetetéséhez mennyi idő szükséges (percben megadva) figyelembe véve a gondozók számát
double koltseg(): számítsa ki, hogy az állatkertnek mennyit kell fizetnie összesen a gondozóknak az állatok megetetéséért (azaz az etetési idő alatt elvégzett munkáért)
Ketrec.java osztály: minden ketreceben egy fajba tartozó állatok vannak, legalább egy darab

adattagok:
a ketrecben levő állatfaj neve (String)
a ketrecben levő állatok száma
a ketrecben levő állatok megetetéséhez szükséges idő fejenként  (percben)
Gondozo.java osztály:

adattagok:
gondozó neve
gondozó óradíja (egész szám)
        
Készíts egy Client.java osztályt, ami létrehoz egy állatkertet ketrecekkel, gondozókkal. Az adatokat tetszés szerint meghatározhatjátok. Ezután a kliens küldje át az állatkertet szerializálva a szervernek (Server.java). A szerver kiszámolja az etetés idejét, és az állatkert kötlségét. Mindkettőt küldje vissza a kliensnek, majd pedig a kliens írja ki ezeket a képernyőre. Az összes forrásfájlt egy zip-be tömörítve töltsd fel!

