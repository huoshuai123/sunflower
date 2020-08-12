package com.google.samples.apps.sunflower.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.google.samples.apps.sunflower.data.Animal
import com.google.samples.apps.sunflower.data.AnimalRepository

class AnimalListViewModel constructor(animalRepository: AnimalRepository,
                                      private val savedStateHandle: SavedStateHandle): ViewModel(){

    val animals = animalRepository.getAnimals()

}