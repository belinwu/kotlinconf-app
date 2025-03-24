package org.jetbrains.kotlinconf

import kotlinconfapp.shared.generated.resources.Res
import kotlinconfapp.shared.generated.resources.partner_american_express
import kotlinconfapp.shared.generated.resources.partner_gitar
import kotlinconfapp.shared.generated.resources.partner_google
import kotlinconfapp.shared.generated.resources.partner_gradle
import kotlinconfapp.shared.generated.resources.partner_jvm_weekly
import kotlinconfapp.shared.generated.resources.partner_kodeinkoders
import kotlinconfapp.shared.generated.resources.partner_kotlin_foundation
import kotlinconfapp.shared.generated.resources.partner_kotlin_weekly
import kotlinconfapp.shared.generated.resources.partner_kotzilla
import kotlinconfapp.shared.generated.resources.partner_revenuecat
import kotlinconfapp.shared.generated.resources.partner_sentry
import kotlinconfapp.shared.generated.resources.partner_typealias
import kotlinconfapp.shared.generated.resources.partner_uber
import kotlinconfapp.shared.generated.resources.partner_worldline
import kotlinconfapp.shared.generated.resources.partners_bronze
import kotlinconfapp.shared.generated.resources.partners_codelab
import kotlinconfapp.shared.generated.resources.partners_digital
import kotlinconfapp.shared.generated.resources.partners_gold
import kotlinconfapp.shared.generated.resources.partners_media
import kotlinconfapp.shared.generated.resources.partners_platinum
import kotlinconfapp.shared.generated.resources.partners_silver
import kotlinconfapp.shared.generated.resources.partners_swag
import kotlinconfapp.shared.generated.resources.partners_video
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.StringResource

object TagValues {
    val categories = listOf(
        "Server-side",
        "Multiplatform",
        "Android",
        "Extensibility/Tooling",
        "Language and best practices",
        "Other",
    )
    val levels = listOf(
        "Introductory and overview",
        "Intermediate",
        "Advanced",
    )
    val formats = listOf(
        "Workshop",
        "Regular session",
        "Lightning talk",
    )
}

data class DayValues(
    val line1: String,
    val line2: String,
) {
    companion object {
        val map = mapOf<LocalDate, DayValues>(
            LocalDate(2025, 5, 21) to DayValues("Workshop", "Day"),
            LocalDate(2025, 5, 22) to DayValues("Conference", "Day 1"),
            LocalDate(2025, 5, 23) to DayValues("Conference", "Day 2"),
        )
    }
}

internal val PARTNERS: Map<StringResource, List<Partner>> = mapOf(
    Res.string.partners_platinum to listOf(
        Partner(PartnerId("revenuecat"), "RevenueCat", "", Res.drawable.partner_revenuecat),
    ),
    Res.string.partners_gold to listOf(
        Partner(PartnerId("google"), "Google", "", Res.drawable.partner_google),
    ),
    Res.string.partners_silver to listOf(
        Partner(PartnerId("gradle"), "Gradle", "", Res.drawable.partner_gradle),
        Partner(PartnerId("uber"), "Uber", "", Res.drawable.partner_uber),
        Partner(PartnerId("kotlinfoundation"), "Kotlin Foundation", "", Res.drawable.partner_kotlin_foundation),
        Partner(PartnerId("kotzilla"), "Kotlin Foundation", "", Res.drawable.partner_kotzilla),
    ),
    Res.string.partners_bronze to listOf(
        Partner(PartnerId("gitar"), "Gitar", "", Res.drawable.partner_gitar),
        Partner(PartnerId("sentry"), "Sentry", "", Res.drawable.partner_sentry),
    ),
    Res.string.partners_video to listOf(
        Partner(PartnerId("amex"), "American Express", "", Res.drawable.partner_american_express),
    ),
    Res.string.partners_codelab to listOf(
        Partner(PartnerId("google"), "Google", "", Res.drawable.partner_google),
    ),
    Res.string.partners_digital to listOf(
        Partner(PartnerId("kodein"), "Kodein Koders", "", Res.drawable.partner_kodeinkoders),
        Partner(PartnerId("typealias"), "Typealias Studios", "", Res.drawable.partner_typealias),
        Partner(PartnerId("worldline"), "World Line", "", Res.drawable.partner_worldline),
    ),
    Res.string.partners_media to listOf(
        Partner(PartnerId("jvmweekly"), "JVM Weekly", "", Res.drawable.partner_jvm_weekly),
        Partner(PartnerId("kotlinweekly"), "Kotlin Weekly", "", Res.drawable.partner_kotlin_weekly),
    ),
    Res.string.partners_swag to listOf(
        Partner(PartnerId("revenuecat"), "RevenueCat", "", Res.drawable.partner_revenuecat),
    ),
)

data class AboutBlock(
    val sessionId: SessionId?,
    val month: String,
    val day: String,
    val title1: String,
    val title2: String,
    val description: String?,
)

internal val ABOUT_CONFERENCE_BLOCKS = listOf(
    AboutBlock(
        sessionId = SessionId("857088"),
        month = "MAY",
        day = "22",
        title1 = "Opening",
        title2 = "keynote",
        description = null,
    ),
    AboutBlock(
        sessionId = SessionId("797367"),
        month = "MAY",
        day = "23",
        title1 = "Second day",
        title2 = "keynote",
        description = null,
    ),
    AboutBlock(
        sessionId = null,
        month = "MAY",
        day = "22-23",
        title1 = "Code",
        title2 = "labs",
        description = null, // TODO add real description https://github.com/JetBrains/kotlinconf-app/issues/339
    ),
    AboutBlock(
        sessionId = SessionId("62b7f3ff-2afa-4b2e-8aec-e69e536cdb6a"),
        month = "MAY",
        day = "22",
        title1 = "",
        title2 = "Party",
        description = "Have fun and mingle with the community at the biggest Kotlin party of the year!",
    ),
    AboutBlock(
        sessionId = SessionId("857092"),
        month = "MAY",
        day = "23",
        title1 = "Closing",
        title2 = "panel",
        description = "Come and seize the opportunity to ask the KotlinConf speakers your questions in person.",
    )
)
