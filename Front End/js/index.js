

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
const letters = new Set(["a", "b", "c"]);
letters.add("a");//do not add
letters.add("d");//add

/*A "Map" holds key-value pairs where the keys can be any datatype.
A Map remembers the original insertion order of the keys. */
const fruits2 = new Map([["apples", 500], ["bananas", 300]]);
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
const jsStr = JSON.stringify("");// to convert JSON => string

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

new Object(); //create new object
Object.create();//create new object

const obj = {
  counter: 0,
  set setCounter(val) {
    this.counter = val;
  },
  get getCounter() {
    return this.counter;
  }
};
Object.defineProperty(obj, "reset", {
  get: function () { this.counter = 0; }
});
Object.defineProperty(obj, "add", {
  set: function (value) { this.counter += value; }
});
obj.getCounter;
obj.setCounter(4);
obj.reset;
obj.add = 5;

function Person(first, last, age, eyecolor) {  //constructor
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eyecolor;
}
const myFather = new Person("John", "Doe", 50, "blue");
Person.nationality = "English";//not allowed
Person.prototype.nationality = "English";//allowed

/** JS Functions */

function myFunction(a, b) {
  return a * b;
}
const x1 = function (a, b) { return a * b };
const x2 = (a, b) => a * b;
const x3 = (x, y) => { return x * y };
function sum(...args) { };

/* call() , Apply(), Bind() */






/* Classes */

class Car {
  constructor(brand) {
    this.carname = brand;
  }
  present() {
    return 'I have a ' + this.carname;
  }
  get getCarname() {
    return this.carname;
  }
  set setCarname(x) {
    this.carname = x;
  }
  static hello() {
    return "Hello!!";
  }
}

let myCar2 = new Car("Tata");

class Model extends Car {
  constructor(brand, mod) {
    super(brand);
    this.model = mod;
  }
  show() {
    return this.present() + ', it is a ' + this.model;
  }
}

let myCar3 = new Model("Ford", "Mustang");
Car.hello();

/* Async */

//Callback
function myDisplayer(some) {
  document.getElementById("demo").innerHTML = some;
}
function myCalculator(num1, num2, myCallback) {
  let sum = num1 + num2;
  myCallback(sum);
}
myCalculator(5, 5, myDisplayer);

//Asynchronous
setTimeout(function () { }, 3000);//after 3000ms function called
setInterval(function () { }, 1000);//after every 1000ms function called continuously

//Promises

let myPromise = new Promise(function (myResolve, myReject) {
  let req = new XMLHttpRequest();
  req.open('GET', "mycar.htm");
  // The producing code (this may take some time)
  req.onload = function () {
    if (req.status == 200) {
      myResolve(req.response);
    } else {
      myReject("File not Found");
    }
  };
  req.send();
});
// "Consuming Code" (Must wait for a fulfilled Promise)
myPromise.then(
  function (value) { myDisplayer(value);/* code if successful */ },
  function (error) { myDisplayer(error);/* code if some error */ }
);


//Async await
//The keyword async before a function makes the function return a promise
//The await keyword can only be used inside an async function.
//The await keyword can only be used inside an async function.
//The await keyword makes the function pause the execution and wait for a resolved promise before it continues:

async function getFile() {
  let myPromise = new Promise(function (resolve) {
    let req = new XMLHttpRequest();
    req.open('GET', "mycar.html");
    req.onload = function () {
      if (req.status == 200) {
        resolve(req.response);
      } else {
        resolve("File not Found");
      }
    };
    req.send();
  });
  document.getElementById("demo").innerHTML = await myPromise;
}
getFile();




/** JS HTML DOM */
//The getElementsByClassName() and getElementsByTagName() methods 
//return a live HTMLCollection.
const myTagCollection = document.getElementsByTagName("tagname");
myTagCollection[0];
myTagCollection.length;

const myclassCollection = document.getElementsByClassName("classname");
myclassCollection[0];
myclassCollection.length;

let element = document.getElementById("id");
element.innerHTML = "";
//element."attribute" = "value";
//element.style."property" = "new style";
//element.setAttribute("attribute", "value");

const myNodeList = document.querySelectorAll("p"); //The querySelectorAll() method returns a static NodeList
myNodeList[0];
myNodeList.length;
//<p class="intro">Hello Woerld!.</p>
//<p class="intro">This example demonstrates the</p>
document.querySelectorAll("p.intro")[1];  //<p class="intro">This example demonstrates the</p>


const x11 = document.forms["frm1"];
x.elements[0].value;
/*document.anchors
document.body
document.documentElement
document.embeds
let x = document.forms["myForm"]["fname"].value;
document.head
document.images
document.links
document.scripts
document.title 
document.write(text)	//Write into the HTML output stream
*/

document.getElementById("id").onclick = function(){code}	//Adding event handler code to an onclick event

//<button id="myBtn">Try it</button>
document.getElementById("myBtn").addEventListener("click", function () {
  alert("Hello World!");
});
document.getElementById("myBtn").removeEventListener("click", function () {
  alert("Hello World!");
});
window.addEventListener("resize", function () {
  document.getElementById("demo").innerHTML = "sometext";
});

//navigation
//<h1 id="id01">My First Page</h1>
//<p id="id02"></p>
let eleid01 = document.getElementById("id02");
let eleid02 = document.getElementById("id01");
eleid02.innerHTML = eleid01.innerHTML;
eleid02.innerHTML = eleid01.childNodes[0].nodeValue;
eleid02.innerHTML = eleid01.firstChild.nodeValue;
eleid02.innerHTML = document.body.innerHTML;  //The body of the document
eleid02.innerHTML = document.documentElement.innerHTML;  //The full document
eleid02.innerHTML = eleid01.nodeName;  //h1
eleid02.innerHTML = eleid01.nodeType;  //1  //nodeType property is read only.

/*<div id="div1">
  <p id="p1">This is a paragraph.</p>
  <p id="p2">This is another paragraph.</p>
</div>*/
const newPara = document.createElement("p");
//newPara."attribute" = "value";
//newPara.style."property" = "new style";
//newPara.setAttribute("attribute", "value");
const newNode = document.createTextNode("This is a new paragraph.");
newPara.appendChild(newNode);
const parentEelement = document.getElementById("div1");
const childElement1 = document.getElementById("p1");
parentEelement.insertBefore(para, child);   //insert para inside div1 and befor p1
childElement1.remove();
const childElement2 = document.getElementById("p2");
parentEelement.removeChild(childElement2);
parentEelement.replaceChild(childElement2, childElement1);// childElement1=childElement2
parentEelement.childNodes; //The childNodes property returns a live NodeList.


/** JS Browser BOM */
//Window
window.innerHeight;  // the inner height of the browser window (in pixels)
window.innerWidth;   // the inner width of the browser window (in pixels)
window.open();       // open a new window
window.close();      // close the current window
window.moveTo();     // move the current window
window.resizeTo();   // resize the current window

//Screen  //window.screen object can be written without the window prefix
screen.width;
screen.height;
screen.availWidth;
screen.availHeight;
screen.colorDepth;
screen.pixelDepth;

//Location //window.location object can be written without the window prefix.
window.location.href;     //returns the href (URL) of the current page
window.location.hostname; //returns the domain name of the web host
window.location.pathname; //returns the path and filename of the current page
window.location.protocol; //returns the web protocol used (http: or https:)
window.location.assign("https://www.w3schools.com"); //loads a new document
window.location.port;     //returns the number of the internet host port (of the current page)

//History  //window.history object can be written without the window prefix.
history.back();     //same as clicking back in the browser
history.forward();  //same as clicking forward in the browser

//window.navigator object can be written without the window prefix.
navigator.cookieEnabled  //returns true if cookies are enabled, otherwise false:
navigator.language;//returns the browser's language:
navigator.onLine;//returns true if the browser is online:

navigator.appVersion;//returns version information about the browser
navigator.userAgent;//returns the user-agent header sent by the browser to the server //should not use
navigator.platform;// returns the browser platform (operating system):
navigator.javaEnabled();//returns true if Java is enabled:
navigator.appName;       //appName property returns the application name of the browser:
navigator.appCodeName;
navigator.product;

//Popup Alert
window.alert("sometext"); //alert("sometext");
window.confirm("sometext"); //return true =>if press ok  or false =>if press cancle 
window.prompt("Please enter your name", "Harry Potter"); //click ok =>return input value or cancle=>null

//Timing
let myVar1 = window.setTimeout(function(){}, milliseconds);
window.clearTimeout(myVar1);
let myVar2 = window.setInterval(function(){}, milliseconds);
window.clearTimeout(myVar2);

//Cookies
function setCookie(cname,cvalue,exdays) {
  const d = new Date();
  d.setTime(d.getTime() + (exdays*24*60*60*1000));
  let expires = "expires=" + d.toUTCString();
  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
  let name = cname + "=";
  let decodedCookie = decodeURIComponent(document.cookie);
  let ca = decodedCookie.split(';');
  for(let i = 0; i < ca.length; i++) {
    let c = ca[i];
    while (c.charAt(0) == ' ') {
      c = c.substring(1);
    }
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}

function checkCookie() {
  let user = getCookie("username");
  if (user != "") {
    alert("Welcome again " + user);
  } else {
     user = prompt("Please enter your name:","");
     if (user != "" && user != null) {
       setCookie("username", user, 30);
     }
  }
}

checkCookie();


/** Web APIs */

checkValidity()	//Returns true if an input element contains valid data.
setCustomValidity()	//Sets the validationMessage property of an input element.

window.history.back();
window.history.forward();
window.history.go(-2);
window.history.length;

window.localStorage;	//Allows to save key/value pairs in a web browser. Stores the data with no expiration date
window.sessionStorage;	//Allows to save key/value pairs in a web browser. Stores the data for one session
/*window.localStorage." "    or   window.sessionStorage." "
key(n)	//Returns the name of the nth key in the storage
length	//Returns the number of data items stored in the Storage object
getItem(keyname)	//Returns the value of the specified key name
setItem(keyname, value)	//Adds a key to the storage, or updates a key value (if it already exists)
removeItem(keyname)	//Removes that key from the storage
clear()	//Empty all key out of the storage
*/

//Worker Api
/* file = demo_workers.js
let i = 0;
function timedCount() {
  i ++;
  postMessage(i);
  setTimeout("timedCount()",500);
}
timedCount();
*/
/*<p>Count numbers: <output id="result"></output></p>
<button onclick="startWorker()">Start Worker</button>
<button onclick="stopWorker()">Stop Worker</button>*/
let w;
function startWorker() {
  if (typeof(w) == "undefined") {
    w = new Worker("demo_workers.js");
  }
  w.onmessage = function(event) {
    document.getElementById("result").innerHTML = event.data;
  };
}
function stopWorker() {
  w.terminate();
  w = undefined;
}

//Fetch Api

let file = "fetch_info.txt"
fetch (file)
.then(x => x.text())
.then(y => document.getElementById("demo").innerHTML = y);
            //or
getText("fetch_info.txt");
async function getText(file) {
  let myObject = await fetch(file);
  let myText = await myObject.text();
  document.getElementById("demo").innerHTML = myText;
}


/* AJAX */

new XMLHttpRequest()	//Creates a new XMLHttpRequest object
abort()	//Cancels the current request
getAllResponseHeaders()	//Returns header information
getResponseHeader()	//Returns specific header information
open(method, url, async, user, psw)	//Specifies the request
/*method: the request type GET or POST
url: the file location
async: true (asynchronous) or false (synchronous)
user: optional user name
psw: optional password*/
send()	//Sends the request to the server Used for GET requests
send(string)	//Sends the request to the server.Used for POST requests
setRequestHeader()	//Adds a label/value pair to the header to be sent