package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class ua5 implements ft7 {
    public static final ua5 b;
    public int a;

    static {
        ua5 ua5Var = new ua5();
        ua5Var.a = 5;
        b = ua5Var;
    }

    @Override // defpackage.ft7
    public final void b(String str) {
    }

    @Override // defpackage.ft7
    public final void c(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    @Override // defpackage.ft7
    public final void d(String str, String str2) {
    }

    @Override // defpackage.ft7
    public final void e(String str, String str2) {
    }

    @Override // defpackage.ft7
    public final void f(String str, String str2) {
    }

    @Override // defpackage.ft7
    public final boolean i(int i) {
        return this.a <= i;
    }

    @Override // defpackage.ft7
    public final void j(int i) {
        this.a = i;
    }

    @Override // defpackage.ft7
    public final void w(String str, String str2) {
    }

    @Override // defpackage.ft7
    public final void d(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    @Override // defpackage.ft7
    public final void e(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    @Override // defpackage.ft7
    public final void w(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        Log.getStackTraceString(th);
    }
}
