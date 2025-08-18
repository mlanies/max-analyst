package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class qfc extends wh0 {
    public final /* synthetic */ l28 a;

    public qfc(j28 j28Var) {
        this.a = j28Var;
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        l28 l28Var = this.a;
        if (((j28) l28Var).h()) {
            return;
        }
        ((j28) l28Var).onError(g0Var.c());
    }

    @Override // defpackage.wh0
    public final void g(Bitmap bitmap) {
        l28 l28Var = this.a;
        if (((j28) l28Var).h()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap == null) {
            ((j28) l28Var).b();
        } else {
            ((j28) l28Var).a(bitmap);
        }
    }
}
