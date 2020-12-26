package com.gorvi.wallet.persistence

import com.gorvi.wallet.model.Transaction
import org.springframework.data.repository.CrudRepository

interface TransactionRepository : CrudRepository<Transaction, Long> {

    fun findAllByOrderByCreatedDesc() : List<Transaction>

    fun findAllByBalanceIdOrderByCreatedDesc(balanceId: Long) : List<Transaction>

}
