package es.usj.mastertsa.onunez.practices.domain

interface PracticeRepository {
    fun getPracticeData(): PracticeData
    fun addPracticeData(practiceData: PracticeData)
    fun deletePracticeData()
    fun updatePracticeData(practiceData: PracticeData)
}
