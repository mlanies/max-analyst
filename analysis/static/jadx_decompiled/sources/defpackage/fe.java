package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
public final class fe implements vse {
    public static final fe a = new fe();
    public static final yh9 b;

    static {
        yh9 yh9Var = new yh9(10);
        yh9Var.e(1, 10);
        yh9Var.e(2, 16);
        yh9Var.e(3, 13);
        yh9Var.e(4, 16);
        yh9Var.e(5, 0);
        yh9Var.e(6, -2);
        yh9Var.e(7, -4);
        yh9Var.e(8, -6);
        yh9Var.e(9, -5);
        yh9Var.e(10, -8);
        b = yh9Var;
    }

    @Override // defpackage.vse
    public final void a(int i) {
        yh9 yh9Var = b;
        int iB = yh9Var.b(i);
        int i2 = iB >= 0 ? yh9Var.c[iB] : -1;
        if (i2 == -1) {
            return;
        }
        try {
            Process.setThreadPriority(i2);
        } catch (Throwable unused) {
        }
    }
}
