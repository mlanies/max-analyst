package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class uu1 implements rt1 {
    public lq1 a;
    public final oq1 b = f8.g(new ync(27, this));
    public final un0 c;

    public uu1(un0 un0Var) {
        this.c = un0Var;
    }

    @Override // defpackage.rt1
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        un0 un0Var = this.c;
        if (un0Var != null && !un0Var.b(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
