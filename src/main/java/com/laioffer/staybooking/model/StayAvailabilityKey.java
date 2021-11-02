package com.laioffer.staybooking.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable //for composite primary key
public class StayAvailabilityKey implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long stay_id;
    private LocalDate date; //localdate is without time zone info

    //bean 要用 default 创建, hibernate only uses the no arg constructor
    public StayAvailabilityKey() {}

    public StayAvailabilityKey(Long stay_id, LocalDate date) {
        this.stay_id = stay_id;
        this.date = date;
    }

    public Long getStay_id() {
        return stay_id;
    }

    public StayAvailabilityKey setStay_id(Long stay_id) {
        this.stay_id = stay_id;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public StayAvailabilityKey setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    //不实现equals and hashcode可能会比较地址, key will be used a lot to compare
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StayAvailabilityKey that = (StayAvailabilityKey) o;
        return stay_id.equals(that.stay_id) && date.equals(that.date);
    }

    //
    @Override
    public int hashCode() {
        return Objects.hash(stay_id, date);
    }
}