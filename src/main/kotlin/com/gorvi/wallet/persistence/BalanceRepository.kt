package com.gorvi.wallet.persistence

import com.gorvi.wallet.model.Account
import com.gorvi.wallet.model.Balance
import com.gorvi.wallet.model.Currency
import org.springframework.data.repository.CrudRepository
import java.util.*

interface BalanceRepository : CrudRepository<Balance, Long> {

    fun findByAccountEqualsAndCurrencyEquals(account: Account, currency: Currency) : Optional<Balance>
}
