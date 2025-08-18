package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ct extends s2b {
    public final go0 a;
    public final wd6 b;

    public ct(go0 go0Var, wd6 wd6Var) {
        this.a = go0Var;
        this.b = wd6Var;
    }

    @Override // defpackage.s2b
    public final o43 c(int i, int i2, Bitmap.Config config) {
        int iC = qo0.c(i, i2, config);
        go0 go0Var = this.a;
        Bitmap bitmap = (Bitmap) go0Var.get(iC);
        if (bitmap.getAllocationByteCount() < qo0.b(config) * i * i2) {
            throw new IllegalStateException("Check failed.".toString());
        }
        bitmap.reconfigure(i, i2, config);
        return o43.p0(bitmap, go0Var, (sy4) this.b.b);
    }
}
