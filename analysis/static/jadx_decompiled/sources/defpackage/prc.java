package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;

/* loaded from: classes2.dex */
public final class prc extends wh0 {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ ry1 b;
    public final /* synthetic */ qrc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public prc(g0 g0Var, sy1 sy1Var, qrc qrcVar, boolean z, boolean z2) {
        this.a = g0Var;
        this.b = sy1Var;
        this.c = qrcVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.li0, defpackage.b34
    public final void d() {
        ry1 ry1Var = this.b;
        if (ry1Var.isActive()) {
            ry1Var.cancel(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        this.b.resumeWith(null);
    }

    @Override // defpackage.wh0
    public final void g(Bitmap bitmap) {
        String string;
        boolean zH = this.a.h();
        ry1 ry1Var = this.b;
        if (!zH) {
            ry1Var.resumeWith(null);
            return;
        }
        if (bitmap == null) {
            ry1Var.resumeWith(null);
            return;
        }
        qrc qrcVar = this.c;
        boolean z = this.d;
        if (z) {
            StringBuilder sbL = au1.l(qrcVar.c.a.getCacheDir().getPath());
            sbL.append(qra.b);
            string = sbL.toString();
        } else {
            qrcVar.getClass();
            string = Environment.DIRECTORY_PICTURES;
        }
        ry1Var.resumeWith(qrcVar.d(new oo0(string, bitmap), this.e, z));
    }
}
