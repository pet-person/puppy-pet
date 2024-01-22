package com.shop.puppyPet.domain.review.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {

    private String writer;

    @NotBlank(message = "리뷰 내용은 필수 입력 값입니다.")
    private String content;

    @NotBlank(message = "리뷰 평점은 필수 입력 값입니다.")
    private int score;


}
