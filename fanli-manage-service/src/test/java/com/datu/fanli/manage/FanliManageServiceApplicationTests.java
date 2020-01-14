package com.datu.fanli.manage;

import com.datu.fanli.manage.dao.BaseCatalog1Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@SpringBootTest
class FanliManageServiceApplicationTests {
    @Resource
    BaseCatalog1Mapper baseCatalog1Mapper;

    @Test
    public void test() {
        System.err.println(baseCatalog1Mapper.selectByExample(null).toString());
    }
}
