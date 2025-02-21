// fun getGreeting(greeting:String,itemToGreet:String) = println("$greeting $itemToGreet")
fun sayHello(greeting:String , itemsToGreet:List<String>){
  itemsToGreet.forEach{ item ->
    println("$greeting $item")
  }
}

// fun main(){
//   // val greeting: String? = null
//   //   
//   // when(greeting){
//   //   null -> println("hello")
//   //   else -> println(greeting)
//   // }
//   
//   println("hello world")
//   getGreeting("hello","kotlin")
// }




//  COLLECTIONS AND INTERATORS

fun main(){
  // arrayOf or listOf
  // by default collections are immutable
  //val items = arrayOf("kotlin","java","c++")
  val items = mutableListOf("kotlin","java","c++")
  // println(items.size) // 3
  // println(items[0]) // kotlin
  // println(items.get(0)) // kotlin
  // items.add("python")
  // println(items[3])

  // FOR LOOP
  // for (i in items){
  //   println(i)
  // }

  // ALTERNATE TO FOR LOOP (forEach)
  // items.forEach { item ->
  //   println(item) // by default it , therefore can be println(it)
  // }

  // forEachIndexed
  // items.forEachIndexed { idx,item ->
  //   println("$item is at index $idx")
  // }
  
  // MAP
  // var map = mapOf(1 to "a",2 to "b",3 to "c")
  // var mp = mutableMapOf(1 to "z",2 to "x")
  // mp.put(3,"y")
  // mp.forEach { key , value ->
  //   println("$key -> $value")
  // }
  
  sayHello("hello",items)
}
