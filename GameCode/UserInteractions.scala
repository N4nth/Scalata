package Scalata

import scala.io.StdIn.readLine 


object UserInteractions {
       def main(args: Array[String]) {
       	   var running = true
      	    while(running){
		var userIn = readLine()
		println("UserInteractions recieved: " + userIn)
       		Scalata.Parser.newUserInput(userIn)	
       		}
       	}
}
