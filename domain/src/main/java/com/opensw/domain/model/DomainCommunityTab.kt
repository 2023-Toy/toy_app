package com.opensw.domain.model
data class DomainCommunityTab (
    val community_id: Int,
    val community_title: String,
    val community_content: String,
    val community_date: String,
    val comment_path: String?,
    val count_comment:Int,
    val tag_name: List<String>
)