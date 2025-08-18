package com.facebook.common.time;

import defpackage.ic9;
import defpackage.pm4;

@pm4
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements ic9 {

    @pm4
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @pm4
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // defpackage.ic9, defpackage.hc9
    @pm4
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // defpackage.ic9, defpackage.hc9
    @pm4
    public long nowNanos() {
        return System.nanoTime();
    }
}
