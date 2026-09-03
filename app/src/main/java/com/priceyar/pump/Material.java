package com.priceyar.pump;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "materials")
public class Material {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;
    public String unit;
    public double currentPrice;
}
