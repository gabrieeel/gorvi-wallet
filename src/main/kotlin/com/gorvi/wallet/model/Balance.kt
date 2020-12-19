package com.gorvi.wallet.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
class Balance {
    @Id
    var id: Long = 0
    @Column(name = "current_balance")
    var currentBalance: BigDecimal = BigDecimal.ZERO
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    var account: Account = Account()
    @OneToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    var currency: Currency = Currency()
}
