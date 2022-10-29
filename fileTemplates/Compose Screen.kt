#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.PreviewParameter

@Composable
fun ${NAME}Screen(
    viewModel: ${NAME}ViewModel
) {

    val viewState by viewModel.viewState.collectAsState()

    Content(
        viewState = viewState,
        updateViewState = viewModel::updateViewState,
    )
    
}


@Composable
fun Content(
    viewState: ${NAME}ViewState,
    updateViewState: (${NAME}ViewState.() -> Unit) -> Unit,
) {


}


@Preview(
    showSystemUi = true,
    showBackground = true,
)
@Composable
private fun ${NAME}Preview(
    @PreviewParameter(provider = ${NAME}PreviewProvider::class) viewState: ${NAME}ViewState,
) {

    Content(
        viewState = viewState,
        updateViewState = {},
    )
        
}