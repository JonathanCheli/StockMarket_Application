package com.example.stockmarket_application.di

import com.example.stockmarket_application.data.cvs.CSVParser
import com.example.stockmarket_application.data.cvs.CompanyListingsParser
import com.example.stockmarket_application.data.cvs.IntradayInfoParser
import com.example.stockmarket_application.data.repository.StockRepositoryImpl
import com.example.stockmarket_application.domain.model.CompanyListing
import com.example.stockmarket_application.domain.model.IntradayInfo
import com.example.stockmarket_application.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}