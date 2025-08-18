package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class kd0 extends wh0 {
    public final /* synthetic */ uz9 a;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ g0 d;

    public kd0(ez9 ez9Var, ld0 ld0Var, Context context, g0 g0Var) {
        this.a = ez9Var;
        this.b = ld0Var;
        this.c = context;
        this.d = g0Var;
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        Drawable drawableC = this.b.c(this.c);
        uz9 uz9Var = this.a;
        ((ez9) uz9Var).d(drawableC);
        ((ez9) uz9Var).b();
        g0Var.a();
    }

    @Override // defpackage.wh0
    public final void g(Bitmap bitmap) {
        g0 g0Var = this.d;
        Context context = this.c;
        uz9 uz9Var = this.a;
        if (bitmap == null) {
            ((ez9) uz9Var).d(this.b.c(context));
            ((ez9) uz9Var).b();
            g0Var.a();
            return;
        }
        pnc pncVar = new pnc(context.getResources(), Bitmap.createBitmap(bitmap));
        pncVar.d.setAntiAlias(true);
        pncVar.invalidateSelf();
        ((ez9) uz9Var).d(pncVar);
        ((ez9) uz9Var).b();
        g0Var.a();
    }
}
