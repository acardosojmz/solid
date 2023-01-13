package com.example.solid.exercise_2

import android.content.SharedPreferences.Editor
import java.time.LocalDate
import java.time.Period


sealed class ResourceType: Resource {
    data class BookPDF(override val code: String, override val title: String,
                       override val author: Author, override val area: String,
                       override val isMembershipRequired: Boolean,
                       val totalPage: Int,
                       val topics: List<Topic>,
                        ):  ResourceType()
    data class AudioBook(override val code: String, override val title: String,
                         override val author: Author, override val area: String,
                         override val isMembershipRequired: Boolean,
                         val durationInSeconds: Long, val topics: List<Topic>,
                        ) : ResourceType()
    data class Podcast(override val code: String, override val title: String,
                       override val author: Author, override val area: String,
                       override val isMembershipRequired: Boolean,
                       val episodes:List<Episode>,
                        ) : ResourceType()
    data class Webcast(override val code: String, override val title: String,
                       override val author: Author, override val area: String,
                       override val isMembershipRequired: Boolean,
                       val episodes:List<Episode>,
                        ) : ResourceType()
    data class Magazine(override val code: String, override val title: String,
                        override val author: Author, override val area: String,
                        override val isMembershipRequired: Boolean,
                        val numeration:Numeration,
                        val dateOfPublication: LocalDate,
                        val placeOfPublication: LocalDate,
                        val editor: Publisher,
                        val periodicity: String,
                        val topic: Topic,
                        val articles: List<Article>
                    ) : ResourceType()
}
