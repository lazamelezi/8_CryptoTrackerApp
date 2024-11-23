package com.lazamelezi.cryptotracker.crypto.presentation.coin_list

import com.lazamelezi.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}