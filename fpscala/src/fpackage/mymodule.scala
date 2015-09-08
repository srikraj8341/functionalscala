package fpackage

/**
 * @author Srikanth
 */
object mymodule {
  
  def abs(n:Int):Int ={
    if (n>0)n 
    else -n
    }
  
  def formatAbs(n:Int)={
    val msg = "Absolute value of %d is %d"
    msg.format(n, abs(n))
  }
  
  def main(args: Array[String]):Unit={
    formatAbs(-42)
  }
  
}