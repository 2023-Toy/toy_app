package com.opensw.data.remote.dto

import com.opensw.domain.model.DomainCommunityTab

data class CommunityTabDTO(
    val Message: String,
    val Status: Int,
    val Data: List<CommunityTab>
)

data class CommunityTab(
    val community_content: String,
    val community_date: String,
    val community_id: Int,
    val community_path: String?,
    val community_title: String,
    val count_comment: Int,
    val tag_name: List<String>
){
    fun toDomainCommunityTab():DomainCommunityTab{
        return DomainCommunityTab(community_id,community_title,community_content,community_title,community_path,count_comment,tag_name)
    }
}