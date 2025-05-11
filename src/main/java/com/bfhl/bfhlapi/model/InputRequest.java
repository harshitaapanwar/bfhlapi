package com.bfhl.bfhlapi.model;

import java.util.List;

public class InputRequest {
    private List<String> data;
    private String file_b64;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public String getFile_b64() {
        return file_b64;
    }

    public void setFile_b64(String file_b64) {
        this.file_b64 = file_b64;
    }
}