// 1 prints the message on the first line, and empty parentheses on the second line
//It prints the parentheses as if literal
println(println("Hello"))

// 2 value and type of empty block expression {}, has only the absence of meaningful data
type {} //Unit
 
// 3  assignment where x = y = 1 is valid
var i: Any = 0
var j = 0

i = j = 1 // Does not set i to 1

// 4 Scala loop from Java syntax: for(int i = 10, i >= 0; i--)System.out.println(i);
var i :Int = 10
while i >= 0 do
  println(i)
  i -= 1
end while

// 5 the signum of a number is 1 if positive, -1 if negative, and zero if 0
def signum(n: Double) =
    def abs(x: Double) = if x >= 0 then x else -x
    if n != 0 then
        n/abs(n)
    else
        0

// 6 function countdown(n:Int) that prints the numbers from n to 0 w/o returning val

