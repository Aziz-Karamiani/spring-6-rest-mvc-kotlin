package com.guru.spring6restmvckotlin.services

import com.guru.spring6restmvckotlin.model.Beer
import com.guru.spring6restmvckotlin.model.BeerStyle
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

@Service
class BeerServiceImpl : BeerService {
    override fun getBeerById(id: UUID): Beer {
        return Beer(
            id = id,
            version = 1,
            beerName = "Galaxy Cat",
            beerStyle = BeerStyle.PALE_ALE,
            upc = "12356",
            price = BigDecimal("12.99"),
            quantityOnHand = 122,
            createdDate = LocalDateTime.now(),
            updateDate = LocalDateTime.now()
        )
    }
}