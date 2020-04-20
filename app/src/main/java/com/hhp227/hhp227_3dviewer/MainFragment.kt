package com.hhp227.hhp227_3dviewer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    companion object {
        fun newInstance(): Fragment = MainFragment()
    }

    private lateinit var mActivity: AppCompatActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mActivity = activity as AppCompatActivity

        mActivity.run {
            title = getString(R.string.main_fragment)

            setSupportActionBar(toolbar)
        }
        setDrawerToggle()
    }

    private fun setDrawerToggle() {
        ActionBarDrawerToggle(mActivity, mActivity.drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close).let {
            mActivity.drawer_layout.addDrawerListener(it)
            it.syncState()
        }
    }
}
