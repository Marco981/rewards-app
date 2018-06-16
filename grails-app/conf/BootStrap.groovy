class BootStrap {

    def init = { servletContext ->
		new customerreward.Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
		new customerreward.Product(name: "Dark Roast", sku: "DK01", price: 12.95).save()
    }
    def destroy = {
    }
}
