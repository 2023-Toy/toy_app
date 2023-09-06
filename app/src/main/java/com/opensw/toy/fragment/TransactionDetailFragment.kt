package com.opensw.toy.fragment

import androidx.navigation.fragment.findNavController
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentTransactionDetailBinding

class TransactionDetailFragment : BaseFragment<FragmentTransactionDetailBinding>(R.layout.fragment_transaction_detail) {
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
            tbTransactionDetail.ibToolbarBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

}