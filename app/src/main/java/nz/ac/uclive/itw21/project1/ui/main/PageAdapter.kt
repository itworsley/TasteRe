package nz.ac.uclive.itw21.project1.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    var fragmentPageList: ArrayList<Fragment> = ArrayList()
    var fragmentPageTitleList: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentPageList[position]
    }

    override fun getCount(): Int {
        return fragmentPageList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentPageList.add(fragment)
        fragmentPageTitleList.add(title)
    }

    override fun getPageTitle(position: Int) : CharSequence {
        return fragmentPageTitleList[position]
    }
}
