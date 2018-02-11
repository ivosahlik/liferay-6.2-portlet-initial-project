package cz.ivosahlik.service.impl;

import cz.ivosahlik.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * Intellij Idea
 * Created by ivosahlik on 11/02/2018
 */
@Service
public class HomeServiceImpl implements HomeService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;


    /**
     * This method return count all rows
     *
     * @return long count all rows
     */
    @Override
    public long getCountUsers() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject("SELECT count(*) FROM users", Long.class);
    }
}
