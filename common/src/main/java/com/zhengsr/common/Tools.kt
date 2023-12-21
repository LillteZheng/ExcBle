package com.zhengsr.common

import android.bluetooth.BluetoothDevice
import android.bluetooth.le.ScanRecord
import java.util.UUID





val UUID_SERVICE = UUID.fromString("10000000-0000-0000-0000-000000000000")
val UUID_READ_NOTIFY = UUID.fromString("11000000-0000-0000-0000-000000000000")
val UUID_WRITE = UUID.fromString("12000000-0000-0000-0000-000000000000")
val UUID_READ_DESCRIBE = UUID.fromString("12100000-0000-0000-0000-000000000000")
val UUID_WRITE_DESCRIBE = UUID.fromString("12200000-0000-0000-0000-000000000000")
val DATA_FLAG = 0X78.toByte()
val NAME_TYPE = 0X00.toByte()
val DATA_TYPE = 0X01.toByte()
val MTU_TYPE = 0X02.toByte()
val FORMAT_LEN = 4


