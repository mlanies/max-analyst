package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class kt1 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ kt1(nx0 nx0Var, int i) {
        this.a = i;
        this.b = nx0Var;
    }

    @Override // defpackage.mq1
    public final String q(final lq1 lq1Var) {
        int i = this.a;
        final nx0 nx0Var = this.b;
        nx0Var.getClass();
        switch (i) {
            case 0:
                final int i2 = 1;
                ((Executor) nx0Var.o).execute(new Runnable() { // from class: jt1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                nx0 nx0Var2 = nx0Var;
                                nx0Var2.Y = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                lq1 lq1Var2 = (lq1) nx0Var2.s0;
                                if (lq1Var2 != null) {
                                    lq1Var2.d(cameraControl$OperationCanceledException);
                                    nx0Var2.s0 = null;
                                }
                                nx0Var2.s0 = lq1Var;
                                if (nx0Var2.b) {
                                    st1 st1Var = (st1) nx0Var2.c;
                                    st1Var.getClass();
                                    kq0.w(f8.g(new ync(22, st1Var))).d(new b(27, nx0Var2), (Executor) nx0Var2.o);
                                    nx0Var2.Y = false;
                                    break;
                                }
                                break;
                            default:
                                nx0 nx0Var3 = nx0Var;
                                nx0Var3.Y = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                lq1 lq1Var3 = (lq1) nx0Var3.s0;
                                if (lq1Var3 != null) {
                                    lq1Var3.d(cameraControl$OperationCanceledException2);
                                    nx0Var3.s0 = null;
                                }
                                nx0Var3.s0 = lq1Var;
                                if (nx0Var3.b) {
                                    st1 st1Var2 = (st1) nx0Var3.c;
                                    st1Var2.getClass();
                                    kq0.w(f8.g(new ync(22, st1Var2))).d(new b(27, nx0Var3), (Executor) nx0Var3.o);
                                    nx0Var3.Y = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final int i3 = 0;
                ((Executor) nx0Var.o).execute(new Runnable() { // from class: jt1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                nx0 nx0Var2 = nx0Var;
                                nx0Var2.Y = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                lq1 lq1Var2 = (lq1) nx0Var2.s0;
                                if (lq1Var2 != null) {
                                    lq1Var2.d(cameraControl$OperationCanceledException);
                                    nx0Var2.s0 = null;
                                }
                                nx0Var2.s0 = lq1Var;
                                if (nx0Var2.b) {
                                    st1 st1Var = (st1) nx0Var2.c;
                                    st1Var.getClass();
                                    kq0.w(f8.g(new ync(22, st1Var))).d(new b(27, nx0Var2), (Executor) nx0Var2.o);
                                    nx0Var2.Y = false;
                                    break;
                                }
                                break;
                            default:
                                nx0 nx0Var3 = nx0Var;
                                nx0Var3.Y = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                lq1 lq1Var3 = (lq1) nx0Var3.s0;
                                if (lq1Var3 != null) {
                                    lq1Var3.d(cameraControl$OperationCanceledException2);
                                    nx0Var3.s0 = null;
                                }
                                nx0Var3.s0 = lq1Var;
                                if (nx0Var3.b) {
                                    st1 st1Var2 = (st1) nx0Var3.c;
                                    st1Var2.getClass();
                                    kq0.w(f8.g(new ync(22, st1Var2))).d(new b(27, nx0Var3), (Executor) nx0Var3.o);
                                    nx0Var3.Y = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
