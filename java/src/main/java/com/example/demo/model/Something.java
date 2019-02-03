package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "somethings")
public class Something {
    @Id
    @GeneratedValue(generator = "something_generator")
    @SequenceGenerator(name = "something_generator", sequenceName = "something_sequence", initialValue = 1000)
    private Long id;

    @Column(columnDefinition = "text")
    private String someText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
