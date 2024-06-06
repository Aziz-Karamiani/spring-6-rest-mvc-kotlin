package com.guru.spring6restmvckotlin.services

import com.guru.spring6restmvckotlin.model.Beer
import java.util.UUID

interface BeerService {
    fun getBeerById(id: UUID): Beer
}