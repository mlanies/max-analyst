package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraControlInternal$CameraControlException;

/* loaded from: classes.dex */
public final class ru1 extends iv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq1 b;

    public ru1() {
        this.a = 1;
        this.b = null;
    }

    @Override // defpackage.iv1
    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new ImageCaptureException("Capture request is cancelled because camera is closed", null));
                break;
            case 1:
                lq1 lq1Var = this.b;
                if (lq1Var != null) {
                    lq1Var.d(new CameraControl$OperationCanceledException("Camera is closed"));
                    break;
                }
                break;
            default:
                lq1 lq1Var2 = this.b;
                if (lq1Var2 != null) {
                    lq1Var2.d(new CameraControl$OperationCanceledException("Camera is closed"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iv1
    public final void b(int i, pv1 pv1Var) {
        switch (this.a) {
            case 0:
                this.b.b(null);
                break;
            case 1:
                lq1 lq1Var = this.b;
                if (lq1Var != null) {
                    lq1Var.b(pv1Var);
                    break;
                }
                break;
            default:
                lq1 lq1Var2 = this.b;
                if (lq1Var2 != null) {
                    lq1Var2.b(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iv1
    public final void c(int i, dp3 dp3Var) {
        switch (this.a) {
            case 0:
                this.b.d(new ImageCaptureException("Capture request failed with reason ".concat("ERROR"), null));
                break;
            case 1:
                lq1 lq1Var = this.b;
                if (lq1Var != null) {
                    lq1Var.d(new CameraControlInternal$CameraControlException());
                    break;
                }
                break;
            default:
                lq1 lq1Var2 = this.b;
                if (lq1Var2 != null) {
                    lq1Var2.d(new CameraControlInternal$CameraControlException());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ru1(lq1 lq1Var, int i) {
        this.a = i;
        this.b = lq1Var;
    }
}
