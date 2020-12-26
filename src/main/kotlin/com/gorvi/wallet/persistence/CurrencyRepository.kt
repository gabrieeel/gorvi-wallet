package com.gorvi.wallet.persistence

import com.gorvi.wallet.model.Currency
import com.gorvi.wallet.model.Transaction
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

interface CurrencyRepository : CrudRepository<Currency, Long> {

    fun findByCodeEquals(code: String) : Optional<Currency>

}
