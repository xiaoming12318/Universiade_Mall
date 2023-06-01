package cn.edu;

import cn.edu.mapping.UserMapping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UniversiadeMallApplicationTests {

    @Autowired
    private UserMapping userMapping;

    @Test
    void contextLoads() {

        System.out.println(userMapping.findAll());

    }

}
