package com.example.hw1

class CounterModel {
    private var count: Int = 0 // Initialize count

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getResult(): Int {
        return count
    }
}
