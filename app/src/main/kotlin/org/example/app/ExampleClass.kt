package org.example.app

class ExampleClass(override var variableExample: Int, override var nameExample: String) : ExampleInterface {

    override fun init(): String {
        return "Hello"
    }

    override fun final(): String{
        return "My baby (-)(-)"
    }
}