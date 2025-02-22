// PRIMARY CONSTRUCTOR

// class person(_firstName:String,_lastName:String){
  // val firstName:String
  // val lastName:String
  //
  // init{
  //   firstName = _firstName
  //   lastName = _lastName
  // }
// }

// ALTERNATE
// class person(val firstName:String,val lastName:String)


// SECONDARY CONSTRUCTOR

// always first init blocks are run when a class is called then secondary constructor
private class person(val firstName:String,val lastName:String){

  init{
    println("init1")
  }

  constructor(): this("peter","parker"){
    println("secondary constructor")
  }

  init{
    println("init2")
  }
}
