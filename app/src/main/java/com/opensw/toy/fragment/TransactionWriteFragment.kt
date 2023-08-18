package com.opensw.toy.fragment

import androidx.navigation.fragment.findNavController
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentTransactionWriteBinding

class TransactionWriteFragment : BaseFragment<FragmentTransactionWriteBinding>(R.layout.fragment_transaction_write) {
    override fun initView() {
        binding.apply {
            tbTransactionWrite.ibToolbarBack.setOnClickListener { findNavController().popBackStack() }
        }
    }

}