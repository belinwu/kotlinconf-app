package org.jetbrains.kotlinconf.ui25

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.kotlinconf.ui25.theme.KotlinConfTheme

@Composable
@Preview
fun ThemePreview() {
    KotlinConfTheme {
        Column(Modifier.background(Color.White)) {
            BasicText("Header 1", style = KotlinConfTheme.typography.h1)
            BasicText("Header 2", style = KotlinConfTheme.typography.h2)
            BasicText("Header 3", style = KotlinConfTheme.typography.h3)
            BasicText("Header 4", style = KotlinConfTheme.typography.h4)

            Spacer(Modifier.size(20.dp))

            BasicText("Hard", style = TextStyle().merge(color = KotlinConfTheme.colors.textIconHard))
            BasicText("Average", style = TextStyle().merge(color = KotlinConfTheme.colors.textIconAverage))
            BasicText("Pale", style = TextStyle().merge(color = KotlinConfTheme.colors.textIconPale))
        }
    }
}
