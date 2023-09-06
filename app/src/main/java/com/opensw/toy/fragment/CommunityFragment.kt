package com.opensw.toy.fragment


import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.opensw.toy.R
import com.opensw.toy.base.BaseFragment
import com.opensw.toy.databinding.FragmentCommunityBinding
import com.opensw.toy.presentation.adapter.CommunityListAdapter
import com.opensw.toy.presentation.viewModel.CommunityViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CommunityFragment: BaseFragment<FragmentCommunityBinding>(R.layout.fragment_community) {
    private lateinit var communityListAdapter: CommunityListAdapter
    private val communityViewModel: CommunityViewModel by viewModels()
    override fun initData() {
        //TODO("Not yet implemented")
    }

    override fun initUI() {
        loge("실행~")
        binding.apply {
            communityListAdapter = CommunityListAdapter()

            val decoration = DividerItemDecoration(context,1)
            rvCommunityDetailCommunity.addItemDecoration(decoration)
            rvCommunityDetailCommunity.adapter = communityListAdapter


            button.setOnClickListener {
                findNavController().navigate(R.id.action_communityFragment_to_communityDetailFragment)
            }
        }
    }

    override fun initObserver() {
        communityViewModel.communityList.observe(viewLifecycleOwner){
            communityListAdapter.setData(it)
            loge("${communityListAdapter.itemCount}")
        }
    }

    override fun initListener() {
        //TODO("Not yet implemented")
    }

}