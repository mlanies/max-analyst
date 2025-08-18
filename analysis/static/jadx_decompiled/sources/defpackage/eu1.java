package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class eu1 extends CameraDevice.StateCallback {
    public final Executor a;
    public final ScheduledExecutorService b;
    public du1 c;
    public ScheduledFuture d;
    public final bu1 e;
    public final /* synthetic */ fu1 f;

    public eu1(fu1 fu1Var, q6d q6dVar, zh6 zh6Var, long j) {
        this.f = fu1Var;
        this.a = q6dVar;
        this.b = zh6Var;
        bu1 bu1Var = new bu1();
        bu1Var.c = this;
        bu1Var.b = -1L;
        bu1Var.a = j;
        this.e = bu1Var;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        Objects.toString(this.c);
        this.f.toString();
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        c54.p(null, this.c == null);
        c54.p(null, this.d == null);
        bu1 bu1Var = this.e;
        bu1Var.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (bu1Var.b == -1) {
            bu1Var.b = jUptimeMillis;
        }
        long j = jUptimeMillis - bu1Var.b;
        long jB = bu1Var.b();
        fu1 fu1Var = this.f;
        if (j >= jB) {
            bu1Var.b = -1L;
            bu1Var.b();
            fu1Var.E(4, null, false);
        } else {
            this.c = new du1(this, this.a);
            bu1Var.a();
            Objects.toString(this.c);
            boolean z = fu1Var.N0;
            fu1Var.toString();
            this.d = this.b.schedule(this.c, bu1Var.a(), TimeUnit.MILLISECONDS);
        }
    }

    public final boolean c() {
        int i;
        fu1 fu1Var = this.f;
        return fu1Var.N0 && ((i = fu1Var.v0) == 1 || i == 2);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f.toString();
        c54.p("Unexpected onClose callback on camera device: " + cameraDevice, this.f.u0 == null);
        int iS = au1.s(this.f.S0);
        if (iS == 1 || iS == 4) {
            c54.p(null, this.f.x0.isEmpty());
            this.f.s();
            return;
        }
        if (iS != 5 && iS != 6) {
            throw new IllegalStateException("Camera closed while in state: ".concat(wg0.r(this.f.S0)));
        }
        fu1 fu1Var = this.f;
        int i = fu1Var.v0;
        if (i == 0) {
            fu1Var.J(false);
            return;
        }
        "Camera closed due to error: ".concat(fu1.v(i));
        fu1Var.toString();
        b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.toString();
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        fu1 fu1Var = this.f;
        fu1Var.u0 = cameraDevice;
        fu1Var.v0 = i;
        imc imcVar = fu1Var.R0;
        ((fu1) imcVar.c).toString();
        imcVar.K();
        int iS = au1.s(this.f.S0);
        if (iS != 1) {
            switch (iS) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    wg0.o(this.f.S0);
                    c54.p("Attempt to handle open error from non open state: ".concat(wg0.r(this.f.S0)), this.f.S0 == 8 || this.f.S0 == 9 || this.f.S0 == 10 || this.f.S0 == 7 || this.f.S0 == 6);
                    int i2 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        cameraDevice.getId();
                        this.f.E(5, new v90(null, i == 3 ? 5 : 6), true);
                        this.f.r();
                        return;
                    }
                    cameraDevice.getId();
                    fu1 fu1Var2 = this.f;
                    c54.p("Can only reopen camera device after error if the camera device is actually in an error state.", fu1Var2.v0 != 0);
                    if (i == 1) {
                        i2 = 2;
                    } else if (i == 2) {
                        i2 = 1;
                    }
                    fu1Var2.E(7, new v90(null, i2), true);
                    fu1Var2.r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(wg0.r(this.f.S0)));
            }
        }
        cameraDevice.getId();
        wg0.o(this.f.S0);
        this.f.r();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f.toString();
        fu1 fu1Var = this.f;
        fu1Var.u0 = cameraDevice;
        fu1Var.v0 = 0;
        this.e.b = -1L;
        int iS = au1.s(fu1Var.S0);
        if (iS == 1 || iS == 4) {
            c54.p(null, this.f.x0.isEmpty());
            this.f.u0.close();
            this.f.u0 = null;
        } else {
            if (iS != 5 && iS != 6 && iS != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(wg0.r(this.f.S0)));
            }
            this.f.F(9);
            ux1 ux1Var = this.f.B0;
            String id = cameraDevice.getId();
            fu1 fu1Var2 = this.f;
            if (ux1Var.e(id, fu1Var2.A0.B(fu1Var2.u0.getId()))) {
                this.f.B();
            }
        }
    }
}
