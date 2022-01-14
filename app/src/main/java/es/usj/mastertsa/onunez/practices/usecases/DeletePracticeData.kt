package es.usj.mastertsa.onunez.practices.usecases

import es.usj.mastertsa.onunez.practices.domain.PracticeRepository

class DeletePracticeData(private val practiceRepository: PracticeRepository) {
    fun deletePracticeData() {
        return practiceRepository.deletePracticeData()
    }
}