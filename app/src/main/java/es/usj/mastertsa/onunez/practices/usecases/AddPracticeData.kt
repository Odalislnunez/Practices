package es.usj.mastertsa.onunez.practices.usecases

import es.usj.mastertsa.onunez.practices.domain.PracticeData
import es.usj.mastertsa.onunez.practices.domain.PracticeRepository

class AddPracticeData(private val practiceRepository: PracticeRepository) {
    fun addPracticeData(practiceData: PracticeData) {
        return practiceRepository.addPracticeData(practiceData)
    }
}