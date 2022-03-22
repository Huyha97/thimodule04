package com.example.thi_th.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.concurrent.CountDownLatch;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "name not be null")
    private String name;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "Area must be greater than 0")
    private String area;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "population must be greater than 0")
    private String population;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "gdp must be greater than 0")
    private String gdp;

    private String description;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
