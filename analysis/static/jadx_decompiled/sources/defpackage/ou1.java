package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class ou1 implements tu1 {
    public final st1 a;
    public boolean b = false;

    public ou1(st1 st1Var) {
        this.a = st1Var;
    }

    @Override // defpackage.tu1
    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        Integer num2;
        dw6 dw6VarR = kq0.r(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return dw6VarR;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 1 || iIntValue == 2) && (num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) != null && num2.intValue() == 0) {
            this.b = true;
            this.a.h.e(false);
        }
        return dw6VarR;
    }

    @Override // defpackage.tu1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.tu1
    public final void c() {
        if (this.b) {
            this.a.h.a(true, false);
        }
    }
}
