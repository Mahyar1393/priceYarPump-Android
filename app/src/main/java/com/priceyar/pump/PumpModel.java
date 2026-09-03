package com.priceyar.pump;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pump_models")
public class PumpModel {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String code;
    public String name;
    public double profitPercent;
}
