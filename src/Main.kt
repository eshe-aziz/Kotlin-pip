fun main() {
    greeting()
    remainder(35, 3)
    add(24, 59, 37, 64)
    fact()
    school()
    sentence("Eshe", 20)
    println(textLength("Ainembabazi"))
}


//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g given “Ada” it will print out “Hello Ada”
fun greeting(){
    var name = "Ada"
    println("Hello $name")
}


//Create and invoke a function that given 2 numbers returns the remainder of their division
fun remainder(num1: Int, num2: Int): Int{
    var nums = num1%num2
    println(nums)
    return nums
}


//Create and invoke  function that returns the sum of any given 4 numbers
fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1+num2+num3+num4
    println(sum)
    return sum
}


//Create and invoke a function that prints out an interesting fact about yourself
fun fact(){
    var sentence = "I like watching crime series"
    println(sentence)
}


//Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string.
fun school(){
    var word = "Akirachix"
    var a = word[0]
    var b = word[2]
    var c = word[3]
    var d = "$a$b$c"
    //or println(a+""+b+""+c)
    println(d)
}

//Write a function that takes in 2 parameters, name and age and returns a String with this structure
// "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively.

fun sentence(x: String, y: Int): String{
    var z = "Hi, my name is $x and I am $y years old."
    println(z)
    return z
}

//Write a function that takes in a String and returns its length
fun textLength(name: String): Int{
    return(name.length)
}
