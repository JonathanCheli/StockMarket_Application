package com.example.stockmarket_application.data.mapper

import com.example.stockmarket_application.data.local.CompanyListingEntity
import com.example.stockmarket_application.data.remote.dto.CompanyInfoDto
import com.example.stockmarket_application.domain.model.CompanyInfo
import com.example.stockmarket_application.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}