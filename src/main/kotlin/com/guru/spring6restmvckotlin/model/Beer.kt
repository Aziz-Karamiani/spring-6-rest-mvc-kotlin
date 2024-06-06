package com.guru.spring6restmvckotlin.model

import lombok.Builder
import lombok.Data
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

@Builder
@Data
class Beer {
    private val id: UUID? = null
    private val version: Int? = null
    private val beerName: String? = null
    private val beerStyle: BeerStyle? = null
    private val upc: String? = null
    private val quantityOnHand: Int? = null
    private val price: BigDecimal? = null
    private val createdDate: LocalDateTime? = null
    private val updateDate: LocalDateTime? = null
}

