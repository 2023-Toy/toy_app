package com.opensw.toy.fragment


import androidx.navigation.fragment.findNavController
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentCommunityBinding


class CommunityFragment: BaseFragment<FragmentCommunityBinding>(R.layout.fragment_community) {
    override fun initView() {
        binding.apply {
            button.setOnClickListener {
                findNavController().navigate(R.id.action_communityFragment_to_communityDetailFragment)
            }


        }
    }

}