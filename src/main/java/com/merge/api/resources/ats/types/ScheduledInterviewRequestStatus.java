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

@JsonDeserialize(using = ScheduledInterviewRequestStatus.Deserializer.class)
public final class ScheduledInterviewRequestStatus {
    private final Object value;

    private final int type;

    private ScheduledInterviewRequestStatus(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((ScheduledInterviewStatusEnum) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ScheduledInterviewRequestStatus && equalTo((ScheduledInterviewRequestStatus) other);
    }

    private boolean equalTo(ScheduledInterviewRequestStatus other) {
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

    public static ScheduledInterviewRequestStatus of(ScheduledInterviewStatusEnum value) {
        return new ScheduledInterviewRequestStatus(value, 0);
    }

    public static ScheduledInterviewRequestStatus of(String value) {
        return new ScheduledInterviewRequestStatus(value, 1);
    }

    public interface Visitor<T> {
        T visit(ScheduledInterviewStatusEnum value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<ScheduledInterviewRequestStatus> {
        Deserializer() {
            super(ScheduledInterviewRequestStatus.class);
        }

        @Override
        public ScheduledInterviewRequestStatus deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ScheduledInterviewStatusEnum.class));
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