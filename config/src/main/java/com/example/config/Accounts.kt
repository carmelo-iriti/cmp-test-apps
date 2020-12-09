package com.example.config

object Accounts{
    val web = Account(
        accountId = 22,
        propertyId = 7639,
        propertyName = "tcfv2.mobile.webview",
        pmId = "122058"
    )
    val native = Account(
        accountId = 22,
        propertyId = 7094,
        propertyName = "tcfv2.mobile.demo",
        pmId = "179657"
    )
    val axelSpringer = Account(
        accountId = 375,
        propertyId = 10722,
        propertyName = "android.app.t-online.de.news",
        pmId = "186166"
    )
}

data class Account(
    val accountId: Int,
    val propertyId: Int,
    val propertyName: String,
    val pmId: String
)