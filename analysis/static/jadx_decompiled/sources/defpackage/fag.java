package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class fag {
    public final int a;
    public final yt8 b;
    public final boolean c = true;
    public final boolean d = true;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public final GestureDetector l;
    public boolean m;

    public fag(Context context, yt8 yt8Var) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.b = yt8Var;
        this.l = new GestureDetector(context, new q00(18, this));
    }

    public final float a() {
        if (!b()) {
            float f = this.f;
            if (f > 0.0f) {
                return this.e / f;
            }
            return 1.0f;
        }
        boolean z = this.m;
        boolean z2 = (z && this.e < this.f) || (!z && this.e > this.f);
        float fAbs = Math.abs(1 - (this.e / this.f)) * 0.5f;
        if (this.f <= this.a) {
            return 1.0f;
        }
        return z2 ? 1.0f + fAbs : 1.0f - fAbs;
    }

    public final boolean b() {
        return this.k != 0;
    }
}
