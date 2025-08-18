package defpackage;

import android.util.LogPrinter;
import android.view.View;

/* loaded from: classes.dex */
public class cg6 {
    public int a;
    public int b;
    public int c;

    public cg6() {
        c();
    }

    public int a(hg6 hg6Var, View view, ote oteVar, int i, boolean z) {
        return this.a - oteVar.l(view, i, hg6Var.getLayoutMode());
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = hg6.w0;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{before=");
        sb.append(this.a);
        sb.append(", after=");
        return au1.h(sb, this.b, '}');
    }
}
