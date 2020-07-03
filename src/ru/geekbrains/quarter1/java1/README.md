# Course: Java Developer
## Java: Level 1
<details>
<summary>Lesson 1</summary>

* Create empty project in IntelliJ IDEA, create fist class and main method in it.
* Create variables of all known primitive types (incl. String type).
* Create method, which calculates `a * (b + (c / d))` and return the result, where a, b, c and d - parameters of the method.
* Write a method, which takes 2 integers as a parameters and checks, if sum of them is in range from 10 to 20 (incl). If yes - 
return `true`, else `false`.
* Write a method which takes an integer as a parameter and returns `true` if this integer is negative.
* Write a method which takes a String `name` parameter and prints `Hello, $name` in the console.
* *Write a method that checks is year leap or not and prints the result to the console. Every 4th year is a leap, except every 100th
but every 400th is a leap also.
</details>

<details>
<summary>Lesson 2</summary>

* Create an Integer Array, which contains zeros and ones, ex. `[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]`. Using a loop and a condition
replace zeros on ones, and ones on zeros.
* Create an Integer Array with the size 8, and using loop fill it with the next values: `0 3 6 9 12 15 18 21`.
* Create an array `[ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]` and all digits, that are below 6 multiply by 2.
* Create an square two-dimensions array (count of lines and columns are equals) and using loop, fill its diagonals
with ones.
* **Create one-dimension array and find the minimum and maximum (without using internet)
* **Write a method, which takes not-empty integer array. Method must return `true`, if there is a place in the array,
 where the sum of the right part is equals to the sum of the left part. Examples: 
    
    `checkBalance([2, 2, 2, 1, 2, 2, || 10, 1])` → `true`
    
    `checkBalance([1, 1, 1, || 2, 1])` → `true`
    
    Border of sides is shown by `||` symbols, do not include them in the array.
* ****Write a method, which takes one-dimension array and the number `n` (maybe positive or negative).  Method must shift 
all elements in the array on the `n` places. To complicate the task - additional arrays are not allowed. Examples:

   `moveElements(int[1, 2, 3, 4, 5] arr, int 2)` → `int[4, 5, 1, 2, 3]`
   `moveElements(int[1, 2, 3, 4, 5] arr, int -2)` → `int[3, 4, 5, 1, 2]`
</details>

<details> 
<summary>Lesson 3</summary>

* Write a program, which makes a number, from 0 to 9, and gives to the user 3 tries to guess this number. On each try
computer must tell to the user is the guessed number is lower or higher. After the win/lose, the program must ask - 
`Repeat the game? 1 - Yes, 2 - No`
* *Create an array of words:

   `String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", 
   "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", 
   "pineapple", "pumpkin", "potato"}`
   
   When program starts, computer is randomly takes one word from the array and ask user to guess it. It takes the try from
   the console and compares this try to the guessed word. If word not guessed, computer shows the letters, which are in the
   right place. Exapmlpe:
   
   `apple` - hidden word.
   
   `apricot` - user's try.
   
   `ap#############` - result. Use 15 repeated symbols `#` to hide the original lenght of the hidden word.
   
   Playing as long as user guesses the word.
   
   Use only lowercase letters.
</details>