package com.guru.spring6restmvckotlin.controllers

import com.guru.spring6restmvckotlin.model.Beer
import com.guru.spring6restmvckotlin.services.BeerService
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class BeerController(private val beerService: BeerService) {

    fun getBeerById(id: UUID): Beer {
        return beerService.getBeerById(id)
    }
}