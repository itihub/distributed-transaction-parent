package xyz.itihub.distributedtransaction.xa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.itihub.distributedtransaction.xa.dao202.mapper.XA202Mapper;
import xyz.itihub.distributedtransaction.xa.dao203.mapper.XA203Mapper;
import xyz.itihub.distributedtransaction.xa.service.XAService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XaServiceTests {

    @Autowired
    private XAService xaService;

    @Test
    public void testXa(){
        xaService.insertXa();

    }
}
