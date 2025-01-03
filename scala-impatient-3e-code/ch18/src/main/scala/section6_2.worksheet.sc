// A class with a "fluent" interface
object Title // This object is used an an argument for a fluent interface

class Document :
  private var title = ""
  private var useNextArgAs: Any = null
  def set(obj: Title.type): this.type = { useNextArgAs = obj; this }
  def to(arg: String) = if (useNextArgAs == Title) title = arg // else ...
  override def toString = getClass.getName + "[title=" + title + "]"

val book = new Document
book set Title to "Scala for the Impatient"
book
