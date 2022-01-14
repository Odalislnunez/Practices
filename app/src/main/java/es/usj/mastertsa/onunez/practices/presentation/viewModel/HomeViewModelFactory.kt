package es.usj.mastertsa.onunez.practices.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import es.usj.mastertsa.onunez.practices.data.repository.PracticeDataRepositoryImpl
import es.usj.mastertsa.onunez.practices.usecases.AddPracticeData
import es.usj.mastertsa.onunez.practices.usecases.DeletePracticeData
import es.usj.mastertsa.onunez.practices.usecases.GetPracticeData
import es.usj.mastertsa.onunez.practices.usecases.UpdatePracticeData

class HomeViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val practiceDataRepositoryImpl = PracticeDataRepositoryImpl()
        return HomeViewModel(
            getPracticeData = GetPracticeData(practiceDataRepositoryImpl),
            addPracticeData = AddPracticeData(practiceDataRepositoryImpl),
            deletePracticeData = DeletePracticeData(practiceDataRepositoryImpl),
            updatePracticeData = UpdatePracticeData(practiceDataRepositoryImpl)
        ) as T
    }
}

