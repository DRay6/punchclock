# M223: Punchclock
Dies ist das Prüfungsprojekt von Modul 223. Es ist eine erweiterung des Beispielprogrammes des Modul 223.

## Was macht die Applikation?
Die Applikaiton ist eine Multiuser Applikation. 
Man kann Anwender als Benutzer oder als Admin hinzufügen.
Benutzer können sich ein und auschecken. Diese Einträge werden hier als Entrys bezeichnet.
Admins verwalten die Benutzer.

## Wie startet man die Applikation
Konfiguriere den Port auf 8081. Starte Spring. Ports erreicht man über localhost.
Die URL würde in diesem Falle "http://localhost:8081" heissen


Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank: http://localhost:8081/h2-console