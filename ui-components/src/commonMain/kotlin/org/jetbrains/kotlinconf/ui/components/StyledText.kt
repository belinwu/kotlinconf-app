package org.jetbrains.kotlinconf.ui.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import org.jetbrains.kotlinconf.ui.theme.KotlinConfTheme

/**
 * A simple text component that uses defaults from [KotlinConfTheme],
 * and accepts a simple [color] parameter to set the text color.
 *
 * TODO rename to Text once we don't depend on Material in the code consuming this component
 */
@Composable
fun StyledText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = KotlinConfTheme.colors.primaryText,
    style: TextStyle = KotlinConfTheme.typography.text1,
    maxLines: Int = Int.MAX_VALUE,
    selectable: Boolean = false,
) {
    StyledText(
        text = AnnotatedString(text),
        modifier = modifier,
        color = color,
        style = style,
        maxLines = maxLines,
        selectable = selectable,
    )
}

@Composable
fun StyledText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = KotlinConfTheme.colors.primaryText,
    style: TextStyle = KotlinConfTheme.typography.text1,
    maxLines: Int = Int.MAX_VALUE,
    selectable: Boolean = false,
) {
    val content = @Composable{
        BasicText(
            text = text,
            modifier = modifier,
            style = style,
            color = { color },
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis,
        )
    }

    if (selectable) {
        SelectionContainer { content() }
    } else {
        content()
    }
}

