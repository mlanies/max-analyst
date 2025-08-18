package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* loaded from: classes.dex */
public final class ox1 implements akc {
    public final /* synthetic */ int b;
    public final akc c;

    public ox1(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new rue(j, new nx1(j));
                break;
            default:
                this.c = new ox1(j, 1);
                break;
        }
    }

    @Override // defpackage.akc
    public final long a() {
        switch (this.b) {
            case 0:
                return ((rue) ((ox1) this.c).c).b;
            default:
                return ((rue) this.c).b;
        }
    }

    @Override // defpackage.akc
    public final zjc b(mx1 mx1Var) {
        switch (this.b) {
            case 0:
                if (((rue) ((ox1) this.c).c).b(mx1Var).b) {
                    return zjc.e;
                }
                Throwable th = (Throwable) mx1Var.c;
                return (!(th instanceof CameraValidator$CameraIdListIncorrectException) || ((CameraValidator$CameraIdListIncorrectException) th).a <= 0) ? zjc.d : zjc.f;
            default:
                return ((rue) this.c).b(mx1Var);
        }
    }

    public final akc c(long j) {
        switch (this.b) {
            case 0:
                return new ox1(j, 0);
            default:
                return new ox1(j, 1);
        }
    }
}
