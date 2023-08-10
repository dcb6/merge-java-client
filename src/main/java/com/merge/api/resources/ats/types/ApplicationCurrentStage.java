package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.merge.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = ApplicationCurrentStage.Deserializer.class)
public final class ApplicationCurrentStage {
    private final Object value;

    private final int type;

    private ApplicationCurrentStage(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((String) this.value);
        } else if (this.type == 1) {
            return visitor.visit((JobInterviewStage) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplicationCurrentStage && equalTo((ApplicationCurrentStage) other);
    }

    private boolean equalTo(ApplicationCurrentStage other) {
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

    public static ApplicationCurrentStage of(String value) {
        return new ApplicationCurrentStage(value, 0);
    }

    public static ApplicationCurrentStage of(JobInterviewStage value) {
        return new ApplicationCurrentStage(value, 1);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(JobInterviewStage value);
    }

    static final class Deserializer extends StdDeserializer<ApplicationCurrentStage> {
        Deserializer() {
            super(ApplicationCurrentStage.class);
        }

        @Override
        public ApplicationCurrentStage deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, JobInterviewStage.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
