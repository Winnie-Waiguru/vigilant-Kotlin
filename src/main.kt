fun main (){
  var s= caculateModulus(9, 2)
    println(s)
    var z=addition(3, 5, 9, 3)
    println(z)
    interestingFact("I can't sing for I can only croak")
    newString("Akirachix")
    var q = println( introduction("Grace",12))
    println(q)
    var o= findingLength("I am currently a student")
    println(o)
    recognition("Alice")
    stringToArray("Mango", "Strawberry", "passion", "buberry")
    grammaticalCase(arrayOf("dodoma", "nairobi", "kigali", "lagos"))
    intOperation(arrayOf(32, 17,4 ,213,78,43,90,31,3,73,11, 158, 65))
     var p= generatingNames("Nick", "Albert", "ALex", "Andrew")
    println(p.contentToString())
    var l= arrayProduct(567, 7890)
    println(l)

    var f=sumDecimalELements(arrayOf(2.05, 9 , 56, 2.12F))
    println(f)

    var y= checkVowels(arrayOf('w', 'a', 'n', 'g', 'a', 'r', 'i'))
    println(y)
}

fun caculateModulus(num1:Int, num2:Int):Int{
    var modulus= num1 % num2
    return modulus
}

fun addition(a:Int, b:Int, c:Int, d:Int):Int{
    var sum = a+b+c+d
    return sum
}

fun interestingFact(statement:String){
    println(statement )

}

fun newString(name:String) {
    print(name[0].toString() + name[2] + name[3])
}

fun introduction(name:String, age:Int):String{
    return("Hi my name is $name and I am $age years old.")
}

fun findingLength(word:String):Int{
    return(word.length)
}

fun recognition(friend:String){
    if (friend=="Faith"){
        println("It's you")
    }
    else{
        println("I don't know who you are")
    }
}

fun stringToArray(name1:String, name2:String, name3:String, name4:String){
    var newArray= arrayOf(name1,name2, name3, name4)
    println(newArray.contentToString())
}

fun grammaticalCase(cities:Array<String>){
    println(cities.contentToString().capitalize())

}

fun intOperation(Numbers:Array<Int>){

    var addition = Numbers[1].plus(Numbers[4])
    println(addition)
    println(Numbers.indexOf(158))
    println(Numbers.sortedArray().contentToString())
}

fun generatingNames(names1:String, names2:String, names3:String, names4:String):Array<String>{
     var students= arrayOf(names1, names2, names3, names4)
    return (students)
}

fun arrayProduct(digit1:Int, digit2:Int): Int{
    var multiply= digit1* digit2
    return multiply
}

fun sumDecimalELements(num:Array<Any>):Double{
     var sum=0.00
    for(n in num){
        if (n == Double|| n==Int ){
            sum+=n.toString().toDouble()
        }
    }
    return sum
}

fun  checkVowels(letters:Array<Char>):Int {
    var total = 0
    for (l in letters) {
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
           total ++

        }

    }
    return total
}