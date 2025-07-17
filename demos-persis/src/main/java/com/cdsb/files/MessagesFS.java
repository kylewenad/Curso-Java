package com.cdsb.files;

public enum MessagesFS {
    
    DIR_CREATED("DIR", "Directory %s created"),
    DIR_EX("DIR", "Directory %s exist"),
    FIL_CREATE("CREATE", "File %s created."),
    FIL_EX("FIL","File %s exist"),
    FIL_EMPTY("EMPTY","Content empty, nothing to write to file: %s"),
    DEL_OK("DEL", "%s %s deleted."),
    WRITING("WRITE","Writing to file %s: %s"),
    
    DIR_NOT_EX("NOT", "Directory %s does not exist"),
    DIR_IS_NOT("NOT","%s is not a directory"),
    FIL_NOT_EX("NOT", "File does not exist: %s"),
    FIL_NOT_FOUND("NOT", "No files found in the directory: %s"),
    
    FAIL_DIR_CREATE("FAIL", "Failed to create directory: "),
    FAIL_FIL_CREATE("FAIL","Failed to created file: %s"),
    FAIL_DEL("FAIL", "Failed to delete: %s %s"),
    ERROR_WRITE("ERROR", "Error writing file: %s"),
    ERROR_READ("ERROR", "Error reading file: %s"),
    ERROR_LIST("ERROR", "Error listing from: %s");
        
    String code;
    String message;


    private MessagesFS(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
