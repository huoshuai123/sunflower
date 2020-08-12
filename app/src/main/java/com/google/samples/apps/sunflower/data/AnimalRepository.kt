package com.google.samples.apps.sunflower.data


class AnimalRepository private constructor(private val animalDao: AnimalDao){

    fun getAnimals() = animalDao.getAnimals()

    companion object{

        @Volatile private var instance: AnimalRepository? = null;

        fun getInstance(animalDao: AnimalDao) =
            instance ?: synchronized(this){ instance?: AnimalRepository(animalDao).also{ instance = it }}
    }
}