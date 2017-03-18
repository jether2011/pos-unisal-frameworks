package br.com.unisal.frameworks.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
//@PropertySource("classpath:application-*.properties")
public class ApplicationDataSource {
    
    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(environment.getRequiredProperty("spring.datasource.driverClassName"));
        dataSource.setJdbcUrl(environment.getRequiredProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
        dataSource.setMinConnectionsPerPartition(Integer.valueOf(environment.getRequiredProperty("spring.datasource.minConnections")));
        dataSource.setMaxConnectionsPerPartition(Integer.valueOf(environment.getRequiredProperty("spring.datasource.maxConnections")));
        return dataSource;
    }
}