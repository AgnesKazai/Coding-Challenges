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

A.? �K�sz�ts�egy�webes�alkalmaz�st,�ami�egy�webshop�kedvezm�nykezel�s�t�szimul�lja.
Az� al�bbi�kedvezm�ny�t�pusok�l�teznek:� 
*�2=3:�kett�t�fizet,�h�rmat�kap.�Ha�a�kos�rban�van�legal�bb�3�egyforma�term�k,�akkor�3� term�kenk�nt�1�term�k��r�t�kedvezm�nyk�nt�j�v�kell��rni.�� 
*�megapack��6000:�vannak�nagy�kiszerel�s�,�megapack�t�pus��term�kek.�Ha�ilyen�term�kb�l� egy�teljes�kartonnal�(12�db)�v�s�rol,�akkor�6000�Ft�kedvezm�nyt�kap�kartononk�nt.
A�kedvezm�nyt�pusok�nem��sszevonhat�ak,�mindig�a�legnagyobb�kedvezm�nyt�ny�jt�t�kell� figyelembe�venni�az�eg�sz�kos�rra.�
Egy�kedvezm�nyt�pus�ugyanakkor�t�bb�kedvezm�nyt�is� ny�jthat.�
Pl.�ha�vesz�7�gumicsirk�t��s�4�t�liszal�mit,�akkor�2�gumicsirke��s�1�t�liszal�mi� �rt�ke�a�kedvezm�ny�a�2=3�kedvezm�nyt�pus�eset�n.�
Hasonl�an,�ha�megapack�ubork�b�l� vesz�12��t,�megapack�geszteny�b�l�pedig�24�et,�akkor�3�szor�6000�Ft�a�kedvezm�ny�a� megapack��6000�kedvezm�nyt�pus�eset�n.�
A�kedvez�nyt�pusok�k�nnyen�b�v�thet�ek� legyenek.
A�term�klista�fix,�az�al�bbi�term�kek�l�teznek�(a�k�dban�legyen�be�getve):��
*�n�v:�t�liszal�mi,��r:�2000,�megapack:�nem��
*�n�v:�gumikacsa,��r:�3000,�megapack:�nem�� 
*�n�v:�megapack�uborka,��r:�2800,�megapack:�igen�� 
*�n�v:�megapack�gesztenye,��r:�1000,�megapack:�igen�� � 
Az�alkalmaz�s�k�rje�be�egy��rlapon�term�kenk�nt�a�term�kek�darabsz�m�t.�
A�v�laszban�jelen�tse�meg�az�eredeti��rlapot,�a�megadott�darabsz�mokkal,�
ez�al��rja�ki�a�kos�r�eredeti �r�t,�kedvezm�nyes��r�t��s�a�kedvezm�ny�t�pus�nev�t.�� � 
B.? �Az�alkalmaz�s�jelen�tse�meg�az��rakat�EUR�ban�is,�
az�MNB�webservice��n� (http://www.mnb.hu/arfolyamok.asmx?WSDL)�kereszt�l�lek�rve�a�valuta�rfolyamot.�

------------------------------------------------------------------------------------------------------


