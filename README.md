# GST-Calculator
Recently the	tax	structure	in	India	has	undergone	transformation	with	the	implementation of	Goods	&	Services	Tax	(GST).
Now,	all	commodities	and	services	fall	under	4	broad	GST	slabs.	These	are:
  1. 0% - No	GST	is	applied	on	this	commodity.
  2. 5% - A	GST	of	5%	is	applied	on	top	of	this	commodity.
  3. 18% - A	GST	of	18%	is	applied	on	top	of	this	commodity.
  4. 28% - A	GST	of	28%	is	applied	on	top	of	this	commodity.
  
This program is developed using Java and can be used to calculate the final price of a commodity after adding the respective GST. The program consists of a main class named     ```commodityPrice``` and four other classes named ```GST1```, ```GST2```, ```GST3``` and ```GST4``` representing the GST slabs. Each class has 3 variables out of which 2 variables named ```unit``` and ```initialUnitPrice``` are initialised using parameterised constructors and a third variable ```slabGST``` defines the GST rate for the respective classes.
Each class has a method named ```calculateSlabGST()``` that calculates and returns the final price of a product.

# Dependencies
The libraries used in this program are ```java.util.Scanner``` and ```java.util.Arrays```.
