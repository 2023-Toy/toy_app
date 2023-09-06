package com.opensw.data.reposigoryImpl

import android.util.Log
import com.opensw.data.remote.dataSource.CommunityDataSource
import com.opensw.domain.model.DomainCommunityTab
import com.opensw.domain.repository.CommunityRepository
import java.lang.Exception

class CommunityRepositoryImpl(
    private val api: CommunityDataSource
): CommunityRepository {
    override suspend fun getCommunityTabList(): List<DomainCommunityTab> {
        Log.e("HELLO", "getCommunityTabList: 레포", )
//        try {
//            val tmp = api.getCommunityTabList().Data.map { it.toDomainCommunityTab() }
//            Log.e("HELLO", "getCommunityTabList: $tmp ", )
//        }catch (e:Exception){
//            Log.e("HELLO", ": ${e.message}", )
//        }

//        return  listOf(DomainCommunityTab(2,"dm","d","d","d",3, listOf("dd")))
        return api.getCommunityTabList().Data.map { it.toDomainCommunityTab() }
    }

}