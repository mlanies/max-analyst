package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ig7 extends lw1 {
    public eh7 E;

    @Override // defpackage.lw1
    public final hg7 p() {
        adb adbVarB;
        if (this.E == null || this.n == null) {
            return null;
        }
        if (!i() || this.p == null || this.o == null) {
            adbVarB = null;
        } else {
            s9f s9fVar = new s9f();
            s9fVar.a(this.c);
            kq0.e();
            if ((this.b & 1) != 0) {
                s9fVar.a(this.d);
            } else {
                this.n.a(this.d);
            }
            kq0.e();
            if ((this.b & 2) != 0) {
                s9fVar.a(this.e);
            } else {
                this.n.a(this.e);
            }
            kq0.e();
            if ((this.b & 4) != 0) {
                s9fVar.a(this.f);
            } else {
                this.n.a(this.f);
            }
            s9fVar.a = this.o;
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                s9fVar.c.add((zgf) it.next());
            }
            adbVarB = s9fVar.b();
        }
        if (adbVarB == null) {
            return null;
        }
        try {
            return this.n.a.c(this.E, this.a, adbVarB);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
