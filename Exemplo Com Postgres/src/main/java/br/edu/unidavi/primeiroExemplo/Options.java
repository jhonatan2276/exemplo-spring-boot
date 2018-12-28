package br.edu.unidavi.primeiroExemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Options {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment environment;

    @Value("${app.config.property.string}")
    private String stringValue;

    @Value("${app.config.property.long}")
    private Long longValue;

    @Value("${app.config.property.boolean}")
    private Boolean booleanValue;

    @Value("${app.config.property.random}")
    private Long randomValue;

    //Pode ser desse modo
    @Value("$(app.config.property.email)")
    private String email;

    public String getEmail() {
        return environment.getProperty("email");
    };

    @PostConstruct
    public void init() {
        logger.debug("app.config.property.string = {}", stringValue);
        logger.debug("app.config.property.long = {}", longValue);
        logger.debug("app.config.property.boolean = {}", booleanValue);
        logger.debug("app.config.property.random = {}", randomValue);
        logger.debug("app.config.property.email = {}", getEmail());
        logger.debug("app.config.property.environment = {}", environment.getProperty("app.config.property.environment"));
    }
}
