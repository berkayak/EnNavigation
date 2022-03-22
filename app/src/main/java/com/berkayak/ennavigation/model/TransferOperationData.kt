package com.berkayak.ennavigation.model

import java.io.Serializable

data class TransferOperationData(
    var transferType: TransferType = TransferType.UNDEFINED,
    var senderAccount: Account? = null,
    var receiverAccount: Account? = null
): Serializable

enum class TransferType(type: Int){
    UNDEFINED(-1),
    IBAN(1),
    ACCOUNT(2),
    KOLAS(3)
}

data class Account(
    val accountNo: String? = null,
    val IBAN: String? = null,
    val ownerName: String? = null,
    val ownerSurname: String? = null
)
