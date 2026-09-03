package com.priceyar.pump;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(
    tableName = "pump_items",
    foreignKeys = @ForeignKey(
        entity = PumpModel.class,
        parentColumns = "id",
        childColumns = "pumpId",
        onDelete = ForeignKey.CASCADE
    )
)
public class PumpItem {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public long pumpId;
    public Long materialId;
    public String itemName;
    public double quantity;
    public double fixedUnitPrice;
    public boolean linkedToMaterial;
}
