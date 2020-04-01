package dal.cloud.tourism;


import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.url("jdbc:mysql://cloud.ceszoqvptmou.us-east-1.rds.amazonaws.com/cloud_tourism");
        dataSourceBuilder.username("group5");
        dataSourceBuilder.password("Dalgroup5");
        return dataSourceBuilder.build();
    }
}
