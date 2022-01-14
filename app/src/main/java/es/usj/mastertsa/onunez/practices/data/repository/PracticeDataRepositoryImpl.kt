package es.usj.mastertsa.onunez.practices.data.repository

import es.usj.mastertsa.onunez.practices.domain.PracticeData
import es.usj.mastertsa.onunez.practices.domain.PracticeRepository

class PracticeDataRepositoryImpl : PracticeRepository {
    override fun getPracticeData(): PracticeData {
        return PracticeData("Práctica 03")
    }
    override fun addPracticeData(practiceData: PracticeData) {
    }
    override fun deletePracticeData() {
    }
    override fun updatePracticeData(practiceData: PracticeData) {
    }
}
