package com.garmin.garminkaptain.ui

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.garmin.garminkaptain.R
import com.garmin.garminkaptain.data.Review
import com.garmin.garminkaptain.data.poiList

class PoiReviewListFragment: Fragment(R.layout.poi_review_list_fragment) {

    private val args: PoiReviewListFragmentArgs by navArgs()
    private val argv: Long  = 12975
    private lateinit var reviews: List<Review>

    inner class PoiListReviewItemViewHolder(reviewItemView: View) : RecyclerView.ViewHolder(reviewItemView) {
        private val userNameView = reviewItemView.findViewById<TextView>(R.id.poi_review_user_name)
        private val ratingView = reviewItemView.findViewById<RatingBar>(R.id.poi_review_rating)
        private val textView = reviewItemView.findViewById<TextView>(R.id.poi_review_text)

        fun bind(review: Review) {
            userNameView.text = review.userName
            ratingView.rating = review.rating.toFloat()
            textView.text = review.text
        }
    }

    inner class PoiReviewListAdapter : RecyclerView.Adapter<PoiReviewListFragment.PoiListReviewItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiReviewListFragment.PoiListReviewItemViewHolder {
            return PoiListReviewItemViewHolder(
                layoutInflater.inflate(R.layout.poi_review_item, parent, false)
            )
        }

        override fun onBindViewHolder(holder: PoiReviewListFragment.PoiListReviewItemViewHolder, position: Int) {
            reviews.getOrNull(position)?.let {
                holder.bind(it)
            }
        }

        override fun getItemCount(): Int = reviews.size
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<RecyclerView>(R.id.poi_review_list).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = PoiReviewListAdapter()
        }

        reviews = poiList.find { it.id == args.id }!!.reviewsList
    }
}