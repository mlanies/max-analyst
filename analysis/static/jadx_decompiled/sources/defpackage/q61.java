package defpackage;

/* loaded from: classes.dex */
public final class q61 implements a4c {
    @Override // defpackage.a4c
    public final void log(String str, String str2) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallsSdk", rh4.k("[", str, "] ", str2), null);
        }
    }

    @Override // defpackage.a4c
    public final void logException(String str, String str2, Throwable th) {
        hm9.r("CallsSdk", th, "[%s] %s", str, str2);
    }
}
