package xyz.itihub.distributedtransaction.localmsg.conf;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(value = "xyz.itihub.distributedtransaction.localmsg.dao202", sqlSessionFactoryRef = "sqlSessionFactory202")
public class ConfigDb202 {

    @Bean("db202")
    public DataSource db202(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername("test");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://192.168.137.202:3306/xa_202");
        return dataSource;
    }

    @Bean("sqlSessionFactory202")
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("db202") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resourceResolver.getResources("mapper/db202/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "db202TransactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("db202") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
