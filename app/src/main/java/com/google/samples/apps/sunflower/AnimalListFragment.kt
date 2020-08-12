package com.google.samples.apps.sunflower

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.samples.apps.sunflower.utilities.InjectorUtils
import com.google.samples.apps.sunflower.viewmodels.AnimalListViewModel

class AnimalListFragment: Fragment(){

    private val viewModel: AnimalListViewModel by viewModels{
        InjectorUtils.provideAnimalListViewModelFactory(this)
    }
}