package nz.ac.uclive.itw21.project1.ui.main.RestaurantList

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import nz.ac.uclive.itw21.project1.R
import nz.ac.uclive.itw21.project1.ui.main.RestaurantItem.RecyclerItemClickListener
import nz.ac.uclive.itw21.project1.ui.main.RestaurantItem.RestaurantItem
import nz.ac.uclive.itw21.project1.ui.main.RestaurantItem.RestaurantItemAdapter


class MyListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_my_list, container, false)
        val restaurantList = generateRestaurantList(100)
        recyclerView = view.findViewById(R.id.restaurant_list)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = RestaurantItemAdapter(restaurantList)
//        recyclerView.addOnItemTouchListener(
//            RecyclerItemClickListener(
//                context,
//                recyclerView,
//                object :
//                    RecyclerItemClickListener.OnItemClickListener {
//                    override fun onItemClick(view: View?, position: Int) {
//                        Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onLongItemClick(view: View?, position: Int) {
//                        // do whatever
//                    }
//                })
//        )
        return view
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
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment MyListFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            MyListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}
