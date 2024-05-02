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

    }
}