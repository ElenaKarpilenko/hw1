package com.example.hw1

class CounterPresenter {

    private val model = CounterModel()
    private var counterContract: CounterContract? = null

    fun attachCounterContract(counterContract: CounterContract) {
        this.counterContract = counterContract
        counterContract.showResult(model.getResult())
    }

    fun onIncrement() {
        model.increment()
        counterContract?.showResult(model.getResult())
        if (model.getResult() == 10) {
            counterContract?.showToast("Поздравляем!")
        } else if (model.getResult() == 15) {
            counterContract?.changeTextColorToRed()
        }
    }

    fun onDecrement() {
        model.decrement()
        counterContract?.showResult(model.getResult())
    }
}