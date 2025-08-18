package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class yu6 extends wh0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public yu6(sy1 sy1Var, g0 g0Var, sfc sfcVar) {
        this.b = sy1Var;
        this.c = g0Var;
        this.d = sfcVar;
    }

    @Override // defpackage.li0, defpackage.b34
    public void d() {
        switch (this.a) {
            case 1:
                ry1 ry1Var = (ry1) this.b;
                if (ry1Var.isActive()) {
                    ry1Var.cancel(new Throwable("Cancelled with fresco pipeline"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                ((av6) this.d).b((zu6) this.b);
                break;
            default:
                ry1 ry1Var = (ry1) this.b;
                if (ry1Var.isActive()) {
                    ry1Var.resumeWith(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wh0
    public final void g(Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        Object obj = this.d;
        FileOutputStream fileOutputStream2 = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                zu6 zu6Var = (zu6) obj3;
                av6 av6Var = (av6) obj;
                if (bitmap == null) {
                    hm9.p("av6", "onNewResultImpl: bitmap is null in shareWebpImage", null);
                    av6Var.b(zu6Var);
                    return;
                }
                try {
                    String absolutePath = ((zi5) obj2).a("png").getAbsolutePath();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    av6Var.getClass();
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(absolutePath);
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        bitmap.compress(compressFormat, 100, fileOutputStream);
                        s5c.m(fileOutputStream);
                        if (zu6Var != null) {
                            av6Var.c(new vs5(zu6Var, 6, absolutePath));
                            return;
                        }
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        hm9.p("av6", "saveBitmap failure!", e);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        s5c.m(fileOutputStream2);
                        throw th;
                    }
                } catch (Exception e3) {
                    hm9.p("av6", "onNewResultImpl: failed to save webp image", e3);
                    av6Var.b(zu6Var);
                    return;
                }
            default:
                ry1 ry1Var = (ry1) obj3;
                if (!ry1Var.isActive()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else if (!((g0) obj2).h()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    ry1Var.resumeWith(null);
                    return;
                } else if (bitmap == null) {
                    ry1Var.resumeWith(null);
                    return;
                } else {
                    m26 m26Var = ((sfc) obj).c;
                    ry1Var.resumeWith(new n26(m26Var.b, m26Var.c, bitmap));
                    return;
                }
        }
    }

    public yu6(av6 av6Var, zu6 zu6Var, zi5 zi5Var) {
        this.d = av6Var;
        this.b = zu6Var;
        this.c = zi5Var;
    }
}
