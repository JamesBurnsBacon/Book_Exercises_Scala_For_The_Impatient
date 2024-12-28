package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class exercises$u002Eworksheet$_ {
def args = exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/exercises.worksheet.sc"""
/*<script>*/

// 1. sets a to an array of n random ints between 0 incl and n excl
val n = 4
val z = Array.ofDim[Int](n)
val a = for elem <- z yield scala.util.Random.between(1,n)

// 2. a loop that swaps adjacent elem of an array of ints
import scala.collection.mutable.ArrayBuffer
var b = ArrayBuffer(1, 4, -7, -5, 3) //we want ArrayBuffer(4,1,-5,-7,3)
for (i <- 0 until b.length - 1 by 2) {
    val temp = b(i)
    b(i) = b(i+1)
    b(i+1) = temp
}

// 3 repeat previous, but produce a new array with swapped vals, using for/yield
val d = ArrayBuffer(1, 4, -7, -5, 3)
val e = for i <- d.indices yield {
    if (i % 2 == 0 && i + 1 < d.length) d(i+1)
    else if (i % 2 == 1) d(i - 1)
    else (d(i)) 
    }

// 4 given array, put all positives first in orig order, then negs and zeros in orig ord
val f = ArrayBuffer(0, 1, 3, -2, -1, 2)
val positionsPositive = for i <- f.indices if f(i) > 0 yield i
val positionsNonPositive = for i <- f.indices if f(i) <= 0 yield i

val vector4 = positionsPositive ++ positionsNonPositive
for j <- vector4.indices do f(j) = vector4(j)

// 5 compute the average of an Array[Double]
// sum and divide by Array.length
val array5 = Array[Double](1,2,3,4,5)
val average5 = array5.sum / array5.length

// 6 rearrange elem of Array[Int] to reverse sored order, do the same with ArrayBuffer[Int]
val array6 = Array[Int](1,5,3,4,2)
val arrayBuffer6 = ArrayBuffer[Int](1,5,3,4,2)

val rearrangeArray6 = array6.sortWith(_>_)
val rearrangeArrayBuffer6 = arrayBuffer6.sortWith(_>_)
val otherRearrangement6 = array6.sorted.reverse

// 7 produce all vals from array with duplicates removed
val array7 = Array(1,1,2,3,3,3,4)
val distinct7 = array7.distinct

// 8 remove all but the first negative number
val arrayBuffer8 = ArrayBuffer(-1,2,-3,4,-5,6)
//must collect pos of negative elems, drop first elem, reverse seq, call a.remove(i) for each index
val positionsNegative = for i <- arrayBuffer8.indices if arrayBuffer8(i) < 0 yield i
val positionsToRemove = positionsNegative.drop(1)

for j <- positionsToRemove.reverse do arrayBuffer8.remove(j)
print(arrayBuffer8)

// 9 same as before, but collect positions that should be moved and their target positions, then truncate
// also don't copy any elements before the first unwanted element
val arrayBuffer9 = ArrayBuffer(0,-1,2,-3,4,-5,6)
val firstNegativeIndex = arrayBuffer9.indexWhere(_ < 0)
val positionsToKeep = for i <- arrayBuffer9.indices if i > firstNegativeIndex && arrayBuffer9(i) >= 0 yield i
for j <- positionsToKeep.indices do arrayBuffer9(j) = arrayBuffer9(positionsToKeep(j))
arrayBuffer9.dropRightInPlace(arrayBuffer9.length - positionsToKeep.length)

// 10 collection of time zones, strip off America/ prefix and sort the result
import java.util.TimeZone.getAvailableIDs





/*</script>*/ /*<generated>*//*</generated>*/
}

object exercises$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exercises$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exercises$u002Eworksheet_sc.script as `exercises.worksheet`
