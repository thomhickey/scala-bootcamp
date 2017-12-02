package com.newcircle.inheritance

import com.newcircle.classes.BankAccount

class InsufficientFundsException(message: String) extends Exception(message)

/** Create a CheckingAccount subclass that charges $1 for every deposit or
    withdrawal.
  */
class CheckingAccount extends BankAccount {

  private val Charge = 1.00

  override def deposit(funds: BigDecimal): Unit = {
    val adjustedFunds = funds - Charge
    if ((balance + adjustedFunds) < 0)
      throw new InsufficientFundsException("Insufficient funds for deposit.")
    super.deposit(adjustedFunds)
  }

  override def withdraw(funds: BigDecimal) = {
    val adjustedFunds = funds + Charge
    if ((balance - adjustedFunds) < 0)
      throw new InsufficientFundsException("Insufficient funds for withdrawal.")
    super.withdraw(Charge)
    super.withdraw(funds)
  }
}
