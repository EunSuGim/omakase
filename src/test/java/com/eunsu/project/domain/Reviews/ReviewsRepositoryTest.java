package com.eunsu.project.domain.Reviews;

import com.eunsu.project.Application;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ReviewsRepositoryTest {

    @Autowired
    ReviewsRepository reviewsRepository;

    @After
    public void cleanUp(){
        reviewsRepository.deleteAll();
    }

}
