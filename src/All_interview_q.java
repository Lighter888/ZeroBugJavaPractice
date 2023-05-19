public class All_interview_q {

    /*
1.
   YOU WILL USE 3 WAY TO DO THAT.
    1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
    Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


2.
use Arrays.sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:

3.
int a=5;
int b=6;
change and print
a==6;
b==5;

4.
   Use Collection int a [] = {2,5,7,15,1,6};
   int a [] = {2,5,7,15,1,6};
   output
   13   < Max number minus second min num and result is 13

5.
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

---------------SECOND------------
Store into Array
2int[] arr = {1, 2, 3, 49, 6, 5};
ArrayList<Integer> list = new ArrayList();

6
String h="AAABBBCCC";
        String result = "";

output
ABC

7
String h="AAABBBCCCDEF";
        String result = "";

 output
  DEF
8
   String s="1a2b3c4f!@#";
    int sum=0;
        String letter="";
        String digit="";
        String sign="";

   output
   10
a b c f
1 2 3 4
!@#

9
String str="DC501GCCCA098911";

output
CD015ACCCG011899

//10 if ascend true
int[]a={1,2,3,4,5,6,7};



//11  if disc  true
int[]a={7,6,5,4};



//12  Remove zeros
  int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();

output
[1, 2, 3, 49, 6, 5, 0, 0, 0]

//13
 int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        output
     [1, 2, 3, 4, 5, 6, 7]

//14 Use String
int a=5;

if number is odd output will be odd, if number is even output will be even

//15
FINRA
total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
print FIN,if num divided by 5 print RA

//16  USE WHILE LOOP
int num1=5;
int num2=2;

output
5 devided by 2 is: 2 and remainder is 1

//17
int  a = 10;
        int  b  = 20;

        output
      a  20
      b  10

//18

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        int[] arr = new int[100];
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

//19
1. Write a return method that can verify if a password is valid or not.
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

//20
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is
 divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
  a concatenation of the respective words Codility, Test and Coders in this
   given order. For example, numbers divisible by both 2 and 3 should be
    replacée by CodilityTest and numbers divisible by all three numbers: 2,3
     and 5, should be replaced by CodilityTestCoders.


 1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility

//21
Factorial Number

//22
Numbers -- Prime Number. Prime num is a number that divided by itself and 1
Write a method that can check if a number is prime or not

//23
int num=-1234556;
-6554321


//24  USE ITERATOR
ArrayList -- Remove "Ahmed"
ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));

//25 USE ITERATOR
ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

output
[1, 2, 3, 4, 5, 6, 7, 8, 9]


//26
Write a method that can check if a number is Armstrong  number

Armstrong number is a number that is equal to the sum of cubes of its digits.
 For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
 understand why 153 is an Armstrong number. Let's try to understand why 371 is an
  Armstrong number.

//27 frequency
  String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        output
{A=2, B=2, D=3, C=1}


//28  Find unique
  String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        output

{d=1}

//29
Map -- Min value  and Max value
   Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

output
1

//30
Array -- N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that
 sum up to 0. The function can return any such array. For example, given N = 4, the function
 could return [0,1,2,-3] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
  (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
   (but there are many more correct answers).

31
//Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.

32
Create a function that counts the number of syllables a word has. Each syllable is
separated with a dash "-" Examples
numberSyllables("buf-fet") ➞ 2

        String q="buf-dt-rr"; >> 3

33
  Given an int array length 3, if there is a 2 in the array
        immediately followed by a 3, set the 3 element to 0.
        Return the changed array.
        fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]

34  USE double
Dont use sort get max  4.5
   String[] arr = {"1","2.5", "3", "3.5", "4.5"};

   output
   4.5

//35
 String s = "Seda, 20, Leyla, 30";

 First output
 {Seda= 20,  Leyla= 30}

 Second
  String str = "Seda, Nurik, Leyla, Seda";
{Seda=,  Nurik=,  Leyla=,  Seda=}

//36
 int a[]={1,3,5};
        int b[]={2,4,6};

output Array
[1, 2, 3, 4, 5, 6]

//37  Store Array and ArrayList

 int [] arr = {1,4,8,0,3,11,26,2};

 output
 [1, 8, 3, 26]


 //38  SORT MAP

   Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);
//39
Create 10 random number between 1 and 6

//40  FIND missing number

 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};

//41
Calculate the power of a number using a while loop

The power (or exponent) of a number says how many times to use the number in a multiplication.
 It is written as a small number to the right and above the base number.

//42  reverse   USE STRINGBUFFER
int num = -123;
           //-321


//43 Perfect number is the sum of numbers that perfectNum divided by sum
int perfectNum =28;
//eger regeme bolunen regemlerin cemi onun ozune beraberdirse perfect numberdi


//44  COMBINE
int[] a = {1,2};
        int[] b ={3,4};

        output
     [1, 2, 3, 4]
=========================================================================
  ---WHAT IS OUTPUT----
 String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="Nisum";
        System.out.println((S1.equals(S2)));
        System.out.println(S1==S2);
        System.out.println((S3==S1));
========================================================================

//45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));

====================================================================================
//46

 String a="aaa10ss20bb30";

 output > 60

 //47
 Given alphanumeric String, we need to split the string into substrings of consecutive
  letters or numbers, sort the individual string and append them back together
Input:  "D5C01GCCCA098911"
OutPut: "CD015ACCCG011899"

//48
  ArrayList<String>d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
How do you find if ArrayList contains duplicates or not?
(ALSO REMOVE DUPLICATE AT SAME TIME)

//49
14 write a program which prints out the numbers from 1 to 30:
 for numbers which are divisible by 3, print "FIN" instead of the number.
for numbers which are divisible by 5, print "RA" instead of the number
for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number

//50 Remove from same string assign same string
String h="AABCC";
Remove
SECOND WAY --write a program that can return the unique characters from a string
Ex:  "AABCC" ==> "B"

//51
We'll say that a "triple" in a string is a char appearing three times
 in a row. Print out the number of triples in the given string.
 The triples may overlap. Example:input: abcXXXabc output: 1

 //52
 write a method that can print out the unique elements from an int array

Ex: {1,1,2,3,3} ==> 2
		{6,6,7,7,8,9} ==> 8 9
  --write a method that can print out the unique elements from a double array
		Note: Apply method overloading

//53
Write a for loop that will print out the string in alternating cases,
with the first letter being lowercase

//54
Ask user enter 5 words and declare long word or Array
String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};


//55
int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
convert it ascending array and print like this
[-100, -1, 1, 3, 4, 100, 155, 200]

//56
Given an array of ints, print true if the array contains a 5 next
   to a 5 anywhere in the array. If no consecutive 5s or no 5s are
   detected in your code then print false.
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false

//57
 Given an array nums with 7 integers every element is repeated twice
 - except one. Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2

//58
 Write a program that can return the average number from an array of
 integers
  ex:
      [10, 15, 5, 6]
 average: 9.0

 //59
 String sentence = "Today is great day";
  Array [Today, is, great, day]
 reverse Array[Today, is, great, day] to >  day great is Today

 //60
 String sentence = "Today is great day";
 yad taerg si yadoT

 //61
  write a program that can return the number of appearances of
"java" and "python" anywhere in the sentence---"I Like java and javascript not python";
You will do for each and regular for loop
for each result: java 2
                 python 1

 //62    int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

  {  {9, 8, 7}, {6},  { { 5,4,3,2,1,0}   };  output should be this
7 8 9 6 0 1 2 3 4 5

//63
{  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
5 4 3 2 1 0 6 9 8 7

//64
 {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
0 1 2 3 4 5 6 7 8 9

//65
String[] arrr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};  by using sort Array get max and
min number

//66
 String [] k = {"bob","joe"};
        String  [] o = {"jones","smith"};

   Complete the combineNames method to return a new String array that
//is composed of the first name and last name of each of the parameters.
//This may be confusing so look at the example:
//first_names = {"bob","joe"}
//last_names = {"jones","smith"}
//returns a new String array with {"bob jones", "joe smith"}

//67
Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7};
int arr3[]={1,2,3,4,5,6,7};

//68
//        input
//        int[] num21 = {1,2,4,0,0,5,0};
//        output
//                [5, 4, 2, 1, 0, 0, 0]
-----------------------------------------------------------------------
//69
input
   int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};

 output
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 ---------------------------------------------------------------------------
//70 Store into Array
int a[]={1,3,5};
            int b[]={2,4,6};
            output
            [1,2,3,4,5,6]
  ---------------------------------------------------------------
  //71
  String a="a2b5c7a9f0dafa2s6a8d5a";
                String str="";
                output
                aaaaaa2b5c79f0df2s68d5
----------------------------------------------------------------------
//72
don't use divide operator
int a=11;
int b=2;
 divide a by b and result is =5
                     reminder =1
 ============================================================

 //73
 //Create 1 array int[] and 1 ArrayList and store result into them and get this result
//Calculate each number of array: Ex 1+4,2+5,6+3
//input
//int a[]={1,2,3};// length 3
//        int b[]={4,5,6,7,8};// length 5
//
//outputint a[]={1,2,3};// length 3
////        int b[]={4,5,6,7,8};// length 5
//[5, 7, 9, 7, 8]
----------------------------------------------------------------------
//74
int[] arr = {5, 7, 3, 9, 1, 0};
int pivot = 8
In case we need to have pivot int inside the array the output should be: [5, 7, 3, 8, 9, 1, 0]

//75
 ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
print out
 four five seven

 //76
 Output

Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
[Aa , Bb , Cc , Dd , Ee , Ff , Gg , Hh , Ii , Jj , Kk , Ll , Mm , Nn , Oo , Pp , Qq , Rr , Ss , Tt ,

//77
       String str ="OsOdjjOssh";
       replace "o" with "a" only the number of o is 3 or 4
       asadjjassh <  BECAUSE THERE IS 3 O

//78 USE MAP
int a=25;
int b=10;

you have 2 integers
and with values assigned
how would u add them without + sign
 result =35;
 then subtract
 result=15;

//===================================================================================
//79
   //Write an efficient program to find the sum of contiguous sub array within a
        // one-dimensional array of numbers which has the largest sum.
// int a[]={ -2, -3, 4, -1, -2, 1, 5, -3};
 output
 7
===================================================================================
//80
 // Write a function that receives an array of positive integers with values
        //between and the length or the array. That function returns the number
        //that most frucient array
         Integer arr[]={22,101,102,101,102,101,525,88};
         output 101
//==========================================================================
//81
 String first="abccba"; < palindrome
 String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
 //====================================================================================
 //82
 I need the solution for an array of size N
Given an array {a1, a2, a3, … aN}
New array should be { a2*a3*…aN, a1*a3…aN, … a1*a2…a(N-1)}
For an example if N=4 and array we have is {2, 3 , 4, 5}
New array is (3*4*5, 2*4*5, 2*3*5, 2*3*4} = {60, 40, 30, 24}


83 // int y[]=new int[]{6,-6,5,1,2,8};
Remove all digits that less than 0 and also if that numbers match any number remove that number too
examp: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]

     */


///////////////////////////////////////////////////////////////////////////////////////

/*
1
 public static void main(String[] args) {
        String w="AAABBCDD";
        String d=FrequencyOfChars(w);
        System.out.println(d);

    }

    public static String FrequencyOfChars(String s){
        String result="";
        int j=0;
        while(j<s.length()){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            result+=s.charAt(j)+""+count+" ";
            s=s.replace(""+s.charAt(j),"");
        }
        return result;
    }
/---------------------------------------------------------------------------------------/
    public static String frequency(String str) {
        String nonDup="",
                result="";

        for(int i=0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        }
        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) , ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }
        return result;
    }
/--------------------------------------------------------------------------------------/
  public static String frequency(String s){
        String non="";
        String res="";
        for(int i=0;i<s.length();i++){
            if(!non.contains(""+s.charAt(i))){
                non+=s.charAt(i);
            }
        }
        for(int i=0;i<non.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(non.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
          res+=""+non.charAt(i)+count;
        }
        return res;
   }
   //-----------------------------------------------------------------------------------//
    String str = "AAABCCCDD";

        String nonDup="";

        for(int i=0; i < str.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) , ""+str.charAt( i ) );
          if(!nonDup.contains(""+str.charAt(i))){
              nonDup+=str.charAt(i)+""+num;
          }
        }

        System.out.println(nonDup);
//=========================================================================//
//2
 public static void main(String[] args) {
      String g="abc";
                String h="cab";

boolean b=same(g,h);
        System.out.println(b);
    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[]  ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1=Arrays.toString(ch1);
                String a2=Arrays.toString(ch2;

        return  a1.equals(a2) ;
    }
 //---------------------------------------------------------------------//
   public static boolean same(String str1, String str2) {
  String [] s=str1.split("");
  String []ss=str2.split("");
  Arrays.sort(s);
  Arrays.sort(ss)
;

  boolean bb=Arrays.equals(s,ss);
  return bb;
    }

//--------------------------------------------------------------------//
   public static boolean same(String str1, String str2) {
    String a = new  TreeSet<>(Arrays.asList( str1.split(""))).toString( );
    String b = new TreeSet<>(Arrays.asList( str2.split(""))).toString( );

       boolean bb=a.equals(b);
return bb;
//==================================================================//
//3
        int a=5;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
//==============================================================================//
//4
 Integer a [] = {2,5,7,15,1,6};

        ArrayList<Integer>g=new ArrayList<>(Arrays.asList(a));

        Integer max=Collections.max(g);
        Integer min=Collections.min(g);
        g.remove(min);
        Integer min1=Collections.min(g);
        Integer result =max-min1;
        System.out.println(result);
//==============================================================================//
//5
 ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
//--------------------------------------------------------------------------//
 int[] arr = {1, 2, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
//==================================================================================//
//6
String h="AAABBBCCC";
        String result = "";

        for (int i = 0; i < h.length(); i++) {
            if (!result.contains("" + h.charAt(i))) {
                result += "" + h.charAt(i);
            }
        }
        System.out.println(result);
//===============================================================================//
//7
String h="AAABBBCCCDEF";
        String result = "";

        for (int i = 0; i < h.length(); i++) {
           int count=Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
           result+=(count==1)?h.charAt(i):"";
        }
        System.out.println(result);
//==============================================================================//
//8
 String s="1a2b3c4f!@#";
        int sum=0;
        String letter="";
        String digit="";
        String sign="";
        for(int i=0;i<s.length();i++ ){
            if(Character.isDigit(s.charAt(i))) {
                digit+=s.charAt(i)+" ";
                sum+=Integer.parseInt(""+s.charAt(i));
            }
            if(Character.isAlphabetic(s.charAt(i))){
                letter+=s.charAt(i)+" ";
            }
            if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))){
                sign+=s.charAt(i);
            }
        }
        System.out.println(sum);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(sign);
//============================================================================//
//9
  String str="DC501GCCCA098911";
        String result="";

        for(int i=0;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
            if(Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }
            if(Character.isLetter(str.charAt(i))&&Character.isDigit(str.charAt(i+1))){
               result+=" ";
            }
            if(Character.isDigit(str.charAt(i))&&Character.isLetter(str.charAt(i+1))){
                result+=" ";
            }
        }
        result+=str.charAt(str.length()-1);
        System.out.println(result);

        String u="";
        String[] f=result.split(" ");
        System.out.println(Arrays.toString(f));
        for(String e:f){
            char []c=e.toCharArray();
            Arrays.sort(c);
            for(char r:c){
                u+=""+r ;
            }
        }
        System.out.println(u);

//=============================================================================//

//10
int[]a={1,2,3,9,4,5,6,7};

int max=Integer.MIN_VALUE;
for(int i=0;i<a.length;i++){
    if(a[i]>max){
        max=a[i];
    }
}
        System.out.println(max);
//=============================================================================//
//11
int[]a={1,2,3,9,4,5,6,7};

int min=Integer.MAX_VALUE;
for(int i=0;i<a.length;i++){
    if(a[i]<min){
        min=a[i];
    }
}
        System.out.println(min);

//=============================================================================//
//12
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {
            list.add(each);
            countZero+= (each==0)?1:0;
        }

        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
------------------------------------------------------------------------------------
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        int u[]=new int[arr.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                u[a++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(u));
-----------------------------------------------------------------------------
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
      ArrayList<Integer>h=new ArrayList<>();
      int count=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0){
              h.add(arr[i]);
          }
          if(arr[i]==0){
              count++;
          }
      }
        System.out.println(count);
      for(int i=0;i<count;i++){
          h.add(0);
      }

//=================================================================================//
//13
  int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        int gg[]=new int[arr1.length+arr2.length];

        int w=0;
        for(int i=0;i<gg.length;i++){
            if(i<arr1.length){
                gg[i]=arr1[i];
            }else if(w<arr2.length){
                    gg[i]=arr2[w++];
                }
            }

        System.out.println(Arrays.toString(gg));
//===========================================================================//
//14
int a=5;

    String h=a%2==0 ? "Even" : "odd" ;
        System.out.println(h);

//=========================================================================//
//15
 String result = "";
        for(int i=1; i <= 30; i++) {
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        System.out.println(result);

//====================================================================//
//16
int num1=4;
int num2=2;
        if(num2==0) {
            System.out.println("Invalid Number");
        }
        System.out.print(num1 +" devid by "+num2 +" is: ");


        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
 //=============================================================================//
 //17
  int  a = 10;
        int  b  = 20;
        a = a +b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
//===========================================================================//
//18

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";
        int[] arr = new int[100];
        for(int i=0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int each: arr) {
            if(each %15==0 )
                divisibleBy15+= each+" ";
            if(each %5==0 && each % 15!=0)
                divisibleBy5 += each+" ";
            if(each%3==0 && each %15!=0)
                divisibleBy3 += each+" ";
        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);




//------------------------------------------------------------------//

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)
            list.add(i + 1);


            System.out.print("Divisible By 15: ");

            list.forEach(p -> {
                if (p % 15 == 0 && p % 3 == 0) System.out.print(p + " ");
            });

            System.out.print("\nDivisible By 5: ");

            list.forEach(p -> {
                if (p % 5 == 0 && p % 15 != 0) System.out.print(p + " ");
            });

            System.out.print("\nDivisible By 3: ");

            list.forEach(p -> {
                if (p % 3 == 0 && p % 15 != 0) System.out.print(p + " ");
            });
//========================================================================//
//19
String password="Mr@34";
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";
        boolean  HasLower = password.matches(lowercase)
,
                HasUppere = password.matches(uppercase)
,
                HasDigits = password.matches(numbers)
,
                HasSpecial = password.matches(specialchars),
                Valid = false;
        if(password.length() >= 6 && !password.contains(" ")) {
            if (HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        }
        System.out.println(Valid);
//===========================================================================//
//20
 int N=24;
        String result = "";

        for (int i = 1; i <= N; i++) {

    result+=(i%2==0&&i%3==0&&i%5==0)?"CodilityTestCoders\n":(i%2==0&&i%3==0)?"CodilityTest\n":
  (i % 2==0 && i %5==0)?"CodilityCoders\n":(i % 3 == 0 && i % 5 ==0)?"TestCoders\n":
  (i % 2 ==0)?"Codility\n":(i % 5 == 0)?"Coders\n":(i % 3 == 0)?"Test\n": i + "\n";

        }
        System.out.println(result);
//============================================================================//

//21
int n=5;
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);
//======================================================================//
//22

        boolean primeNum=true;
        int num=5;
        if(num<=1) {
            System.out.println(primeNum==false);
        }
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                primeNum=false;
            }
        }
        System.out.println(primeNum);
//==================================================================//
//23

int num=-1234556;

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }
        num=Integer.valueOf(str);
        System.out.println(num);
    }
//============================================================================//
//24
 List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names );
//-----------------------------------------------------------------//
  ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                names.removeAll( Arrays.asList("Ahmed"));
        System.out.println(names);

//========================================================================//
//25
List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }
        }
        System.out.println(list);
//-----------------------------------------------------------------------//
 ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();
for(int i=0;i<list1.size();i++){
    if(list1.get(i)>100){
        list1.remove(list1.get(i));
        i--;
    }
}
        System.out.println(list1);

//---------------------------------------------------------------------------//
  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);

        System.out.println(list);
 //----------------------------------------------------------------//
//26
 int a=153;
        String q=""+a;
        Integer y=0;

        for(int i=0;i<q.length();i++){

                y += Integer.valueOf(q.substring(i, i + 1))*Integer.valueOf(q.substring(i, i + 1))
                *Integer.valueOf(q.substring(i, i + 1));
        }
        boolean b=a==y;
        System.out.println(b);

//=================================================================//
//27

        String str="ABBDDDCA";
        Map<Character, Integer> map = new LinkedHashMap<>();


        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) +2);
            } else {
                map.put(each, 1);
            }
        }

        System.out.println(map);
//--------------------------------------------------------------//
String str="AABBDDDC";
Map<Character, Integer> map = new LinkedHashMap<>();
for(int i=0;i<str.length();i++){
    int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
    if(!map.containsKey(str.charAt(i))){
        map.put(str.charAt(i),count);
    }
}
System.out.println(map);
----------------------------------------------------------------------
 for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
           ff.put(str.substring(i,i+1),count);
        }
        System.out.println(ff);

//========================================================//
28
        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);
 ---------------------------------------------------------------------------------------

        String str="AABBSDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
            if(count==1){
                map.put(str.charAt(i),count);
            }
        }
        System.out.println(map);


//====================================================================//
//29

 Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

        SortedSet<Integer> sm = new TreeSet<>(t.values());
        System.out.println(sm.first());
System.out.println(sm.last());
--------------------------------------------------
        int t=Collections.max(t.values());
        System.out.println(t);

//========================================================================================//
//30
   int n=6;
        int []a=new int[n];
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (i+1==a.length){
                a[i]=sum-(2*sum);
                break;
            }
            a[i]=i;
            sum+=i;
        }
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
//=====================================================================================//
31
//int a[]={1,2,3};
//int b[]={5,2,4};
//if(a[0]==b[0]){
//    System.out.println("true");
//}else if(a[a.length-1]==b[b.length-1]){
//    System.out.println("true");
//}else{
//    System.out.println("false");
//}

//        int [] arr1= {0};
//        int [] arr2= {0};
//        boolean result= false;
//        for(int i=0; i<arr1.length; i++) {
//            for(int j=0; j< arr2.length; j++) {
//
//                    if(arr1[0]== arr2[0] || arr1[arr1.length-1]== arr2[arr2.length-1]){
//                        result=true;
//
//                }
//            }
//        }
//        System.out.println(result);

//========================================================================================//
//32
   String q="buf-dt-rr";

//       String str="Mon-ey";
//        String[] arr= str.split("-");
//        System.out.println(arr.length);


//        int u=q.split("-").length;
//        System.out.println(u);
        int count=0;

        for(int i=0;i<q.length();i++){
            if(q.contains("-")){
                count++;
                q=q.replaceFirst("-","");
            }
        }
        System.out.println(count+1);

//-----------------------------------------------------------------------------------//
 String q="buf-dt-rr";
        String aa[]=q.split("");
        System.out.println(Arrays.toString(aa));
        int count=0;
        for(int i=0;i<aa.length;i++){
            if(aa[i].equals("-")){
                count++;
            }
        }
        System.out.println(count);

//===================================================================================//
//33

        int [] num= {1,2,1  };
        for(int i=0; i<num.length; i++) {
          if(num[i]==2&&num[i+1]==3){
              num[i+1]=0;
          }
        }
        System.out.println(Arrays.toString(num));

 //================================================================================================
 //34 String[] arr = {"1","2.5", "3", "3.5", "4.5"};
 //        double [] arr1= new double [arr.length];
 //        double max= Integer.MIN_VALUE; //-2147483648
 //        for(int i=0; i<arr.length; i++) {
 //            arr1 [i]+= Double.valueOf(arr[i]);
 //            if (max < arr1[i]) {
 //                max=arr1[i];
 //            }
 //        }
 //        System.out.println(max);

//=======================================================================================
//35
   String s = "Seda,20,Leyla,30";
        String y[]=s.split(",");
        Map<String,Integer>ff=new LinkedHashMap<>();

        for(int i=0;i<y.length;i++){

            ff.put(y[i],Integer.valueOf(y[i+1]));
            i++;
        }
        System.out.println(ff);


 ---------------------------------------------------------------------
   String str = "Seda, Nurik, Leyla, Seda";
        Map<String, String> map2 = new LinkedHashMap<>();
        String[] arr = str.split(",");
        for(int i=0; i<arr.length; i++){
            map2.put(arr[i], "");
        }
        System.out.println(map2);

//===================================================================================
//36
 int a[]={1,3,5};
        int b[]={2,4,6};
        int c[]=new int[a.length+b.length];
        int d=0;
        for (int i=0;i<a.length;i++){
            c[d]=a[i];
            c[d+=1]=b[i];
             d++;

        }
        System.out.println(Arrays.toString(c));

//=====================================================================//
//37
    int [] arr = {1,4,8,0,3,11,26,2};
    int y[] =new int[arr.length/2];
    ArrayList<Integer>t=new ArrayList<>();
    int a=0;
        for(int i=0;i<arr.length;i++){
            y[a++]=arr[i];
            t.add(arr[i]);
            i++;
        }
        System.out.println(t);
        System.out.println(Arrays.toString(y));
//=============================================================================//
//38

        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);


        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        System.out.println(map);

 //=================================================================================//
 //39
 Random random =new Random();
int num=0;
int count=1;
for(int i=1;i<=10;i++){
    num=1+random.nextInt(6);
    System.out.println(count+"= "+num);
    count++;
}
-------------------------------------------------------------------------
 int y[]=new int[10];
        for(int i=0;i<10;i++){
            y[i]=1+random.nextInt(6);
        }
        System.out.println(Arrays.toString(y));

//===============================================================================//
//40


        int r[]={-2,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        ArrayList<Integer>y=new ArrayList<>();

               for(int e=0;e<r.length-1;e++){

                for (int i = r[e] + 1; i < r[e + 1]; i++) {
                    y.add(i);
                }
            }

        System.out.println(y);
//========================================================================//
//41

        int num =5;
        int power =4;  // 625
        int result =1;
        while(power>0){
            result*=num;
            power--;
        }
        System.out.println(result);
//===============================================================================//
//42
 int num = 123; //321
        String y=""+num;
        ArrayList<Integer>j=new ArrayList<>();
        for(int i=y.length()-1;i>=0;i--){
            j.add(Integer.valueOf(""+y.charAt(i)));
        }
        System.out.println(j);
   ----------------------------------   SECOND---------------
   //        String  str = new StringBuffer(Integer.toString(num)).reverse().toString();
//        num=Integer.parseInt(str);
//        System.out.println(num);
--------------------------------------------------------------------------------------
  int num = -123;
        String h=""+num;
        String k="";
       for(int i=h.length()-1;i>0;i--){
           k+=h.charAt(i);
       }
        k="-"+k;
       num=Integer.valueOf(k);

        System.out.println(num);

//=============================================================================//
//43
//eger regeme bolunen regemlerin cemi onun ozune beraberdirse perfect numberdi
        int perfectNum =28;
        int sum =0;
        for(int i=1; i<perfectNum; i++) {
            if (perfectNum%i==0) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(perfectNum==sum);
==============================================================================
//44
 int[] a = {1,2};
        int[] b ={3,4};
        int[] c = new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
            c[a.length+i]=b[i];
        }
        System.out.println(Arrays.toString(c));

//=============================================================================================//
//45
  ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
        ,"armud","armud","armud","pear","apple","pear","pear"));

       Map<String,Integer>rr=new LinkedHashMap<>();
        for (int i=0;i<fruits.size();i++) {
            int count=Collections.frequency(fruits,fruits.get(i));
            rr.put(fruits.get(i),count);
        }

int a=Collections.max(rr.values());

        ArrayList<String>m=new ArrayList<>();
        for(String e:rr.keySet()){
            if(rr.get(e)==a){
                m.add(e);
            }
        }
        System.out.println(m);
==========================================================================================
//46

        String a="10aaa10ss20bb30aww1";
            String num="";
        for(int i=0;i<a.length()-1;i++) {
            if (Character.isDigit(a.charAt(i))) {
                num += a.charAt(i);
            }
            if(Character.isDigit(a.charAt(i))&&Character.isAlphabetic(a.charAt(i+1))){
              num+=" ";
            }
        }

     if(Character.isDigit(a.charAt(a.length()-1))){
            num+=a.charAt(a.length()-1);
     }

        String[] numArray=num.split(" ");
        int sum=0;
        for(int i=0;i<numArray.length;i++){
            sum+=Integer.valueOf(numArray[i]);
        }
        System.out.println(sum);
//====================================================================================//
//47
String a="DC501GCCCA098911GA32";
String result="";
for(int i=0;i<a.length()-1;i++) {
    if (Character.isLetter(a.charAt(i))) {
       result+= a.charAt(i);
    }
    if (Character.isDigit(a.charAt(i))) {
        result += a.charAt(i);
    }
    if(Character.isDigit(a.charAt(i))&&Character.isAlphabetic(a.charAt(i+1))){
        result+=" ";
    }
    if(Character.isLetter(a.charAt(i))&&Character.isDigit(a.charAt(i+1))){
       result+=" ";
    }
}
result+=a.charAt(a.length()-1);
String[] aa = result.split(" ");
String ss="";
for(String each: aa) {
    char[] chars=each.toCharArray();
    Arrays.sort(chars);
    for(char eachChar: chars){
        ss +=""+eachChar;
    }
}
System.out.println(ss)
;
==================================================================================
//48

ArrayList<String>d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
        int count=0;
        boolean b=false;
      for(int i=0;i<d.size();i++){
           count=Collections.frequency(d,d.get(i));
           if(count>1){
               b=true;
               d.remove(d.get(i));
               i--;
           }
      }
        System.out.println(d);
        System.out.println(b);
============================================================================================
//49
  String result111="";

        for(int i=1; i<=30; i++){
   result111+= (i%3==0 && i%5==0)? " FINRA ":(i%3==0)? " FIN ": (i%5==0)? " RA ": i+" ";
        }
        System.out.println(result111);
==============================================================================================
//50
Scanner input =new Scanner(System.in);
        System.out.println("Enter the required String: ");
        String word = input.next();

    //    String word="apple";
//        for(int i=0;i<word.length();i++)
//        {
//            for(int j=i+1;j<word.length();j++)
//            {
//              if(word.charAt(i)==word.charAt(j)){
//                word=word.replace(""+word.charAt(i),"");
//
//              }
//            }
//        }
     //   System.out.println(word)
;
for(int i=0;i<word.length();i++) {
    int count = Collections.frequency(Arrays.asList(word.split("")), "" + word.charAt(i));
    if (count == 2) {
        word=word.replace(String.valueOf(word.charAt(i)), "");
    }
}
        System.out.println(word)
;
---------------------------------------------------------------------------------
   String h="AABCC";
for(int i=0;i<h.length();i++){
    int count=Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
    if(count>1){
        h=h.replace(""+h.charAt(i),"");
    }
}
        System.out.println(h);


========================================================================================

 51
int count=0;
        for(int i=0;i<str.length()-2;i++) {
            char c=  str.charAt(i);
            if (c== str.charAt(i + 1)&&c==str.charAt(i+2)) {
                count++;            }
        }
        System.out.println(count);
============================================================================================
52
Integer[] arr = {1, 1, 2, 5,5};

        for(int i=0;i<arr.length;i++){
            int count=Collections.frequency(Arrays.asList(arr),arr[i]);
            if(count==1){
                System.out.println(arr[i]);
            }
        }
==============================================================================================
53
Scanner scan = new Scanner(System.in);
        System.out.print("In");
        String s = scan.nextLine();
        //write your code below
        String res ="";
        for (int i=0; i < s.length(); i++){
            if (i %2 ==0)res += s.substring(i,i+1).toLowerCase();
            if(i%2!=0) res += s.substring(i,i+1).toUpperCase();
        }
        System.out.println(res);
  ---------------------------------------------------------------------------------------------
    for(int i=0;i<a.length();i++){

            y+=i%2==0?a.substring(i,i+1).toLowerCase():"";
            y+=i%2!=0?a.substring(i,i+1).toUpperCase():"";
        }
==========================================================================================
54
 String maxWord ="";
        for (int i2=1; i2<=5; i2++){
            System.out.println("Enter a Word "+i2);
            String word1 = scan.nextLine();
            if (maxWord.length() < word1.length());
            maxWord =word1;
        }
        System.out.println("Max word length is: "+ maxWord);
===========================================================================================
55
   int[] arr= {200, 155, 100, 4, 3, 1, -1, -100};
        int[] arrDesc = new int[arr.length];

        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrDesc[k++] = arr[i];

        }
        System.out.println(Arrays.toString(arrDesc));
==========================================================================================
56
 int nums55[] = {1, 2, 3, 5, 5};
        boolean B = false;
        for (int i = 0; i < nums55.length - 1; i++) {
            if (nums55[i] == nums55[i + 1] && nums55[i] == 5) {
                B = true;

            }
        }
            System.out.println(B);

============================================================================================
57
 Integer nums55[] = {1, 1, 2, 3, 4, 3, 4};

        for (int i = 0; i < nums55.length - 1; i++) {
           int count=Collections.frequency(Arrays.asList(nums55),nums55[i]);
           if(count==1){
               System.out.println(nums55[i]);
           }
        }
=============================================================================================
//58

 DecimalFormat DF = new DecimalFormat("0.00");
        double[] arr55 = {10, 15, 5, 6};
        double length = arr55.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr55[i];
        }
        double average = sum / length;
        System.out.println(DF.format(average));
========================================================================================
//59
  String sentence = "Today is great day";
        String[] words44 = sentence.split(" ");
        String result = "";
        for (int i = words44.length - 1; i >= 0; i--) {
            String eachWords = words44[i];

            result += eachWords + " ";
        }
        System.out.println(result);
==========================================================================================
//60
 String sentence = "Today is great day";
        String[] words44 = sentence.split(" ");
        String result = "";
        for (int i = words44.length - 1; i >= 0; i--) {
           for(int j=words44[i].length()-1; j>=0; j--){
               result+=words44[i].charAt(j);
           }
           result+=" ";
        }
        System.out.println(result);
-----------------------------------------------------------------------------------------
for(int i=h.length-1;i>=0;i--){
          b+=" "+new StringBuffer(h[i]).reverse().toString();
        }
 ------------------------------------------------------------------------------------
 //     String sentence = "Today is great day";
//        Array [Today, is, great, day]
//        reverse Array[Today, is, great, day] to >  day great is Today
//        String[] u=sentence.split("");
//        String b="";
//        for(int i=u.length-1;i>=0;i--){
//            b+=u[i];
//        }
//        System.out.println(b);

=========================================================================================
61
  String sa = "I Like java and javascript not python";
            String[] dd = sa.split(" ");
            int count444 = 0;
            int count1 = 0;
            String ss444 = "";
            String s1 = "";
            for (int i = 0; i < dd.length; i++) {
                if (dd[i].contains("java")) {
                    count444++;
                    ss444 += dd[i] + " ";
                }
                if (dd[i].contains("python")) {
                    count1++;
                    s1 += dd[i];
                }
            }
========================================================================================
//62
 int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k11 = 0; k11 < numbers11.length; k11++) { //k: index num of 1D arrays
                for (int i111 = numbers11[k11].length - 1; i111 >= 0; i111--) { // i: index num of elements in 1D array
                    System.out.print(numbers11[k11][i111] + " ");
                }
            }
            System.out.println();
==============================================================================================
  //63
            int[][] numbers44 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k44 = numbers44.length - 1; k44 >= 0; k44--) { //k: index num of 1D arrays (reversed)
                for (int i = numbers44[k].length - 1; i >= 0; i--) { // i: index num of elements in 1D array (reversed)
                    System.out.print(numbers44[k44][i] + " ");
                }
            }
=======================================================================================
//64
 int[][] numbers33 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k22 = numbers33.length - 1; k22 >= 0; k22--) { //k: index num of 1D arrays (reversed)
                for (int i = 0; i < numbers33[k22].length; i++) { // i: index num of elements in 1D array
                    System.out.print(numbers33[k22][i] + " ");
                }
            }
===============================================================================
//65
 String[] arrr = { "2.5","1", "3","4", "3.5"};
        Arrays.sort(arrr);
        System.out.println(arrr[0]);
        System.out.println(arrr[arrr.length - 1]);
        -------------------------------------------------------------------
                String[] arrr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};
        Arrays.sort(arrr);
        double min=Double.valueOf(arrr[0]);
        double max=Double.valueOf(arrr[arrr.length-1]);
        System.out.println(min);
        System.out.println(max);

========================================================================================
//66
    String [] k = {"bob","joe"};
        String  [] o = {"jones","smith"};
        String []a=new String[k.length];

        for(int i=0;i<k.length;i++) {
            a[i] = k[i]+" " + o[i];
        }
        System.out.println(Arrays.toString(a));
========================================================================================
//67

        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        int gg[]=new int[arr1.length+arr2.length];

        int w=0;
        for(int i=0;i<gg.length;i++){
            if(i<arr2.length){
                gg[i]=arr2[i];
            }else if(w<arr1.length){
                gg[i]=arr1[w++];
            }
        }
        System.out.println(Arrays.toString(gg));
=============================================================================================
//68
     int arr1[]={1,2,4,0,0,5,0};
        ArrayList<Integer> list=new ArrayList<>();

     int count=0;
        for(int i=0;i<arr1.length;i++){
        if(arr1[i]>0) {
            list.add(arr1[i]);
        }
        count+=(arr1[i]==0)?1:0;
        }

        for(int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);


 -----------------------------ARRRAY---------------------------------
  int arr1[]={1,2,4,0,0,5,0};

        int y[]=new int[arr1.length];
        ArrayList<Integer> list=new ArrayList<>();
     int u=0;
        for(int i=0;i<arr1.length;i++){
         if(arr1[i]!=0){
             y[u++]=arr1[i];
         }
        }
==============================================================================================
//69

            int g1[]={1,2,3};
            int gg[]={4,5,6,7};
            int hW []={8,9};
            int dd1[]={10,11};
            int a11[]=new int[g.length+gg.length+h.length+dd.length];

            for(int i=0,j1=0,d1=0,w=0;i<a11.length;i++){
                if(i<g.length){
                    a11[i]=g[i];
                }else if(j<gg.length){
                    a11[i]=gg[j++];
                }else if(d<dd.length){
                    a11[i]=hW[d++];
                }else{
                    a11[i]=dd1[w++];
                }


            }
            System.out.println(Arrays.toString(a11));
========================================================================================
//70
 int a[]={1,3,5};
        int b[]={2,4,6};
        int c[]=new int[a.length+b.length];
        int k=0;
        int r=1;
        for (int i=0;i<a.length;i++){
            c[k]=a[i];
            c[r]=b[i];
            k+=2;
            r+=2;
        }
        System.out.println(Arrays.toString(c));
 ----------------------------------------------------------------------------------
   int u[]=new int[a.length*2];
        int y=0;
        for(int i=0;i<a.length;i++){
            u[y]=a[i];
            u[y+=1]=b[i];
            y++;
        }
=========================================================================================
//71
 String a="a2b5c7a9f0dafa2s6a8d5a";
        String str="";
        for(int i=0; i<a.length(); i++){
            if(a.substring(i,i+1).contains("a")){
                str+="a";
                a= a.replaceFirst("a","");
            }
        }
        str=str.concat(a);
        System.out.println(str);
    }
============================================================================================
//72
  int a=11;
        int b=2;
        int count=0;
        if(a>b) {
            for (int i = a; i >= b; i -= b) {
                count++;
                a -= b;
            }
        }
        System.out.println(a);
        System.out.println(count);
=====================================================================================
//73

        int a[]={1,2,3};// length 3
        int b[]={4,5,6,7};// length 4

        int c[]=new int[a.length+1];// 5,7,9,7
        ArrayList<Integer> h=new ArrayList<>();//5 7 9

        for(int i=0;i<a.length||i< b.length;i++) { // loop repeat 3 times
            if(i<a.length) {
                c[i] = a[i] + b[i];  // loop stops after third iteration because "a" length==3 so +
                h.add(a[i] + b[i]); //+ we cant add last index of "b" to int[]c and ArrayList "h"
            }
            else if(i<b.length){
                c[i]=b[i];
                h.add(b[i]);
            }
        }

        System.out.println(Arrays.toString(c));
        System.out.println(h);
================================================================================================
//74
  Integer num[] = {5, 7, 3, 9, 1, 3};
        int a = 8;

        ArrayList<Integer>g=new ArrayList<>();

        for(int i=0;i<num.length/2;i++){
            g.add(num[i]);
        }
        g.add(a);
        for(int i=num.length/2;i<num.length;i++){
            g.add(num[i]);
        }
        System.out.println(g);
 -------------------------------------------------------------------------------------
 int[] arr = {5, 7, 3, 9, 1, 0};
        int pivot = 8;
        ArrayList<Integer>gg=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(i==arr.length/2){
                gg.add(8);
            }
            gg.add(arr[i]);
        }
        System.out.println(gg);
==============================================================================================
//75
  ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five"));
       gg.set(0,"four");
        System.out.println(gg);
==========================================================================================


 //76
String result="";

ArrayList<String>gg=new ArrayList<>();
for(char c='A', ch='a';c<='Z';ch++,c++){
    result+=c+""+ch+" ";
    gg.add(c+""+ch+" ");
}

        System.out.println(result);
        System.out.println(gg);
========================================================================================
//77
        String str ="OsOdjjOOssh";
        ArrayList<String>g=new ArrayList<>(Arrays.asList(str.split("")));
        int count=0;
        for(int i=0;i<g.size();i++) {
          if(g.get(i).equals("O")){
              count++;
          }
        }
       if(count==3||count==4){
          str= str.replaceAll("O","a");
       }
        System.out.println(str);
        System.out.println(count);
 //-----------------------------------------------------------------------------
  String str ="OsOdjjOssh";

        for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),"O");
            if(count==3||count==4){
                str=str.replace("O","a");
            }
        }
        System.out.println(str);


=====================================================================================
//78
int a=25;
int b=10;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(a,b);
       int sum=0;
        for(Map.Entry<Integer, Integer> i: map.entrySet()) {
            sum=Math.subtractExact(i.getKey(),i.getValue());
        }

        for(Map.Entry<Integer, Integer> i: map.entrySet()) {
            sum=Math.addExact(i.getKey(),i.getValue());
        }

        System.out.println(sum);
        ----------------------------------------------------------------
         for(Integer r :map.keySet()){
            sum+=Math.subtractExact(r,map.get(r));
        }
-----------------------------------------------------------------------------
ArrayList<Integer>val=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(val.stream().map(i->i*2).reduce(0,(c,e)->c+e));

//=======================================================================================
//79
 int a[]={ -2, -3, 4, -1, -2, 1, 5, -3};

        int maxFinal = Integer.MIN_VALUE;
                int maxTemp = 0;
        for (int i = 0; i <a.length; i++) {
            maxTemp= maxTemp + a[i];
            if (maxFinal < maxTemp) {
                maxFinal = maxTemp;
            }
            if (maxTemp < 0) {
                maxTemp = 0;
            }
        }

      System.out.println("Maximum contiguous sum is " +maxFinal);

//=====================================================================================
//80
 Integer arr[]={22,101,102,101,102,101,525,88};
Map<Integer,Integer>h=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            int c=Collections.frequency(Arrays.asList(arr),arr[i]);
            if (!h.keySet().equals(arr[i])){
                h.put(arr[i],c);
            }
        }
        int max=Collections.max(h.values());

        ArrayList<Integer>g=new ArrayList<>();

        for(Integer q:h.keySet()){
            if(h.get(q)==max){
                g.add(q);
            }
        }
        System.out.println(g);

//===========================================================================================
//81
  String second="abccba";
        if(!second.substring(second.length()-1).equals(second.substring(0,1))){
            second=second.replace(second.substring(second.length()-1),second.substring(0,1));
        }

        String firstPlandrome=new StringBuilder(second).reverse().toString();
        boolean aa=second.equals(firstPlandrome);
        System.out.println("is palindrome > "+aa);

        String secondPalindrome="";
        for(int i=second.length()-1;i>=0;i--){
            secondPalindrome+=second.charAt(i);
        }

       boolean isPailndrome=second.equals(secondPalindrome);
        System.out.println(isPailndrome);
//============================================================================================================================
//82
public static int[] getArr(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int tem = 1;
            for(int j=0; j<arr.length; j++) {
                if(i!=j) {
                    q *= arr[j];
                }
            }
            result[i] = q;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3 , 4, 5};
        int[] result = getArr(arr);
        System.out.println(Arrays.toString(result));
    }
    //======================================================================================
 //83
 public static void main(String[] args) {
        int y[]=new int[]{6,-6,5,1,2,8};

     ArrayList<Integer> g= new ArrayList<>();
int a=0;

        for(int i=0;i<y.length;i++){
            if(y[i]<0){
                a=y[i];
            }
        }
        String w = "";
        w= ""+a;

        int r=0;
        r= Integer.parseInt(""+w.charAt(1));

     for(int i=0;i<y.length;i++){
         if(y[i]<0){
             continue;
         }
         System.out.println(y[i]+"   "+r);
        if(y[i]==r){
continue;
         }
         g.add(y[i]);
     }
        System.out.println(g);
    }


 */


}


