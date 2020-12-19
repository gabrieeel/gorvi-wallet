package com.gorvi.wallet.model

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var created: LocalDateTime = LocalDateTime.now()
    @OneToOne
    @JoinColumn(name = "balance_id", referencedColumnName = "id")
    var balance: Balance = Balance()
    @Column(name = "amount_in")
    var amountIn: BigDecimal = BigDecimal.ZERO
    @Column(name = "amount_out")
    var amountOut: BigDecimal = BigDecimal.ZERO
    var fee: BigDecimal = BigDecimal.ZERO
    var type: Int = 0
    @Column(name = "reference_id")
    var referenceId: String? = null
    @Column(name = "origin_transaction_id")
    var originTransactionId: Long? = null
    var notes: String? = null
    var exchangeRate: BigDecimal? = null
}
