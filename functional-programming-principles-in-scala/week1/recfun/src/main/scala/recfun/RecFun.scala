package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do print(s"${pascal(col, row)} ")
      println()

  /** Exercise 1
    */
  def pascal(col: Int, row: Int): Int =
    if (col == 0 || row == 0 || row == col) 1
    else pascal(col - 1, row - 1) + pascal(col, row - 1)

  /** Exercise 2
    */
  def balance(chars: List[Char]): Boolean =

    def balanceRec(count: Int, chars: List[Char]): Boolean =
      if (chars.isEmpty) count == 0
      else if (count < 0) false
      else if (chars.head == '(') balanceRec(count + 1, chars.tail)
      else if (chars.head == ')') balanceRec(count - 1, chars.tail)
      else balanceRec(count, chars.tail)

    balanceRec(0, chars)

  /** Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int =

    def countChangeRec(currentSum: Int, coins: List[Int]): Int =
      if (currentSum == money) 1
      else if (currentSum > money || coins.isEmpty) 0
      else countChangeRec(currentSum + coins.head, coins) + countChangeRec(currentSum, coins.tail)

    if (money == 0) 0
    else countChangeRec(0, coins)