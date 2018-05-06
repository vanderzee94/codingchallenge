# codingchallenge
A coding challenge for an interview 

 
## Problem 1
http://codingdojo.org/fr/kata/FizzBuzz/ 


To compile: 


`javac FizzBuzz.java` 


To run: 


`java FizzBuzz` 

 
This is the classic FizzBuzz challenge. This solution contains both parts (I & II) for the link given above.
 

## Problem 2
http://codingdojo.org/kata/RomanNumerals/ 


To compile: 


`javac RomanNumeral.java` 


To run: 


`java RomanNumeral <a number>` to convert a number 


-OR- 


`java RomanNumeral` to run a few test cases 


Roman numerals only use the letters I, V, X, L, C, D, and M. Given the rules of subtraction for roman numerals, IV, IX, XL, XC, CD, CM are the only valid pairs that use subtraction. By adding these chunks together we can form any number. If we call the base numbers and these valid subtraction paris "chunks" we can form any number by using the largest chunk as many times as possible before adding the next largest chunk. For example the largest chunk in the number 14000 is M (1000) which we can use once leaving us with 400. The next largest chunk we can use is CD (400) giving us M + CD (1000 + 400) = MCD (1400).


Test cases were selected to cover all of the letters (I, V, X, L, C, D, M) and all valid subtractions (IV, IX, XL, XC, CD, CM) 


`1 == 'I'` 


`5 == 'V'` 


`10 == 'X'` 


`50 == 'L'` 


`100 == 'C'` 


`500 == 'D'` 


`1000 == 'M'` 


`4 == 'IV'` 


`9 == 'IX'` 


`40 == 'XL'` 


`90 == 'XC'` 


`400 == 'CD'` 


`900 == 'CM'` 


`1984 == 'MCMLXXXIV'` 


`98 == 'XCVIII'`


`2028 == 'MMXXVIII'`


`890 == 'DCCCXC'` 


`707 == 'DCCVII'` 

