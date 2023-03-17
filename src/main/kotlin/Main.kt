fun main() {
    
    oddNumbers()


 println (names(arrayOf("Victoria","Elizabeth","Ben","Carol")))


    partyage(4)
    partyage(13)
    partyage(20)

newline()
}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    for (num in 1..100)
        if (num % 2 != 0)
            println(num )

}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 character
 fun names (number:Array<String>):Int{
     var numberLonger =0
    for (z in number){
        if(z.length>5){
            numberLonger++
        }

    }
    return numberLonger

}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun partyage(age:Int){
    when(age){
        in 0..5->println("glass of milk")
        in 7..14->println("fanta orange")
        else -> println("Cocacola")
    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
 fun newline(){
    for (number in 1..100)
     when {
         number% 3==0 &&number%5==0->println("FizzBuzz")
         number %3==0->println("Fizz")
         number%5==0->println("Buzz")
         else ->println(number)

     }
 }