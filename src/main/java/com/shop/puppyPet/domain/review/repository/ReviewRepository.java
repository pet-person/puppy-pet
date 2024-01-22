package com.shop.puppyPet.domain.review.repository;

import com.shop.puppyPet.domain.review.entity.Review;
import org.springframework.stereotype.Repository;


public interface ReviewRepository {

    Review findByMember_id(long member_id);

    Review findByItem_id(long item_id);

    Review save(Review review);

}
