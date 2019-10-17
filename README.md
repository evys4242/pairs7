# Pairs of integers totaling 7

Print out the distinct pairs of integers that sum to 7 from an array of integers.
For example, if the input is `[1, 2, 3, 4, 5, 6]`, the output could be `(1,6)(2, 5)(3, 4)` or `(6,1)(5, 2)(4,3)`. 
Different combinations of the same pair of numbers e.g, (1, 6) and (6, 1) are not distinct. 
In this case, only `(1, 6)` or `(6, 1)` should be printed, but not both of them.  
_This is a little exercize in Java 8 new features: Functions and Streams._


## Getting Started

In a suitable folder:
```
git clone https://github.com/evys4242/pairs7.git
cd pairs7
mvn package
java -jar target/pairs7.jar <args>
```
or skip the maven build
```
git clone https://github.com/evys4242/pairs7.git
java -jar pairs7/bin/anagram.jar <args>
```

### Arguments:
* two or more whole numbers: ` 1 2 3 4 5 6 7 0 -3 -5 -11 12`

### Prerequisites
Java 8 and above.


## Built With

* [Maven](https://maven.apache.org/)

## Authors

* **Eduard Vysotskiy** - [evys4242](https://github.com/evys4242)
