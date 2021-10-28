# Esoterische & Frustrerende programmeertalenavond
Oplossingen voor de Esoterische Introavond (event 2021)

Stel, je naam is fred en je lost de eerste challenge op in BrainFuck, dan kan je een PR maken die een file `1/fred.bf` heet waarin je oplossing zit.

https://hacktoberfest.digitalocean.com/

# Challenges

## 1. Print 'Zeus is de max!'

```
Zeus is de max!
```

## 2. Print 'Zeus' in een loop

```
Zeus
Zeus
Zeus
Zeus
...
```

## 3. Neem 1 hoofdletter input, als het een klinker (A, E, I, O, U) is, print 'Klinck', anders print 'Klonk'

```
(in) A
(out) Klinck
```

```
(in) B
(out) Klonk
```

## 4. Zet lowercase om in uppercase en omgekeerd. Alle andere input (cijfers, spaties, ...) mag je afhandelen zoals je wil.

```
(in) WiNA
(out) wIna
```

## 5. Input een getal, tel er 1 bij op en print het uit. De input is een natuurlijk getal (dus groter of gelijk aan nul en geen kommagetal)

```
(in) 5
(out) 6
```

## 6. Je bent een bakker! Je klanten hebben brood gekocht, en je wil optellen hoeveel geld je in totaal ontvangen hebt. Gelukkig kosten alle broden een natuurlijk getal als prijs, en is de prijs per brood maximum 9. Je weet ook dat de totale hoeveelheid geld minder dan 250 is. Neem als input een reeks getallen, output de som. De lijst getallen stopt wanneer je een lege lijn binnenkrijgt.

```
(in) 5
(in) 4
(in) 2
(in)
(out) 11
```

## 7. Print alle priemgetallen

```
(out) 2
(out) 3
(out) 5
(out) 7
(out) 11
...
```

## 8. Inverteer een DNA-streng

```
(in) ATTTGC
(out) TAAACG 
```

## 9. Maak een brainfuck-interpreter

## 10. Neem tekst, en print het terug uit als ASCII-art

## 11. Val het bestuur lastig om meer challenges te maken of contribute aan andere opensource Zeusproject 

# Talen

* Brainfuck (++++)
* Sd (moeilijker dan brainfuck)
* Whitespace (+++++)
* Maze (+++)
* ArnoldC (++)
* JSFuck (++++)
* RCPU (++), maar kinda lastig om op te zetten (git en Python moeten geinstalleerd zijn, niet getest op Windows) (zie https://github.com/redfast00/RCPU)
* Shakespeare (++)
* Rockstar (++)
* BASIC (+)
* Stutter (+++, geen idee of het werkt, https://github.com/redfast00/stutter))
* Befunge


# Extra challenges

* Steek een geldig Brainfuck programma in een Dodona-oefening. De oefening moet correct indienen, en de brainfuck code moet "Zeus is cool" printen
* Steek een geldig whitespace programma in een Dodona-oefening.  De oefening moet correct indienen, en de brainfuck code moet "This is a hidden message" printen
* Maak een programma die "Brainfuck" print als je het als brainfuck programma uitvoert, en "Whitespace" als je het als whitespace programma uitvoert. Extra props als het eruitziet als het Zeuslogo in ascii-art

## Hoe dingen uitvoeren

- Brainfuck:
    - online: https://copy.sh/brainfuck/
    - compile: https://github.com/FKD13/brainfuck-transpiler
    - compile naar RCPU: https://github.com/redfast00/rcpu_compiler
- Sd: (niet online): https://gist.github.com/urbanangel/7cd8ed849e6faa4e53434b384c4a09a8
- Whitespace: https://www.jdoodle.com/execute-whitespace-online
- Maze: (niet online, wel amazing): https://github.com/olls/maze-interpreter-v2
- ArnoldC: https://mapmeld.com/ArnoldC/#
- JSFuck: (moet je de javascript nog wel zelf runnen :) ): http://codertab.com/JsUnFuck
- RCPU: roep heel luid "JASPER WTF IS DIT"
- Shakespeare: https://tio.run/#spl
- Rockstar: (niet online) https://github.com/dylanbeattie/rockstar
- BASIC: https://www.jdoodle.com/execute-freebasic-online
- Stutter: roep heel luid "JASPER DIT IS SHIT"
- Befunge: http://www.quirkster.com/iano/js/befunge.html

Kijk ook eens op tio.run voor andere talen.
