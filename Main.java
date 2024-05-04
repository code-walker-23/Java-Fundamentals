class Main{
public static void main(String[]args){
        int intMaxRange = Integer.MAX_VALUE;
        int intMinRange = Integer.MIN_VALUE;

     System.out.println("Integer Value Range (" + intMinRange + " to " + intMaxRange + ")");
/*   In Java, primitive types are the most basic types of the data types.
     There are eight primitive data types in Java.
     1. integer(int)
     2. short
     3. byte
     4. long
     5. char
     6. boolean
     7. float
     8. Double
     The Plus sign when used in System.out.print will print different data types together as single line of text.
     In the example:
     System.out.print(("Intenger Minimum Vlaue = ") + (intMinValue)
     We want to print a label,before a numeric integer value.
     whatever follows the Plus Sign in System.out.print  here conerted to String by Java and Concatenated to the String before it.*/

/*   Java uses the concept of Wrapper Class, for all of its primitive data types
     A wrapper class provides simple operations, as well as some basic information about the primitive data types,which can not be stored on a primitive itself.

     Primitive        Wrapper Class
     byte         ->     Byte
     short        ->     Short
     char         ->     Character(Full Name)
     int          ->     Integer(Full Name)
     long         ->     Long
     float        ->     Float
     double       ->     Double
     boolean      ->     Boolean
     Same name with uppercase letter at the start.

     Overflow -> int num = (intMaxNumber+1); -> Busted Max Value.(Negative).
     Underflow -> int num = (intMinNumber-1); -> Busted Min Value.(Positive).

     This Situation is also known as integer wraparounds.

     The maximum value, when it overflows, wraps around to the minimum value and just continuing process without any error.
     The minimum value, when it underflows, wraps around to the maximum value and just continuing process without any error.

    jshell> Integer.MAX_VALUE
    $1 ==> 2147483647(Around 2.4 Billion).

    jshell> Integer.MIN_VALUE
    $2 ==> -2147483648

    jshell> Integer.MAX_VALUE+1
    $3 ==> -2147483648

    jshell> Integer.MAX_VALUE+4
    $4 ==> -2147483645

    jshell> Integer.MIN_VALUE-1
    $5 ==> 2147483647

    jshell> Integer.MIN_VALUE-2
    $6 ==> 2147483646

    jshell> int num = 2147483648
    Error:
    integer number too large
    int num = 2147483648;
           ^
    jshell> int num = -2147483649
     Error:
    integer number too large
    int num = -2147483649;
            ^
    An integer wraparound event, either an overflow or underflow, can occur in java when you are using expression that are not simple literal value.
    Use Simple literal value to avoid Underflow and Overflow.


    int willThisCompile  = (Integer.MAX_VALUE + 1); Using Numeric Literals  EXpression -> Compiler won't try to evaluate this expression and it will compile and run gets Overflow.
    int willThisCompile1 = (2147483647 + 1);
    int willThisCompile2 = 2147483648; -> It gives Error
    System.out.println(willThisCompile);
    System.out.println(willThisCompile1);

    In Java, You can not put Commas in numeric literals
    int myMax = 2,147,484,647;

    You can use Underscore to improve readability.(You can not use at the start and end of the numeric literals).
    int myMax = 2_147_483_647;

*/

/*
 In the eight primitive datatype there are 4 whole number primitive datatype (Number without decimal or fractional part).
 We have explored already one.(Integer)-> Java Default datatype for whole number.

 We look at the byte,short and long.

jshell>  System.out.print("Byte Value Range (" + Byte.MIN_VALUE + " to "  + Byte.MAX_VALUE + ")")
Byte Value Range (-128 to 127)-> Use for Better performance by saving space.

jshell> System.out.print("Short Value Range (" + Short.MIN_VALUE + " to "  + Short.MAX_VALUE + ")")
Short Value Range (-32768 to 32767)

They have also same wraparound conditions.

 */

/*
Using a Numeric Literal Character Suffix.
Java allows certain numeric literals to have a suffix appended to the value, to force it to be a different data type from the default data type.

long my = 100 -> this will read hundered as integer.
The long is one of the types and its suffix is 'L'.

This is one of the few instance java is not case sensitive, a lowercase 'l' or an uppercase'L at the end of the whole number.

Possible lossy Conversion

long longNum = 10;
int intNum = longNum;

jshell> short num = 32767
num ==> 32767

jshell> short num = 32768
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short num = 32768 ;


jshell> System.out.print("A long has width of " + Long.SIZE)
A long has width of 64(bits)

jshell> System.out.print("Long Value Range (" + Long.MIN_VALUE + " to "  + Long.MAX_VALUE + ")")
Long Value Range (-9223372036854775808 to 9223372036854775807)

long val = 2_147_483_647_234; ->  it will give number is too large because it reads as integer. use L suffix.

*/

/* // Jshell rules

    You can not declare different data type in a single statement.
    jshell> int num = 10 , num1 = 90;(int must be write once)
    num ==> 10
    num1 ==> 90

    You can but separated by ;.
    jshell> int num = 10; byte num2 = 12
    num ==> 10
    num2 ==> 12

    Multiples line of code we can write but separated by (;).

   // Assigning a expression to varibles with data type that does not match.

    If your calculation used literal values java can figure out the result at compile time,fit or not fit in varibale.
    jshell> byte newByteValue = (Byte.MIN_VALUE/2);
    newByteValue ==> -64

    -> Java does not attempt to evaluate the value in a variable,when it's used in calculation , so it does not know if the value fits and throws an error.
    jshell> byte byteMinValue = (Byte.MIN_VALUE);
    byteMinValue ==> -128

    jshell> byte newByteValue = (byteMinValue/2);
    |  Error:
    |  incompatible types: possible lossy conversion from int to byte
    |  byte newByteValue = (byteMinValue/2);

    small data type = large data type -> Possible lossy Conversion.
*/

 /* Java Type Casting

    jshell> byte newByteValue = (byte)(byteMinValue/2);
    newByteValue ==> -64

    Integer is the best primitive data type for whole numbers.

 */

    /* Java Practice Data type
    jshell> long myNum = 2147483648
    |  Error:
    |  integer number too large
    |  long myNum = 2147483648;
    |               ^

    jshell> long myNum = 2147483648L;
    myNum ==> 2147483648

    jshell> long myNum = 2147483648L + 2147483648;
    |  Error:
    |  integer number too large
    |  long myNum = 2147483648L + 2147483648;
    |                             ^

    jshell> long myNum = 2147483648L + 2147483648L;
    myNum ==> 4294967296

    jshell>
    long myNum = 2147483648L * 2147483648;
    |  Error:
    |  integer number too large
    |  long myNum = 2147483648L * 2147483648;
    |                             ^

    jshell> long myNum = 2147483648L * 2147483648L;
    myNum ==> 4611686018427387904

    */

 /*
    Floating Point Number -> Also Known as Real number or Decimal number
   -> A number with Fractional part represented in decimal points.
   -> There are only two primitive types for floating point number.
   1. Float.
   2. Double.
   ->Java's default data type for floating point numbers(Real numbers) is Double

   Precision -> It refres to the format and amount of space occupied by the relevant type.
   float -> width = 32bits. -> Min. Value = 1.4E-45. -> Max. Value = 3.4028235E38.
                                                ^ -> Minus
   double -> width = 64bits.-> Min. Value = 4.9E-324. -> Max. Value = 1.7976931348623157E308.
                                                ^Minus
   Java's Scientific Notation -> E = "times 10 to the power of".

   float -> 1.4*10^-45 to 3.4*10^38

   Double -> it can store much lesser decimal value than float and much bigger decimal value than float.
   That's it is more precise and java Choses this ad default.

   jshell> System.out.print("float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
   float Value Range (1.4E-45 to 3.4028235E38)

   jshell> System.out.print("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
   Double Value Range (4.9E-324 to 1.7976931348623157E308).

   float and double -> Numeric Literal suffixes.
   double x = 10.0L or 10.0l; L 0r l is Optional

   float x = 10.0f or 10.0F; F or f is mandatory otherwise Possible Lossy Conversion.
   jshell> float x = 10.0
    |  Error:
    |  incompatible types: possible lossy conversion from double to float
    |  float x = 10.0;

    -> We will use Type Casting.

    jshell> float x = (float)10.0
    x ==> 10.0

   Like Integer, Double is the best primitive type for Real numbers.
   Java's Default data type for decimal literals is double.

    Result -> will be in Big data type.

    jshell> int x = 5/2;
    x ==> 2

    jshell> double y = 10.00/5
    y ==> 2.0

    jshell> y = 10.00/5f
    y ==> 2.0

    jshell> float z = 10.00/5f;
    |  Error:
    |  incompatible types: possible lossy conversion from double to float
    |  float z = 10.00/5f;
    |            ^------^

    jshell> z = 5f/3
    |  Error:
    |  cannot find symbol
    |    symbol:   variable z
    |  z = 5f/3
    |  ^

    jshell> z = 5.0f/3
    |  Error:
    |  cannot find symbol
    |    symbol:   variable z
    |  z = 5.0f/3
    |  ^

    jshell> float z = 5.0f/3
    z ==> 1.6666666

   // Challenge

    jshell> double kilogram = 0.45359237*pounds;
    kilogram ==> 1.81436948

    jshell> int pounds = 200;
    pounds ==> 200

    jshell> double kilogram = 0.45359237*pounds;
    kilogram ==> 90.718474

    jshell> double d = 3000_000.45_678
    d ==> 3000000.45678


    Both are neither used in precise calulation -> Class of bigDecimal to deal with this.
 */

 /* Char DataType
    Ques. why do you want to use a variable that only allows you to store one character.
    ans. One example might be to store the last key pressed by the user in a game.
    ans. Another example might be to loop programmatically through the letters in an alphabet


    jshell> char c = 'D';
    c ==> 'D'

    jshell> char c = 'DD';
    |  Error:
    |  unclosed character literal
    |  char c = 'DD';
    |           ^

    jshell> char c = 'V';
    c ==> 'V'


    char -> it occupies two byte of memory,similar to short type
    char -> width of 16bits.
    char -> The number gets mapped to char in a java.
          .so when you print a character, you will see the mapped character, and not the representatitve number.

    Java -> it uses Unicode.
    unicode -> It is character encoding standard for use with different languages and scripts by which each letter ,symbol or digit is assigned a unique numeric value
    that applies accross different platform and programs.

    Unicode -> it allows to represent different languages.
    Unicode -> It allows 65,535 characters.

    There are two ways to represent the the car -> 1. Unicode vlaue eg.('\u0044') Always write in single quotes.
                                                -> 2. Decimal Number eg.(68)No single quotes needed.

    1. char c = 'D';
    2. char c = '\u0044';
    3. char c = 68;

    String -> string is a class that contains a sequence of characters.
    jshell> String myString = "This is a string";
    myString ==> "This is a string"
    jshell> System.out.print("mystring is eqaul to" + myString)
    mystring is eqaul toThis is a string
    jshell> myString = myString + ", and this is more"
    myString ==> "This is a string, and this is more"

    Executing Multiple Statements in Jshell.
    1.Method(Put your statement in a single line separated by semicolon;)
    jshell> {
   ...>    String numberString = "250.55";
   ...>    numberString = numberString + "49.25";
   ...>    System.out.print(numberString);
   ...> }
    250.5549.25
    2.Method(put your code in pair of curly braces).
    jshell>  String numberString = "250.55"; numberString = numberString + "49.25"; System.out.print(numberString);
    numberString ==> "250.55"
    numberString ==> "250.5549.25"

    A String + anything else,gives us a String as a result, Concatenating anything after the String as text to the initial String.

    Strings are immutable.
    Immutable-> That you can not change a string after it's created.
    So in this case of code we have written is technically not appended in the previous content of lastString

    jshell> int myInt = 10;
    myInt ==> 10

    jshell> String lastString = "My String";
    lastString ==> "My String"

    jshell> lastString = lastString + myInt
    lastString ==> "My String10"

    Instead, a new string is created automatically in java. The new String consist of the previous value of the lastString,plus a textual representation of the double value.
    And put in  lastString varibale old one is discarded from the memory......

    The String Class is immutable,but can be used much like a primitive data type.
    The StringBuilder Class is mutable, but does not share the the Strings's Special feature such as being able to assign it a string literal or  use the plus + operator on it.

    But the string class is in special category in java language.

    The String is so intrinsic to the java Language,it can be used like 9th primitive type.
    But it's not a primitive type at all,it's a class.

  */


/* Boolean Datatype

Ques. Why would you start your boolean variable with the prefix 'is'?
ans . hasChildrens.
      isMarried.

*/


/*
    Ques. Why do we need a Integrated Development Environment(IDE).
    Ans. An IDE is the easiest ,least error-prone way to develop, manage and deploy java classes.
    it provide many bebfits to developer including
    1. Increased Productivity.
    2. Code Completion.
    3. refactoring of a code.
    4. Debugging tools.
    5. Version control.
    

*/
    }
}