package jp.techacademy.kozo.kotlinlog

abstract class Animal {
    // property
    var name: String
    var age: Int

    // constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // methods
    abstract fun say()

}