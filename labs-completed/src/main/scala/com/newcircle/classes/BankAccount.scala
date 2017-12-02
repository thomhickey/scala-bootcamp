package com.newcircle.classes

class BankAccount {

  private var currentBalance = BigDecimal(0.0)

  def deposit(funds: BigDecimal): Unit = {
    if (funds < 0) throw new IllegalArgumentException("negative deposit")

    currentBalance += funds
  }

  def withdraw(amount: BigDecimal): BigDecimal = {
    val actualAmount = if (amount > currentBalance) currentBalance else amount
    currentBalance -= actualAmount
    actualAmount
  }

  def balance = currentBalance
}
