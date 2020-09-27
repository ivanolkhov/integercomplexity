object IntComp {
  def integerComplexity(num: Int): Int = {
    var result = num + 1
    for (i <- 1 to num / 2) {
      if (num % i == 0) {
        val n = num / i
        val m = n + i
        if (m < result) result = m
      }
    }
    result
  }

}
