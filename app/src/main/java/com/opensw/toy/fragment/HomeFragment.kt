package com.opensw.toy.fragment

import android.content.Intent
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override fun initData() {
        //TODO("Not yet implemented")
    }

    override fun initUI() {
        //TODO("Not yet implemented")
    }

    override fun initObserver() {
        //TODO("Not yet implemented")
    }

    override fun initListener() {
        //TODO("Not yet implemented")
        binding.apply {
            tvAppName.setOnLongClickListener {
                Intent(context, OssLicensesMenuActivity::class.java).also {
                    OssLicensesMenuActivity.setActivityTitle("오픈소스 라이선스")
                    startActivity(it)
                }
                return@setOnLongClickListener false
            }
        }
    }

}