package example.myapp
class ProductManagement: IProductManagement {
    private val products = mutableListOf<Product>()

    override fun Show(){
        // Read Product
        for (u in products) {
            println("Product Name: ${u.name} and price $${u.price}")
        }
    }
    override fun deleteProduct(name: String) {
        products.removeIf { it.name == name }
    }
    override fun addProduct(product: Product) {
        products.add(product)
    }



}


