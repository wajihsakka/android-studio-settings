#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ${NAME}PreviewProvider : PreviewParameterProvider<${NAME}ViewState> {
    override val values: Sequence<${NAME}ViewState> = sequenceOf(
        ${NAME}ViewState(),
    )
}