package defpackage;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vje implements h06 {
    public final ArrayList X;
    public final o9g b;
    public jc6 c;
    public yhc o;
    public final ArrayDeque a = new ArrayDeque();
    public boolean Y = false;

    public vje(o9g o9gVar) {
        kq0.e();
        this.b = o9gVar;
        this.X = new ArrayList();
    }

    @Override // defpackage.h06
    public final void a(ov6 ov6Var) {
        ju0.D().execute(new uje(this, 1));
    }

    public final void b() {
        kq0.e();
        ImageCaptureException imageCaptureException = new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fc0 fc0Var = (fc0) it.next();
            fc0Var.getClass();
            fc0Var.b.execute(new flc(fc0Var, 26, imageCaptureException));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.X).iterator();
        while (it2.hasNext()) {
            yhc yhcVar = (yhc) it2.next();
            yhcVar.getClass();
            kq0.e();
            if (!yhcVar.d.b.isDone()) {
                kq0.e();
                yhcVar.g = true;
                bm7 bm7Var = yhcVar.i;
                Objects.requireNonNull(bm7Var);
                bm7Var.cancel(true);
                yhcVar.e.d(imageCaptureException);
                yhcVar.f.b(null);
                kq0.e();
                fc0 fc0Var2 = yhcVar.a;
                fc0Var2.getClass();
                fc0Var2.b.execute(new flc(fc0Var2, 26, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        fc0 fc0Var;
        int i = 0;
        kq0.e();
        if (this.o == null && !this.Y) {
            jc6 jc6Var = this.c;
            jc6Var.getClass();
            kq0.e();
            if (((l84) jc6Var.c).A() == 0 || (fc0Var = (fc0) this.a.poll()) == null) {
                return;
            }
            yhc yhcVar = new yhc(fc0Var, this);
            c54.p(null, !(this.o != null));
            this.o = yhcVar;
            kq0.e();
            yhcVar.c.b.d(new uje(this, i), ju0.k());
            this.X.add(yhcVar);
            kq0.e();
            yhcVar.d.b.d(new flc(this, 25, yhcVar), ju0.k());
            jc6 jc6Var2 = this.c;
            kq0.e();
            oq1 oq1Var = yhcVar.c;
            jc6Var2.getClass();
            kq0.e();
            iz1 iz1Var = (iz1) ((gu6) jc6Var2.a).f(gu6.o, new iz1(Arrays.asList(new tz1())));
            Objects.requireNonNull(iz1Var);
            int i2 = jc6.Y;
            jc6.Y = i2 + 1;
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(iz1Var.hashCode());
            List<tz1> list = iz1Var.a;
            Objects.requireNonNull(list);
            for (tz1 tz1Var : list) {
                u40 u40Var = new u40();
                kz1 kz1Var = (kz1) jc6Var2.b;
                u40Var.c = kz1Var.c;
                u40Var.c(kz1Var.b);
                u40Var.a(fc0Var.i);
                y90 y90Var = (y90) jc6Var2.X;
                fw6 fw6Var = y90Var.b;
                Objects.requireNonNull(fw6Var);
                ((HashSet) u40Var.e).add(fw6Var);
                u40Var.a = y90Var.c != null ? 1 : i;
                if (f46.V(y90Var.e)) {
                    if (((ImageCaptureRotationOptionQuirk) wi4.a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
                        aa0 aa0Var = kz1.i;
                    } else {
                        ((mi9) u40Var.f).j(kz1.i, Integer.valueOf(fc0Var.f));
                    }
                    aa0 aa0Var2 = kz1.j;
                    e1f.b(fc0Var.d, y90Var.d);
                    ((mi9) u40Var.f).j(aa0Var2, Integer.valueOf(fc0Var.g));
                }
                u40Var.c(tz1Var.a.b);
                ((ui9) u40Var.g).a.put(strValueOf, 0);
                ((ui9) u40Var.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
                u40Var.b(y90Var.a);
                arrayList.add(u40Var.d());
                i = 0;
            }
            h7b h7bVar = new h7b(arrayList, yhcVar, false, 10);
            x9b x9bVar = new x9b(iz1Var, fc0Var.d, fc0Var.f, fc0Var.g, fc0Var.e, yhcVar, oq1Var, i2);
            jc6 jc6Var3 = this.c;
            jc6Var3.getClass();
            kq0.e();
            ((y90) jc6Var3.X).j.accept(x9bVar);
            kq0.e();
            fu6 fu6Var = (fu6) this.b.b;
            synchronized (fu6Var.q) {
                try {
                    if (fu6Var.q.get() == null) {
                        fu6Var.q.set(Integer.valueOf(fu6Var.H()));
                    }
                } finally {
                }
            }
            fu6 fu6Var2 = (fu6) this.b.b;
            fu6Var2.getClass();
            kq0.e();
            k12 k12VarK = kq0.K(fu6Var2.d().i(arrayList, fu6Var2.p, fu6Var2.r), new re6(15, new mu1(6)), ju0.k());
            kq0.a(k12VarK, new bdb(this, h7bVar, false, 8), ju0.D());
            kq0.e();
            c54.p("CaptureRequestFuture can only be set once.", yhcVar.i == null);
            yhcVar.i = k12VarK;
        }
    }
}
