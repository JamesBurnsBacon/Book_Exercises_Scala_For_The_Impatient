package section9

class Employee extends Person :
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
