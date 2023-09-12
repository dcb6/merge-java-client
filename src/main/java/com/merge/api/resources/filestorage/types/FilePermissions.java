package com.merge.api.resources.filestorage.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.merge.api.core.ObjectMappers;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(using = FilePermissions.Deserializer.class)
public final class FilePermissions {
    private final Object value;

    private final int type;

    private FilePermissions(Object value, int type) {
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
            return visitor.visit((JsonNode) this.value);
        } else if (this.type == 2) {
            return visitor.visit((List<FilePermissionsItem>) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FilePermissions && equalTo((FilePermissions) other);
    }

    private boolean equalTo(FilePermissions other) {
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

    public static FilePermissions of(String value) {
        return new FilePermissions(value, 0);
    }

    public static FilePermissions of(JsonNode value) {
        return new FilePermissions(value, 1);
    }

    public static FilePermissions of(List<FilePermissionsItem> value) {
        return new FilePermissions(value, 2);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(JsonNode value);

        T visit(List<FilePermissionsItem> value);
    }

    static final class Deserializer extends StdDeserializer<FilePermissions> {
        Deserializer() {
            super(FilePermissions.class);
        }

        @Override
        public FilePermissions deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, JsonNode.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, new TypeReference<List<FilePermissionsItem>>() {}));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
