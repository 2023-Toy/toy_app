package com.opensw.toy.fragment


import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentTransactionWriteBinding
import com.opensw.toy.util.SubCategory

class TransactionWriteFragment : BaseFragment<FragmentTransactionWriteBinding>(R.layout.fragment_transaction_write) {
    override fun initView() {
        binding.apply {
            btTransactionWriteAdd.setOnClickListener {
                Toast.makeText(context, "글 등록하기", Toast.LENGTH_SHORT).show()
            }
            tbTransactionWrite.ibToolbarBack.setOnClickListener { findNavController().popBackStack() }
            chipToy.setOnClickListener {
                scSubcategory.scrollTo(0,0)
                cgTransactionWriteSubCategory.removeAllViews()
                SubCategory.Toy.forEach{ it ->
                    cgTransactionWriteSubCategory.addView((layoutInflater.inflate(R.layout.chip_pink,cgTransactionWriteSubCategory,false) as Chip).apply {
                        text = it
                    })
                }
            }
            chipBaby.setOnClickListener {
                scSubcategory.scrollTo(0,0)
                cgTransactionWriteSubCategory.removeAllViews()
                SubCategory.Baby.forEach{ it ->
                    cgTransactionWriteSubCategory.addView((layoutInflater.inflate(R.layout.chip_pink,cgTransactionWriteSubCategory,false) as Chip).apply {
                        text = it
                    })
                }
            }

        }
    }

}