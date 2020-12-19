package com.gorvi.wallet.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Account {
    @Id
    var id: Long = 0
    var name: String = ""
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    var balances: List<Balance> = ArrayList<Balance>()
}
