package co.com.sofka.domain.picking.values;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ciudad implements ValueObject<String> {

    private final String value;

    public Ciudad(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad that = (Ciudad) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }



}