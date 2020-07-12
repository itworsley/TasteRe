package nz.ac.uclive.itw21.project1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.restaurant_item.view.*
import nz.ac.uclive.itw21.project1.ui.main.RestaurantList.MyListFragment
import nz.ac.uclive.itw21.project1.ui.main.PageAdapter
import nz.ac.uclive.itw21.project1.ui.main.RestaurantItem.RestaurantItem

class MainActivity : FragmentActivity() {

    lateinit var toolbarTab: Toolbar
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    lateinit var pageAdapter: PageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarTab = findViewById(R.id.toolbar)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tabs)

        pageAdapter = PageAdapter(supportFragmentManager);
        pageAdapter.addFragment(MyListFragment(), "My List")

        viewPager.adapter = pageAdapter

    }

    private fun generateRestaurantList(size: Int): List<RestaurantItem> {
        val list = ArrayList<RestaurantItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_restaurant_black_24dp
                1 -> R.drawable.ic_restaurant_black_24dp
                2 -> R.drawable.ic_restaurant_black_24dp
                else -> R.drawable.ic_restaurant_black_24dp
            }


            val item =
                RestaurantItem(
                    drawable,
                    "Item $i",
                    "Subtitle $i"
                )
            list += item
        }

        return list
    }

    fun showToast(view: View) {
        Toast.makeText(this, "C", Toast.LENGTH_SHORT).show()
    }

}