package com.opensw.toy.fragment

import androidx.navigation.fragment.findNavController
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentTransactionBinding

class TransactionFragment :
    BaseFragment<FragmentTransactionBinding>(R.layout.fragment_transaction) {
    override fun initView() {
        binding.apply {
            fabTransaction.setOnClickListener {
                findNavController().navigate(R.id.action_transactionFragment_to_transactionWriteFragment)
            }
            tvTransactionCount.setOnClickListener { findNavController().navigate(R.id.action_transactionFragment_to_transactionDetailFragment) }
        }
    }

}