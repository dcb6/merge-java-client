package com.merge.api.resources.filestorage.folders.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FoldersRetrieveRequestExpand {
    DRIVE("drive"),

    PARENT_FOLDER("parent_folder"),

    PARENT_FOLDER_DRIVE("parent_folder,drive"),

    PERMISSIONS("permissions"),

    PERMISSIONS_DRIVE("permissions,drive"),

    PERMISSIONS_PARENT_FOLDER("permissions,parent_folder"),

    PERMISSIONS_PARENT_FOLDER_DRIVE("permissions,parent_folder,drive");

    private final String value;

    FoldersRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}