package com.opensw.toy.fragment

import androidx.navigation.fragment.findNavController
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentTransactionDetailBinding

class TransactionDetailFragment : BaseFragment<FragmentTransactionDetailBinding>(R.layout.fragment_transaction_detail) {
    override fun initView() {
        binding.apply {
            tbTransactionDetail.ibToolbarBack.setOnClickListener { findNavController().popBackStack() }
        }
    }

}