package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.merge.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = EmploymentPayCurrency.Deserializer.class)
public final class EmploymentPayCurrency {
    private final Object value;

    private final int type;

    private EmploymentPayCurrency(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((PayCurrencyEnum) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmploymentPayCurrency && equalTo((EmploymentPayCurrency) other);
    }

    private boolean equalTo(EmploymentPayCurrency other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static EmploymentPayCurrency of(PayCurrencyEnum value) {
        return new EmploymentPayCurrency(value, 0);
    }

    public static EmploymentPayCurrency of(String value) {
        return new EmploymentPayCurrency(value, 1);
    }

    public interface Visitor<T> {
        T visit(PayCurrencyEnum value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<EmploymentPayCurrency> {
        Deserializer() {
            super(EmploymentPayCurrency.class);
        }

        @Override
        public EmploymentPayCurrency deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, PayCurrencyEnum.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
