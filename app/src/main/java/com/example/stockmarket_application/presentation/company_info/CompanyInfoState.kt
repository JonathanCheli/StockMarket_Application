package com.example.stockmarket_application.presentation.company_info

import com.example.stockmarket_application.domain.model.CompanyInfo
import com.example.stockmarket_application.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)