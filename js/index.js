

//Arrays

const cars = ["Saab", "Volvo", "BMW"];
cars[3] = "Saab1";
cars[4] = "Volvo1";
cars[5] = "BMW1";

const cars1 = new Array("Saab", "Volvo", "BMW");

let car = cars[0];
cars.toString();

cars.push("saab2");

const points = [40];//40
const points1 = new Array(40); //undefined

Array.isArray(cars);//true
cars instanceof Array;//true

const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.length;
fruits.join(" * "); //Banana * Orange * Apple * Mango
let fruit = fruits.pop(); // fruit= "Mango"  , fruits =  ["Banana", "Orange", "Apple"]
let length = fruits.push("Kiwi"); // length = new length  ,  fruits =  ["Banana", "Orange", "Apple","Kiwi"]
let fruit1 = fruits.shift(); // fruit1 = "Banana"  ,  fruits =  ["Orange", "Apple","Kiwi"]
let length1 = fruits.unshift("Lemon"); //length1 = new length  ,fruits =  ["Lemon","Orange", "Apple","Kiwi"]
fruits.length;
delete fruits[0];//fruits =  [ undefined,"Orange", "Apple","Kiwi"]

const arr1 = ["Cecilie", "Lone"];
const arr2 = ["Emil", "Tobias", "Linus"];
const arr3 = ["Robin", "Morgan"];
const myChildren = arr1.concat(arr2, arr3); //myChildren = [Cecilie,Lone,Emil,Tobias,Linus,Robin,Morgan]
const myChildren1 = arr1.concat("Peter"); //myChildren1 = Emil,Tobias,Linus,Peter
[[1, 2], [3, 4], [5]].flat(); // 1,2,3,4,5,6

const fruits3 = ["Banana", "Orange", "Apple", "Mango"];
fruits3.splice(2, 1, "Lemon", "Kiwi"); // fruits3 = ["Banana", "Orange","Lemon", "Kiwi", "Mango"];
fruits3.splice(0, 1);// fruits3 = ["Orange","Lemon", "Kiwi", "Mango"];

const citrus = fruits3.slice(1); //fruits3 = ["Orange","Lemon", "Kiwi", "Mango"]; ,
//citrus = ["Lemon", "Kiwi", "Mango"];
const citrus1 = fruits3.slice(1, 3); //fruits3 = ["Orange","Lemon", "Kiwi", "Mango"]; ,
//citrus1 = ["Lemon", "Kiwi"];




const points3 = [40, 100, 1, 5, 25, 10];
points3.reverse();//reverse order
points3.sort();//sort alphabetically
points3.sort(function (a, b) { return a - b });// sort numerically
Math.max.apply(null, points3); //return highest number in an array
Math.min.apply(null, points3); //return highest number in an array

//array iteration

const numbers = [45, 4, 9, 16, 25];
let txt = "";

numbers.forEach(myFunctionForEach);
function myFunctionForEach(value, index, array) {
  txt += value + "<br>";
}

const numbers1 = numbers.map(myFunctionMap); //90,8,18,32,50
function myFunctionMap(value, index, array) {
  return value * 2;
}

const myArr = [1, 2, 3, 4, 5, 6];
const newArr = myArr.flatMap((x) => x * 2); //2,4,6,8,10,12

const over18 = numbers.filter(myFunctionFilter);//45,25
function myFunctionFilter(value, index, array) {
  return value > 18;
}

let sum = numbers.reduce(myFunctionReduce); // 99
let sum1 = numbers.reduce(myFunctionReduce, 100); //199
function myFunctionReduce(total, value, index, array) {
  return total + value;
}

let allOver18 = numbers.every(myFunctionFilter); //false

let someOver18 = numbers.some(myFunctionFilter); //true

let position = numbers.indexOf(16); //3

let positionLast = numbers.lastIndexOf(16); //return last index of 16 

let firstOver18 = numbers.find(myFunctionFilter); //45

let firstIndexOver18 = numbers.findIndex(myFunctionFilter); //0

const myArrFrom = Array.from("ABCDEFG");//[A,B,C,D,E,F,G]

const fruits1 = ["Banana", "Orange", "Apple", "Mango"];
fruits1.includes("Mango"); // is true 

const keys = fruits1.keys();
let text = "";
for (let x of keys) {
  text += x + "<br>";   //0 1 2 3  one by one
}

const f = fruits1.entries();

for (let x of f) {
  document.getElementById("demo").innerHTML += x;  //[0, "Banana"] [1, "Orange"] [2, "Apple"] [3, "Mango"]
}

Math.random();// Returns a random number:
Math.floor(Math.random() * 10);// Returns a random integer from 0 to 9:
Math.floor(Math.random() * 10) + 1;// Returns a random integer from 1 to 10:
Boolean(10 > 9);//true

let x = 5;
(x == "5");//true
(x == 5);//true
(x === "5");//false
(x === 5);//true

if (11 < 10) {
} else if (11 < 20) {
} else {
}

switch (expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
  // code block
}

for (let i = 0; i < cars.length; i++) {
  text += cars[i] + "<br>";
}

for (let x in cars) {
  text += cars[x];
}

numbers.forEach(myFunction);
for (let x of cars) {
  text += x;
}

while (condition) {
  // code block to be executed
}

do {
  // code block to be executed
}
while (condition);

/* A JavaScript "Set" is a collection of unique values.
Each value can only occur once in a Set. */
const letters = new Set(["a","b","c"]);
letters.add("a");//do not add
letters.add("d");//add

/*A "Map" holds key-value pairs where the keys can be any datatype.
A Map remembers the original insertion order of the keys. */
const fruits2 = new Map([["apples", 500],["bananas", 300]]);
fruits2.set("oranges", 200);
fruits2.get("apples");    // Returns 500

typeof "John"                 // Returns "string"
typeof 3.14                   // Returns "number"

(cars instanceof Array); //true

String(123);  //number to string
(123).toString(); //number to string
Number(false)     // returns 0


/** "use strict" */

x = 3.14;       // This will not cause an error.
myFunction();
function myFunction() {
  "use strict";
  y = 3.14;   // This will cause an error
}


/** Classes */

class Car {
  constructor(name, year) {
    this.name = name;
    this.year = year;
  }

  age() {
    const date = new Date();
    return date.getFullYear() - this.year;
  }

}
const myCar1 = new Car("Ford", 2014);


/* JSON */
/*
{
  "employees":[
    {"firstName":"John", "lastName":"Doe"},
    {"firstName":"Anna", "lastName":"Smith"},
    {"firstName":"Peter", "lastName":"Jones"}
  ]
}
*/
//text string form of JSON
const jsObj = JSON.parse(text);// to convert the string => JavaScript object


/*
<script>
window.onload = function() {
  const element = document.createElement("script");
  element.src = "myScript.js";
  document.body.appendChild(element);
};
</script>
*/


/* JS Objects */

