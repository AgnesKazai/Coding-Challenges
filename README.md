# Coding-Challenges
-----------------------------------------------------------------------------------------------------

Coding Challenge #1: Conway's Game of Life

Web: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

Rules
- - - - - - - 
The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells, 
each of which is in one of two possible states, alive or dead, (or populated and unpopulated, respectively). 
Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. 
At each step in time, the following transitions occur:

1. Any live cell with fewer than two live neighbors dies, as if by underpopulation.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. 
The first generation is created by applying the above rules simultaneously to every cell in the seed; 
births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick. 
Each generation is a pure function of the preceding one. 
The rules continue to be applied repeatedly to create further generations.

-------------------------------------------------------------------------------------------------------

Coding Challenge #2: Webapplication

A.?  Készíts egy webes alkalmazást, ami egy webshop kedvezménykezelését szimulálja.
Az  alábbi kedvezmény típusok léteznek:  
* 2=3: kettõt fizet, hármat kap. Ha a kosárban van legalább 3 egyforma termék, akkor 3  termékenként 1 termék árát kedvezményként jóvá kell írni.   
* megapack ­6000: vannak nagy kiszerelésû, megapack típusú termékek. Ha ilyen termékbõl  egy teljes kartonnal (12 db) vásárol, akkor 6000 Ft kedvezményt kap kartononként.
A kedvezménytípusok nem összevonhatóak, mindig a legnagyobb kedvezményt nyújtót kell  figyelembe venni az egész kosárra. 
Egy kedvezménytípus ugyanakkor több kedvezményt is  nyújthat. 
Pl. ha vesz 7 gumicsirkét és 4 téliszalámit, akkor 2 gumicsirke és 1 téliszalámi  értéke a kedvezmény a 2=3 kedvezménytípus esetén. 
Hasonlóan, ha megapack uborkából  vesz 12­õt, megapack gesztenyébõl pedig 24­et, akkor 3­szor 6000 Ft a kedvezmény a  megapack ­6000 kedvezménytípus esetén. 
A kedvezénytípusok könnyen bõvíthetõek  legyenek.
A terméklista fix, az alábbi termékek léteznek (a kódban legyen beégetve):  
* név: téliszalámi, ár: 2000, megapack: nem  
* név: gumikacsa, ár: 3000, megapack: nem   
* név: megapack uborka, ár: 2800, megapack: igen   
* név: megapack gesztenye, ár: 1000, megapack: igen     
Az alkalmazás kérje be egy ûrlapon termékenként a termékek darabszámát. 
A válaszban jelenítse meg az eredeti ûrlapot, a megadott darabszámokkal, 
ez alá írja ki a kosár eredeti árát, kedvezményes árát és a kedvezmény típus nevét.     
B.?  Az alkalmazás jelenítse meg az árakat EUR­ban is, 
az MNB webservice­én  (http://www.mnb.hu/arfolyamok.asmx?WSDL) keresztül lekérve a valutaárfolyamot. 

------------------------------------------------------------------------------------------------------


