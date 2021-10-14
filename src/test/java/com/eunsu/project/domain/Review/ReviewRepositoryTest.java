package com.eunsu.project.domain.Review;

import com.eunsu.project.Application;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ReviewRepositoryTest {

    @Autowired
    ReviewRepository reviewsRepository;

    @After
    public void cleanUp(){
        reviewsRepository.deleteAll();
    }


}
