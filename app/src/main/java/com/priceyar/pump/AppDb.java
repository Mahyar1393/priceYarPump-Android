package com.priceyar.pump;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
    entities = {Material.class, PumpModel.class, PumpItem.class},
    version = 1,
    exportSchema = false
)
public abstract class AppDb extends RoomDatabase {
    public abstract MaterialDao materialDao();
    public abstract PumpDao pumpDao();
}
