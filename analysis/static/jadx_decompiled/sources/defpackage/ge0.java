package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class ge0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public ge0(BackEvent backEvent) {
        tk tkVar = tk.a;
        float fD = tkVar.d(backEvent);
        float fE = tkVar.e(backEvent);
        float fB = tkVar.b(backEvent);
        int iC = tkVar.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return au1.h(sb, this.d, '}');
    }
}
