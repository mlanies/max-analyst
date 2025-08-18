package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class p75 implements tff, gx1, p4b {
    public tff a;
    public gx1 b;
    public tff c;
    public gx1 o;

    @Override // defpackage.p4b
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (tff) obj;
            return;
        }
        if (i == 8) {
            this.b = (gx1) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        svd svdVar = (svd) obj;
        if (svdVar == null) {
            this.c = null;
            this.o = null;
        } else {
            this.c = svdVar.getVideoFrameMetadataListener();
            this.o = svdVar.getCameraMotionListener();
        }
    }

    @Override // defpackage.gx1
    public final void b(long j, float[] fArr) {
        gx1 gx1Var = this.o;
        if (gx1Var != null) {
            gx1Var.b(j, fArr);
        }
        gx1 gx1Var2 = this.b;
        if (gx1Var2 != null) {
            gx1Var2.b(j, fArr);
        }
    }

    @Override // defpackage.gx1
    public final void c() {
        gx1 gx1Var = this.o;
        if (gx1Var != null) {
            gx1Var.c();
        }
        gx1 gx1Var2 = this.b;
        if (gx1Var2 != null) {
            gx1Var2.c();
        }
    }

    @Override // defpackage.tff
    public final void d(long j, long j2, oy5 oy5Var, MediaFormat mediaFormat) {
        tff tffVar = this.c;
        if (tffVar != null) {
            tffVar.d(j, j2, oy5Var, mediaFormat);
        }
        tff tffVar2 = this.a;
        if (tffVar2 != null) {
            tffVar2.d(j, j2, oy5Var, mediaFormat);
        }
    }
}
