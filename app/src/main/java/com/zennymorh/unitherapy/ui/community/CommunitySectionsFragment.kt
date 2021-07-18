package com.zennymorh.unitherapy.ui.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.zennymorh.unitherapy.R
import com.zennymorh.unitherapy.model.User

class CommunitySectionsFragment : Fragment() {

    private lateinit var viewPagerAdapter: CommunitySectionsAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter = CommunitySectionsAdapter(this)

        viewPager = view.findViewById(R.id.community_pager)
        viewPager.adapter = viewPagerAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }
}

