package com.jerry.mobile.bean

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * @author jerry
 * @date 2021/5/31
 * Description:
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class CityK(val id:String,var name:String): Parcelable