# Course: Java Developer
## Java: Level 2
<details>
<summary>Lesson 1</summary>

* Create three classes:
    * Human
    * Cat
    * Robot
   
   Which are not inherited from any class
* Create two classes:
    * Treadmill
    * The wall
    
    When one of the participants passes the obstacle, they must perform one of the actions:
    * Run
    * Jump
    
    Also, results need to be shown:
    * `Robot cannot run so far`
    * `Human jumps successfully`
* Create two arrays:
    * Array of participants
    * Array of the obstacles
    
    And make participants pass all obstacles.

* *All obstacles has a parameter (length for the treadmill and height for the wall), and all participants has some 
limitation - run limit or jump limit. If participant failed at one of the obstacles - he is not completing the whole 
steeplechase.
</details>

<details>
<summary>Lesson 2</summary>

* Here is the string `"10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"`, in other words 4x4 matrix.
* Create a method, which takes a string above as a parameter and must convert this string to the two-dimension array.
* Convert all elements of the array to integers, summarize them, divide by 2 and return the result.
* All methods must throw exceptions when:
    * If the size of the matrix isn't 4x4
    * If the element of String array is not convertible to integer (e.g character or word).
* In `main` method call all the methods, proceed all the exceptions and print the result.
* *Create your own classes of exceptions for all cases.
</details>

<details>
<summary>Lesson 3</summary>

* Create an array of words (20-30, some of them must be not unique)
    * Find all unique words and print them to the console
    * Count all occurrences of all words (use HashMap)
* Write simple class - PhoneBook (use HashMap in it)
    * Use the second name as a key
    * Each record contains only two values - phone number and email
    * Write a separate method to find phone number according to the second name (entered the second name, and got
    ArrayList of phone numbers). If there are some people with same second name - add all of them to the result.
    
    As a result, you should get 3 classes: Main, PhoneBook and Person.
</details>