package com.shop.puppyPet.web.review;

import com.shop.puppyPet.domain.review.DTO.ReviewDTO;
import com.shop.puppyPet.domain.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Transactional
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/new")
    public String reviewForm(Model model){
        model.addAttribute("reviewDTO", new ReviewDTO());
        return "review/reviewForm";
    }

}
