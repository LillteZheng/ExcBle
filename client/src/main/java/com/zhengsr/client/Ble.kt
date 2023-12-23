package com.zhengsr.client

import android.bluetooth.BluetoothDevice
import android.bluetooth.le.ScanRecord

/**
 * @author by zhengshaorui 2023/12/21
 * describe：
 */
enum class BleError {
    CONTEXT_NULL,
    BLE_NOT_SUPPORT,
    BLUETOOTH_NOT_OPEN,
    PERMISSION_DENIED,
    GPS_NOT_OPEN,
    CONNECT_TIMEOUT,
    SCAN_FAILED

}
enum class DataError{
    NO_RESPONSE,
    WRITE_FAIL
}

enum class BleStatus{
    SERVER_CONNECTED,
    SERVER_DISCONNECTED,
    SCAN_FAILED,
    SERVER_WRITE,
}

enum class GattStatus{

    //客户端
    CONNECT_TO_SERVER,
    DISCONNECT_FROM_SERVER,
    NORMAL_DATA,
    SEND_BLUE_NAME,
    MTU_CHANGE,
    WRITE_RESPONSE,
    CONNECT_FAIL,
    LOG
}

enum class LastState {
    IDEL, 
    CONNECTING,
    CONNECTED,
    DISCONNECT
}

data class ScanBeacon(val name:String?, val rssi:Int, val device: BluetoothDevice?, val record: ScanRecord?)
