package com.opensw.toy.presentation.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.opensw.domain.model.DomainCommunityTab
import com.opensw.domain.usecase.CommunityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CommunityViewModel @Inject constructor(
    private val communityUseCase: CommunityUseCase
): ViewModel() {
    private var _communityList : MutableLiveData<List<DomainCommunityTab>> = MutableLiveData()
    val communityList : LiveData<List<DomainCommunityTab>>
        get() = _communityList

    init {
        getCommunityList()
    }
    fun getCommunityList(){
        viewModelScope.launch {
            _communityList.postValue(communityUseCase.getCommunityTabList())
        }
    }
}