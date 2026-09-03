package com.priceyar.pump;
import androidx.room.*;
import java.util.List;

@Dao
public interface PumpDao {
    @Query("SELECT * FROM pump_models ORDER BY id")
    List<PumpModel> getAll();

    @Insert
    long insert(PumpModel p);

    @Update
    void update(PumpModel p);

    @Delete
    void delete(PumpModel p);

    @Query("SELECT * FROM pump_items WHERE pumpId=:pumpId ORDER BY id")
    List<PumpItem> getItems(long pumpId);

    @Insert
    long insertItem(PumpItem item);

    @Update
    void updateItem(PumpItem item);

    @Delete
    void deleteItem(PumpItem item);

    @Query("DELETE FROM pump_items WHERE pumpId=:pumpId")
    void deleteItems(long pumpId);
}
