package defpackage;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class i6g extends j6g {
    public final WindowInsetsAnimation e;

    public i6g(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.j6g
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.j6g
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.j6g
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.j6g
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
