package com.gorvi.wallet.persistence

import com.gorvi.wallet.model.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, Long> {
}
