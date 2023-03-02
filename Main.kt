fun main() {
    var person= Human("Snaida", 20, 48)
   person.eat(1)
    person.Weight
    println(person.Weight)
    person.speak("hey")
    person.birthday()
    println(person.Age)
var user=User("Mary","Snaida", "marysnaidaa@gmail.com", "731865465")
    println(user.firstName)
    println(user.phonenumber)
}
class Human(var name: String, var Age: Int, var Weight: Int){
    fun eat(foodweight: Int){
      println  ("I am eating $foodweight kgs amount of food")
        Weight += foodweight



    }
    fun speak(speech: String){
        println(speech)
    }
   fun birthday(){
       Age++

    }
}
data class User( var firstName: String, var lastname : String,var email: String, var phonenumber : String){

}

