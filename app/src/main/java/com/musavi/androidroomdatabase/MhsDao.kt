package com.musavi.androidroomdatabase

import androidx.room.*

@Dao interface MhsDao{
    @Query("SELECT * FROM mahasiswa")
    fun getAll(): List<MhsEntity>

    @Query("SELECT * FROM mahasiswa WHERE nama LIKE :nama")
    fun findByName(nama: String): MhsEntity

    @Insert
    fun insertAll(vararg mhsData: MhsEntity)

    @Delete
    fun deleteData(mhs: MhsEntity)

    @Update
    fun updateData(vararg  mhsData: MhsEntity)
}