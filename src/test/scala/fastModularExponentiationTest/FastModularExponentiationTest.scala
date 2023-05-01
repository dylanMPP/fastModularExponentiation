package fastModularExponentiationTest

import fastModularExponentiation.FastModularExponentiation

class FastModularExponentiationTest extends munit.FunSuite {
  val seg12Exp: Int = 13
  val seg12Mod: Int = 2537
  val firstModSeg12Number: Int = 812
  val secondModSeg12Number: Int = 1500
  val thirdModSeg12Number: Int = 817

  test("Fast Modular Exponentiation (Seg 12):") {
    assert(FastModularExponentiation.fastModularExponentiation(firstModSeg12Number, seg12Exp, seg12Mod) == 2160)
    assert(FastModularExponentiation.fastModularExponentiation(secondModSeg12Number, seg12Exp, seg12Mod) == 784)
    assert(FastModularExponentiation.fastModularExponentiation(thirdModSeg12Number, seg12Exp, seg12Mod) == 1204)
  }

  val example1Exp: Int = 13
  val example1Mod: Int = 2537
  val example1Number: Int = 1819
  val example1Number2: Int = 1415

  val example2Exp: Int = 17
  val example2Mod: Int = 3233
  val example2Number: Int = 2015
  val example2Number2: Int = 1114
  val example2Number3: Int = 3

  test("Fast Modular Exponentiation (Class Example):") {
    assert(FastModularExponentiation.fastModularExponentiation(example1Number, example1Exp, example1Mod) == 2081)
    assert(FastModularExponentiation.fastModularExponentiation(example1Number2, example1Exp, example1Mod) == 2182)

    assert(FastModularExponentiation.fastModularExponentiation(example2Number, example2Exp, example2Mod) == 2545)
    assert(FastModularExponentiation.fastModularExponentiation(example2Number2, example2Exp, example2Mod) == 2757)
    assert(FastModularExponentiation.fastModularExponentiation(example2Number3, example2Exp, example2Mod) == 1211)
  }

  val bookExample1Number: Int = 81
  val bookExample2Number: Int = 66
  val bookExample3Number: Int = 486
  val bookExample4Number: Int =396

  val bookExampleExp: Int = 2
  val bookExampleMod: Int = 645

  test("Fast Modular Exponentiation (Examples from Rosen's book):") {
    assert(FastModularExponentiation.fastModularExponentiation(bookExample1Number, bookExampleExp, bookExampleMod) == 111)
    assert(FastModularExponentiation.fastModularExponentiation(bookExample2Number, bookExampleExp, bookExampleMod) == 486)
    assert(FastModularExponentiation.fastModularExponentiation(bookExample3Number, bookExampleExp, bookExampleMod) == 126)
    assert(FastModularExponentiation.fastModularExponentiation(bookExample4Number, bookExampleExp, bookExampleMod) == 81)
    //Example Main Exercise
    assert(FastModularExponentiation.fastModularExponentiation(3, 644, bookExampleMod) == 36)
  }

  val number: Int = 2
  val number2: Int = 0
  val number3: Int = 27
  val number4: Int = -1

  test ("Decimal (non-negative) to Binary:"){
    assert(FastModularExponentiation.decimalToBinary(number) == List(1,0))
    assert(FastModularExponentiation.decimalToBinary(number2) == List(0))
    assert(FastModularExponentiation.decimalToBinary(number3) == List(1,1,0,1,1))
    // Nil list. Error cause number is negative
    assert(FastModularExponentiation.decimalToBinary(number4) == List())
  }

  val exp = 2
  val exp2 = 0
  val exp3 = 3

  test("Pow:") {
    assert(FastModularExponentiation.pow(number, exp) == 4)
    assert(FastModularExponentiation.pow(number3, exp) == 729)
    assert(FastModularExponentiation.pow(number, exp2) == 1)
    assert(FastModularExponentiation.pow(number2, exp3) == 0)
  }
}
