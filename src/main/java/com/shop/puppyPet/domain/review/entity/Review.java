package com.shop.puppyPet.domain.review.entity;

import com.shop.puppyPet.domain.item.entity.Item;
import com.shop.puppyPet.domain.member.entity.Member;
import com.shop.puppyPet.domain.review.DTO.ReviewDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="review")
@RequiredArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long review_key;

    private String writer;

    @Column(columnDefinition = "TEXT")
    private String context;

    @CreationTimestamp
    private LocalDateTime createAt;

    private int score;

//    @ManyToOne
//    private long member_key;

//    @ManyToOne
//    private long item_key;

    public static Review createReview(ReviewDTO reviewDTO, Member member, Item item){
        Review review = new Review();
        review.setContext(reviewDTO.getContent());
        review.setScore(reviewDTO.getScore());
        review.setWriter(review.writer);
//        review.setMember_key(member.getMember_key());
//        review.setItem_key(item.getItem_key());
        return review;
    }


}
