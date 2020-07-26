package xyz.itihub.distributedtransaction.localmsg.conf;

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
@MapperScan(value = "xyz.itihub.distributedtransaction.xa.dao203", sqlSessionFactoryRef = "sqlSessionFactoryBean203")
public class ConfigDb203 {

    @Bean("db203")
    public DataSource db203(){
        MysqlXADataSource xaDataSource = new MysqlXADataSource();
        xaDataSource.setUser("test");
        xaDataSource.setPassword("123456");
        xaDataSource.setUrl("jdbc:mysql://192.168.137.203:3306/xa_203");

        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(xaDataSource);

        return atomikosDataSourceBean;
    }

    @Bean("sqlSessionFactoryBean203")
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("db203") DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resourceResolver.getResources("mapper/db203/*.xml"));
        return sqlSessionFactoryBean;
    }
}
