package com.opensw.data.local

import android.content.SharedPreferences

class Prefs(private val prefs: SharedPreferences) {
    var jwt:String = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRFgiOjIzLCJBQ0NFU1NfVE9LRU4iOiJ0b2tlbnNlbmRkaWdoIiwiaWF0IjoxNjkzODAxNDA2LCJleHAiOjE2OTYzOTM0MDYsImlzcyI6Imlzc3VlciJ9.ydJm4v0ckRAz57gjmOAshp-_M13kLFixfUJQoxffzCU"
//        get() = prefs.getString("JWT_TOKEN", "NO_TOKEN")?:"NO_TOKEN"
//        set(jwt:String){
//            prefs.edit().putString("JWT_TOKEN",jwt).apply()
//        }
}