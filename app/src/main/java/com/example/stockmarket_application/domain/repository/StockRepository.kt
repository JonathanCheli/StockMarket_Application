package com.example.stockmarket_application.domain.repository

import com.example.stockmarket_application.domain.model.CompanyInfo
import com.example.stockmarket_application.domain.model.CompanyListing
import com.example.stockmarket_application.domain.model.IntradayInfo
import com.example.stockmarket_application.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}