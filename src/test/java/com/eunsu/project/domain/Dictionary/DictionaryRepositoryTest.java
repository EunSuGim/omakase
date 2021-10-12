package com.eunsu.project.domain.Dictionary;

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
public class DictionaryRepositoryTest {

    @Autowired
    DictionaryRepository dictionaryRepository;

    @After
    public void cleanUp(){
        dictionaryRepository.deleteAll();
    }

}
