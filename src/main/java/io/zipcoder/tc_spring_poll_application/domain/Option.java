package io.zipcoder.tc_spring_poll_application.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Option {
    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;
}
