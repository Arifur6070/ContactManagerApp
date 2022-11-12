package com.example.contactmanagerapp.db.entity;

public class Contact {

    //for database
    public static final String TABLE_NAME ="contacts";
    public static final String COLUMN_ID ="contact_id";
    public static final String COLUMN_EMAIL ="contact_email";
    public static final String COLUMN_NAME = "contact_name";

    private String name;
    private String email;
    private int id;


    public Contact(){

    }

    public Contact(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    // 5- SQL Query: Creating the Table
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";

}
