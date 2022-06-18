# MakeChangeProject


## Description
This program will ask the user for two inputs. The first for the cost of the item and the second for 
how much was given. The next step will determine whether or not the amount given was the exact change or if
they did not give enough money through the use of a method. After passing this condition, the remainder, given
-cost; is put through a while statement and passed through a series of if statements that will determine
how much of of a specific currency should be given back. It starts with the highest currency available and pass 
that remainder down the line. If it can met the condition, it will fall to the next if statement.The Other than
variable remainder is changed during each if statement and a continue; is used to skip the rest of the code and
filter the new remainder in the if statements.
 the use of math, the amount remainder for pennies is different and uses the Math.round() feature as there wont
 be any if statement following pennies and the number needs to be rounded up. The while loop continue to 
 capture. Finally the output will be a printed line of what should be given back as a refund.

## Technologies used
This can mainly be used in restaurants and banks that have face to face currency interactions. This could
also apply for any online transactions where a customer paid too much and a refund was needed; ex:billing.


## What I learned
I am still playing around with this code. I think ideally there is a way to wrap the if statements into a method and then pass the remainder and the currency; ten, five, one, etc... into it and that would really shorten the length of coding. This also taught me that there is a legitimate use of coding that has worldly practicalities.
