package com.shop.puppyPet.domain.review.repository;

import com.shop.puppyPet.domain.review.entity.Review;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewReposirotyImpl implements ReviewRepository{


    @Override
    public Review findByMember_id(long member_id) {
        return null;
    }

    @Override
    public Review findByItem_id(long item_id) {
        return null;
    }

    @Override
    public Review save(Review review) {
        return null;
    }
}
