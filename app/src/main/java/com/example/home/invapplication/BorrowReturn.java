package com.example.home.invapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by phrompongkhagtes on 5/9/2017 AD.
 */

public class BorrowReturn {
    @SerializedName("borrow_id")
    public String borrow_id;

    @SerializedName("borrow_code")
    public String borrow_code;

    @SerializedName("prob_name")
    public String prob_name;

    @SerializedName("imem_first_name")
    public String imem_first_name;
}
