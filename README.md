# Wind-Chill
Assignment 1 for CMSC-203

## Contents

1. General Info
2. Screenshots
3. Behind the Scenes
4. Programs used
5. Code Example(s)
6. Filename
7. Contact
8. References (if necessary)

## Section 1: General Info
Calculate the Temperature (in Fahrenheit) and Wind Speed (in mph) to figure out the Wind Chill. The assignment required the variables to remain between the Minimum and Maximum values, otherwise the test will fail.

## Section 2: Screenshots

https://github.com/wbnicholas1999/Wind-Chill/blob/master/CmdLine_output.jpg?raw=true
https://github.com/wbnicholas1999/Wind-Chill/blob/master/Eclipse_console_output.jpg?raw=true

## Section 3: Behind the Scenes
Calculating for the Wind Chill temperature was quite a challenge to start with; my first attempt for exponents was like “(windSpeed)^(0.16)”, and it doesn’t work with Java (and I’m pretty sure it doesn’t work with other coding programs too). I did some research to figure out exponents until I found “Math.pow()” [1], I tried that and it worked, and it was pretty much a simple way. Organizing the if and else commands was like solving some puzzle; I originally wanted to program to end if the temperature exceeds the minimum or maximum value, but it wouldn’t be fair for the programmer to continue, so I let the programmer input the temperature and wind speed to calculate the “Wind Chill temperature” and allow the program to let anyone know if the test succeeded or failed.

https://github.com/wbnicholas1999/Wind-Chill/blob/master/Screenshot1.png?raw=true
https://github.com/wbnicholas1999/Wind-Chill/blob/master/Screenshot2.png?raw=true

Wind Chill Test Table:

|  Attempt  |  Temperature  |   Wind Speed   |      Wind Chill       |  Succeeded?  |
|-----------|---------------|----------------|-----------------------|--------------|
|     1     |      30       |       20       |   17.091783756466324  |     YES      |
|     2     |      12       |       43       |  -12.803349893185658  |     YES      |
|     3     |      -23      |       31       |   -57.3091130527011   |     YES      |

## Section 4: Programs used
Eclipse

Command Prompt

## Section 5: Code Example(s)
Wind speed = 18

Math.pow((18), 0.16)

## Section 6: Filename
Windows: https://github.com/wbnicholas1999/Wind-Chill/blob/master/WindChill.java

I apologize Linux and Mac users.

## Section 7: Contact
Created by wbnicholas1999

## Section 8: References (if necessary)
[1] How I learned exponents for Java coding: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/pow - Last modified (as of February 10, 2020): January 15, 2020, by MDN contributors
