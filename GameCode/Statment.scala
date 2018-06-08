package Scalata

object Statement {
       var action : String
       var subject : String = "self"
       var parsedSentence : String

       
       def this(parsed : String) {
       	   parsedSentence = parsed
	   var splitSentence = parsedSentence.split(" ")

	   splitSenence.foreach(
		if(_.includes("SUBJECT")) {
			subject = _.substring("SUBJECT[".length(), _.length - 1)
		}
		if(_.includes("ACTION")) {
			action = _.substring("ACTION[".length(), _.length - 1)
		}
		)
	}
}
       