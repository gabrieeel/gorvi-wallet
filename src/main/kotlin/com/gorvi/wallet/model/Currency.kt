package com.gorvi.wallet.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Currency {
    @Id
    var id: Long = 0
    var code: String = ""
}
