package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section3_2$u002Eworksheet$_ {
def args = section3_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section3_2.worksheet.sc"""
/*<script>*/
// The replaceFirst method without a lower bound

class Pair[T](val first: T, val second: T) :
  def replaceFirst(newFirst: T) = Pair[T](newFirst, second)
  override def toString = s"($first, $second)"

val p = Pair("Fred", "Brooks")
p.replaceFirst("Wilma")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3_2$u002Eworksheet_sc.script as `section3_2.worksheet`

