package com.sticker.config;

import com.sticker.dao.UserDao;
import com.sticker.dao.UserDaoImpl;
import com.sticker.service.UserService;
import com.sticker.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.sticker.service", "com.sticker.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDatasource());
    }

    @Bean
    public DataSource getDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sticker_schema?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("Sticker3101!");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

//    @Bean
//    public UserDao getUserDao(){
//        return new UserDaoImpl(getJdbcTemplate());
//    }

//    @Bean
//    public UserService getUserService(){
//        return new UserServiceImpl();
//    }
}
