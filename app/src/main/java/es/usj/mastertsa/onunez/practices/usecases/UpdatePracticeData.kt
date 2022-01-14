package es.usj.mastertsa.onunez.practices.usecases

import es.usj.mastertsa.onunez.practices.domain.PracticeData
import es.usj.mastertsa.onunez.practices.domain.PracticeRepository

class UpdatePracticeData(private val practiceRepository: PracticeRepository) {
    fun updatePracticeData(practiceData: PracticeData) {
        return practiceRepository.updatePracticeData(practiceData)
    }
}