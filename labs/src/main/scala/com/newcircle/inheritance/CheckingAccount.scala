package com.newcircle.inheritance

import com.newcircle.classes.BankAccount

class InsufficientFundsException(message: String) extends Exception(message)

/** Create a CheckingAccount subclass that charges $1 for every deposit or
    withdrawal.
  */
class CheckingAccount extends BankAccount {
}
