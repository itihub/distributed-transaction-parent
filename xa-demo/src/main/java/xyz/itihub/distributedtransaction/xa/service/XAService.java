package xyz.itihub.distributedtransaction.xa.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.itihub.distributedtransaction.xa.dao202.mapper.XA202Mapper;
import xyz.itihub.distributedtransaction.xa.dao202.model.XA202;
import xyz.itihub.distributedtransaction.xa.dao203.mapper.XA203Mapper;
import xyz.itihub.distributedtransaction.xa.dao203.model.XA203;

@Slf4j
@RequiredArgsConstructor
@Service
public class XAService {

    private final XA202Mapper xa202Mapper;

    private final XA203Mapper xa203Mapper;

    @Transactional(transactionManager = "xaTransaction", rollbackFor = Exception.class)
    public void insertXa(){
        XA202 xa202 = new XA202();
        xa202.setId(1);
        xa202.setName("xa_202");
        xa202Mapper.insert(xa202);

        XA203 xa203 = new XA203();
        xa203.setId(1);
        xa203.setName("xa_203");
        xa203Mapper.insert(xa203);
    }
}
