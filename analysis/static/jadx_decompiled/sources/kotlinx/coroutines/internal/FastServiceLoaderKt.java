package kotlinx.coroutines.internal;

import defpackage.njc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object njcVar;
        try {
            njcVar = Class.forName("android.os.Build");
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        boolean z = njcVar instanceof njc;
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
