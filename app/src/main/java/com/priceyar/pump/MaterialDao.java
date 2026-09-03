package com.priceyar.pump;
import androidx.room.*;
import java.util.List;

@Dao
public interface MaterialDao {
    @Query("SELECT * FROM materials ORDER BY id")
    List<Material> getAll();

    @Insert
    long insert(Material m);

    @Update
    void update(Material m);

    @Delete
    void delete(Material m);
}
