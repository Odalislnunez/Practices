package es.usj.mastertsa.onunez.practices.usecases

import es.usj.mastertsa.onunez.practices.domain.PracticeData
import es.usj.mastertsa.onunez.practices.domain.PracticeRepository

class GetPracticeData(private val practiceRepository: PracticeRepository) {
    fun getPracticeData(): PracticeData {
        return practiceRepository.getPracticeData()
    }
}