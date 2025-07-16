package com.cdsb.files;

public enum MessagesFS {
    DIR_NOT_EX("Directory %s does not exist"),
    DIR_NOT("%s is not a directory"),
    FIL_NOT_FOUND("No files found in the directory: %s"),
    DIR_EX("Directory %s exist"),
    FIL_EX("File %s exist"),
    FAIL_DIR("Failed to create directory: "),
    DIR_CREATED("Directory %s created"),
    FAIL_DEL("Failed to delete: %s %s"),
    DEL_OK("%s %s deleted."),
    FAIL_CREATE("Failed to created file: %s"),
    FIL_CREATE("File %s created."),
    FIL_EMPTY("Content empty, nothing to write to file: %s"),
    FAIL_WRITE("Error writing file: %s"),
    WRITING("Writing to file %s: %s"),
    FIL_NOT_EX("File does not exist: %s"),
    FAIL_READ("Error reading file: %s")
    
        String message;


    public MessagesFS(String message) {
        this.message = message;
    }
}
