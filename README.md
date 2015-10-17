## To Compile And Run the Application, folow the next instrucctions

#### Pre-requiriments

java 1.8 or higher

javac 1.8 or higher

##### _BOTH MUST HAVE THE SAME VERSION_

#### To compile the project run:

$ sbt compile stage

#### To run the project run:

$  sbt

#### After:

[flame-internal_back_end-rest-scala] $  play-run

#### Finally

Product's Client

/user/{typeOfDocument}/{numberOdDocument}/products

Product's Movements

/user/{typeOfDocument}/{numberOdDocument}/product/{idProduct}/detail

##### Example

http://localhost:9000/user/1/1017224184/products/
