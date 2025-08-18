package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bye {
    public final st1 a;
    public final ci9 b = new ci9(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public lq1 f;
    public boolean g;

    public bye(st1 st1Var, xv1 xv1Var, q6d q6dVar) {
        this.a = st1Var;
        this.d = q6dVar;
        this.c = kq0.s(new ync(23, xv1Var));
        st1Var.p(new rt1() { // from class: aye
            @Override // defpackage.rt1
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                bye byeVar = this.a;
                if (byeVar.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == byeVar.g) {
                        byeVar.f.b(null);
                        byeVar.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(ci9 ci9Var, Integer num) {
        if (kq0.t()) {
            ci9Var.k(num);
        } else {
            ci9Var.i(num);
        }
    }

    public final void a(lq1 lq1Var, boolean z) {
        if (!this.c) {
            if (lq1Var != null) {
                lq1Var.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.e;
        ci9 ci9Var = this.b;
        if (!z2) {
            b(ci9Var, 0);
            if (lq1Var != null) {
                lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.g = z;
        this.a.r(z);
        b(ci9Var, Integer.valueOf(z ? 1 : 0));
        lq1 lq1Var2 = this.f;
        if (lq1Var2 != null) {
            lq1Var2.d(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f = lq1Var;
    }
}
