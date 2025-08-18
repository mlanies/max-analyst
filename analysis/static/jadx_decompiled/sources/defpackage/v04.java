package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class v04 implements yme {
    @Override // defpackage.yme
    public final ThreadFactory a(String str) {
        return new t04("1me-".concat(str));
    }
}
