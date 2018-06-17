package customerreward

class WhiteboardController {
	def calculationsService

    def index() { }
	
	def variables() {
		
		def myTotal = 1
		render("Total: " + myTotal)
		render("</br>" + myTotal.class)
		myTotal = myTotal + 1
		render("</br>New Total :" + myTotal)
		def firstName = "Marco"
		render("</br>Name: " + firstName)
		
		def today = new Date("15/6/2018")
		render("</br>Today is " + today)
	}
	
	def conditions() {
		def welcomeMessage = calculationsService.welcome(params)
		render welcomeMessage
	}
	
}
