package com.example.php_connection;

public class PersonalData {
    private String member_num;
    private String member_id;
    private String member_name;
    private String member_status;
    private String member_photo;


    public String getMember_num() {
        return member_num;
    }

    public String getMember_id() {
        return member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public String getMember_status() { return member_status; }

    public String getMember_photo() {
        return member_photo;
    }


    public void setMember_num(String member_num) {
        this.member_num = member_num;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public void setMember_status(String member_status) {
        this.member_status = member_status;
    }

    public void setMember_photo(String member_photo) {
        this.member_photo = member_photo;
    }
}


