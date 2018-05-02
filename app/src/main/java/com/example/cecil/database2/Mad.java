package com.example.cecil.database2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by cecil on 16-04-2018.
 * Tabel over de forskellige variabler som skal udfyldes under oprettelse af en bruger
 */

@Entity(tableName= "madkasse")
public class Mad
{
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "HF_12")
    private String HF12;

    @ColumnInfo (name = "HF_3")
    private String HF3;

    @ColumnInfo(name = "HF_4")
    private String HF4;

    @ColumnInfo (name = "fedt")
    private String fedt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHF12() {
        return HF12;
    }

    public void setHF12(String HF12) {
        this.HF12 = HF12;
    }

    public String getHF3() {
        return HF3;
    }

    public void setHF3(String HF3) {
        this.HF3 = HF3;
    }

    public String getHF4() {
        return HF4;
    }

    public void setHF4(String HF4) {
        this.HF4 = HF4;
    }

    public String getFedt() {
        return fedt;
    }

    public void setFedt(String fedt) {
        this.fedt = fedt;
    }
}
