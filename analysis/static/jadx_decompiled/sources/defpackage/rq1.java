package defpackage;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* loaded from: classes.dex */
public final class rq1 implements Logger {
    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2) {
        hm9.n(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2, Throwable th) {
        hm9.p(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2) {
        hm9.G(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2) {
        hm9.h0(str, str2, new Object[0]);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2) {
        hm9.m0(str, str2, new Object[0]);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2, Throwable th) {
        hm9.l(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2) {
        hm9.p(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2, Throwable th) {
        hm9.G(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2, Throwable th) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null) {
            us7 us7Var = us7.o;
            if (str2 == null) {
                str2 = "";
            }
            ir6Var.a(us7Var, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2, Throwable th) {
        hm9.l0(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, Throwable th) {
        hm9.m0(str, th.getMessage(), new Object[0]);
    }
}
