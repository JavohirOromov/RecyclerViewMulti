package com.example.recyclerviewmulti
/**
 * Creator: Javohir Oromov
 * Date: 17/02/25
 * Project: RecyclerViewMulti
 * Javohir's MacBook Air
 */
interface DataRv{
    fun getType(): Int
}
data class AdvertData(val image: Int):DataRv{
    override fun getType(): Int = 1
}
data class CategoryData(
    val image: Int,val name: String, val background: Int
): DataRv {
    override fun getType(): Int {
        return 2
    }
}
data class ProductData(val image: Int, val name: String,val price: Int):DataRv{
    override fun getType(): Int {
        return 3
    }
}
data class SelectionData(
    val type: Int,
    val items: List<DataRv>)
