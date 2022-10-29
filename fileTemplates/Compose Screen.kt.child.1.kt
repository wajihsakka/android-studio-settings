#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

data class ${NAME}ViewState (
    var isLoading: Boolean = true,
    var error: String? = null,
)
