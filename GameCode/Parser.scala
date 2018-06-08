package Scalata 

object Parser {

       

       
       var actions = Array(Array("MOVE", "move", "go"),
       	   	     		Array("INSPECT", "inspect", "look", "check"),
				Array("THROW", "throw", "toss", "chuck"),
       	   	     		Array("DROP", "drop", "leave"),
				Array("PULL", "pull"),
				Array("PUSH", "push"),
				Array("SWITCH", "switch", "toggle"))

	var directions : Array[String] = Array("up", "down", "left", "right", "back", "forward", "north", "n", "south", "s", "east", "e", "west", "w")

       def newUserInput(userIn: String) {
       	   println("Parser recieved input: " + userIn)
       	   var parsed = userIn
       	   parsed = userIn.toLowerCase
	   parsed = substitute(parsed)
       	   println("Parsed Sentence: " + parsed)
	   
       }

       //def findAction(userIn: String) : String =  (

       

       def substitute(userIn: String) : String = {
       	   var userInSplit = userIn.split(" ")
	   var output : String = ""
       	   for(i <- 0 to userInSplit.length) {
	   	 println(userInSplit(i))
		 for(j <- 0 to actions.length) {
		       if(actions(j) contains userInSplit(i)) {
		       	     output += actions(j)(0)
			     }
			else {
			     output += userInSplit(i)
			     }
			
			output += " "
			}
		}
	
		output = output.substring(0, output.length - 1)
		return output
		
	}
}

