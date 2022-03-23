fun main(){
    var person =Human("Toto",21,55)
    person.eat(2)
    println(person.weight)
    person.speak("I love eating")
   println(person.age)
person.birthday(1)
var info = citizen("Sismile","Muthoni","sismile@gmail.com","077092262","reen254")
    println(info.firstName)
    println(info.email)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        var food = "I am eating $foodWeight kgs of food"
        println(food)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(ageAdd:Int){
        age+=ageAdd
        println(age)
    }
}
data class citizen(var firstName:String,var lastName:String,var email:String,var phonNo:String,var password:String){

}