package ru.ok.android.externcalls.sdk.stereo.exception;

import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/exception/StereoRoomException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class StereoRoomException extends RuntimeException {
    public StereoRoomException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ StereoRoomException(String str, Throwable th, int i, z84 z84Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
