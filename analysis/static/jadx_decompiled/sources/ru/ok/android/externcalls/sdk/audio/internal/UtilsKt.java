package ru.ok.android.externcalls.sdk.audio.internal;

import android.os.Looper;
import defpackage.tpa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Le5f;", "checkIsOnMainThread", "()V", "calls-audiomanager_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final void checkIsOnMainThread() {
        if (!tpa.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Not on main thread!");
        }
    }
}
