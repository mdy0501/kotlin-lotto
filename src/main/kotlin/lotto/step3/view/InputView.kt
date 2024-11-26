package lotto.step3.view

object InputView {
    fun getPurchaseAmount(): Long {
        println("구입금액을 입력해 주세요.")
        val money = readln().toLong()
        return money
    }

    fun getLastWeekWinningNumbers(): Set<Int> {
        println("지난 주 당첨 번호를 입력해 주세요.")
        val winningNumbers = readln().split(",").map { it.trim().toInt() }.toSet()
        require(winningNumbers.size == 6) { "로또 당첨 번호는 중복되지 않고, 6개여야 합니다. [winningNumbers=$winningNumbers]" }
        return winningNumbers
    }

    fun getBonusNumber(): Int {
        println("보너스 볼을 입력해 주세요.")
        return readln().toInt()
    }
}
