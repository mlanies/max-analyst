package ru.ok.android.externcalls.sdk.utils.cancelable;

import defpackage.q64;
import defpackage.zl4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl4;", "Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "toCancelable", "(Lzl4;)Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DisposableCancelableKt {
    public static final Cancelable toCancelable(zl4 zl4Var) {
        return new q64(6, zl4Var);
    }
}
