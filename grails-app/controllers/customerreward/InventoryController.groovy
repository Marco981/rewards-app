package customerreward

class InventoryController {

    def index() { 
		render "Here is a list of everything"
	}
	
	def edit() {
		def productName = "Breakfast Blend"
		def sku = "BB01"
		[product:productName, sku:sku]
	}
	
	def remove() {
		render "you have one less than before"
	}
	
	def list() {
		def allProducts = Product.list()
		[allProducts:allProducts]
	}
}
