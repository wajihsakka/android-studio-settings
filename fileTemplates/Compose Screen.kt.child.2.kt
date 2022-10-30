#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class  ${NAME}ViewModel @Inject constructor(
) : ViewModel() {

    private val _viewState = MutableStateFlow(${NAME}ViewState())
    val viewState = _viewState.asStateFlow()
    
    
    fun updateViewState(
        block: ${NAME}ViewState.() -> Unit,
    ) {
        val newValue = _viewState.value.copy()
        block(newValue)
        _viewState.value = newValue
    }

}