package es.usj.mastertsa.onunez.practices.presentation.view

import es.usj.mastertsa.onunez.practices.domain.PracticeData

sealed class HomeState {
    object Loading : HomeState()
    data class Success(val practiceData: PracticeData) : HomeState()
    data class Failure(val exception: Throwable) : HomeState()
}
