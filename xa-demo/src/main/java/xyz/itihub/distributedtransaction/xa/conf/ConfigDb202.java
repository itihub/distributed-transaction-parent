package xyz.itihub.distributedtransaction.xa.conf;

import com.mysql.cj.jdbc.MysqlXADataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(value = "xyz.itihub.distributedtransaction.xa.dao202", sqlSessionFactoryRef = "sqlSessionFactoryBean202")
public class ConfigDb202 {

    @Bean("db202")
    public DataSource db202(){
        MysqlXADataSource xaDataSource = new MysqlXADataSource();
        xaDataSource.setUser("test");
        xaDataSource.setPassword("123456");
        xaDataSource.setUrl("jdbc:mysql://192.168.137.202:3306/xa_202");

        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(xaDataSource);

        return atomikosDataSourceBean;
    }

    @Bean("sqlSessionFactoryBean202")
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("db202") DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resourceResolver.getResources("mapper/db202/*.xml"));
        return sqlSessionFactoryBean;
    }
}
