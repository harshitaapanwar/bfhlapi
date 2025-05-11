package com.bfhl.bfhlapi.model;



import java.util.List;

public class ApiResponse {
    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;
    private List<String> numbers;
    private List<String> alphabets;
    private List<String> highest_lowercase_alphabet;
    private boolean is_prime_found;
    private FileInfo file_info;

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getHighest_lowercase_alphabet() {
        return highest_lowercase_alphabet;
    }

    public void setHighest_lowercase_alphabet(List<String> highest_lowercase_alphabet) {
        this.highest_lowercase_alphabet = highest_lowercase_alphabet;
    }

    public boolean isIs_prime_found() {
        return is_prime_found;
    }

    public void setIs_prime_found(boolean is_prime_found) {
        this.is_prime_found = is_prime_found;
    }

    public FileInfo getFile_info() {
        return file_info;
    }

    public void setFile_info(FileInfo file_info) {
        this.file_info = file_info;
    }


    public static class FileInfo {
        private boolean file_valid;
        private String file_mime_type;
        private long file_size_kb;

        public boolean isFile_valid() {
            return file_valid;
        }

        public void setFile_valid(boolean file_valid) {
            this.file_valid = file_valid;
        }

        public String getFile_mime_type() {
            return file_mime_type;
        }

        public void setFile_mime_type(String file_mime_type) {
            this.file_mime_type = file_mime_type;
        }

        public long getFile_size_kb() {
            return file_size_kb;
        }

        public void setFile_size_kb(long file_size_kb) {
            this.file_size_kb = file_size_kb;
        }
    }
}

