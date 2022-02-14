package com.a_ches.test.presenter

import io.reactivex.Scheduler


interface SchedulerProvider {
    fun ui(): Scheduler
    fun io(): Scheduler
}
