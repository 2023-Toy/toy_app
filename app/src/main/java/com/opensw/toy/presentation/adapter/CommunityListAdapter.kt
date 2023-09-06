package com.opensw.toy.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.opensw.domain.model.DomainCommunityTab
import com.opensw.toy.databinding.ItemCommunityBinding

class CommunityListAdapter(): RecyclerView.Adapter<CommunityListAdapter.CommunityViewHolder>() {
    private var items: List<DomainCommunityTab> = ArrayList()

    inner class CommunityViewHolder(private val binding: ItemCommunityBinding): RecyclerView.ViewHolder(binding.root){
        fun setContent(community: DomainCommunityTab){
            binding.apply {
                tvIcTitle.text = community.community_title
                tvIcContent.text = community.community_content
                tvIcDate.text = community.community_date
                tvIcCommentCnt.text = community.count_comment.toString()
                if(community.comment_path != null){
                    ivIcImg.visibility = View.VISIBLE
                    Glide.with(ivIcImg)
                        .load(community.comment_path)
                        .into(ivIcImg)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommunityListAdapter.CommunityViewHolder {
        val binding = ItemCommunityBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CommunityViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        holder.setContent(items[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newItems: List<DomainCommunityTab>){
        items = newItems
        notifyDataSetChanged()
    }
}
