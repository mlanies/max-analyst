package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ae3 implements pma {
    public final /* synthetic */ int a;
    public boolean b;

    public static kz1 d(kz1 kz1Var) {
        u40 u40Var = new u40();
        u40Var.c = kz1Var.c;
        Iterator it = Collections.unmodifiableList(kz1Var.a).iterator();
        while (it.hasNext()) {
            ((HashSet) u40Var.e).add((xf4) it.next());
        }
        u40Var.c(kz1Var.b);
        mi9 mi9VarB = mi9.b();
        mi9VarB.j(cv1.v0(CaptureRequest.FLASH_MODE), 0);
        u40Var.c(new cv1(8, wma.a(mi9VarB)));
        return u40Var.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public synchronized void a() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    while (!this.b) {
                        wait();
                    }
                    return;
                default:
                    while (!this.b) {
                        wait();
                    }
                    return;
            }
        }
    }

    public synchronized void b() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    boolean z = false;
                    while (!this.b) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                default:
                    boolean z2 = false;
                    while (!this.b) {
                        try {
                            wait();
                        } catch (InterruptedException unused2) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    return;
            }
        }
    }

    public synchronized void c() {
        this.b = false;
    }

    public synchronized boolean e() {
        return this.b;
    }

    public boolean f(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean g() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    if (this.b) {
                        return false;
                    }
                    this.b = true;
                    notifyAll();
                    return true;
                default:
                    if (this.b) {
                        return false;
                    }
                    this.b = true;
                    notifyAll();
                    return true;
            }
        }
    }

    public void h() {
        this.b = false;
    }

    public boolean i(ArrayList arrayList, boolean z) {
        if (this.b && z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ ae3(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
    }

    public /* synthetic */ ae3(boolean z, int i) {
        this.a = i;
    }

    public ae3(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = ((StillCaptureFlashStopRepeatingQuirk) zi4.a.e(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
            case 6:
                this.b = wi4.a.e(SurfaceOrderQuirk.class) != null;
                break;
            case 7:
                this.b = zi4.a.e(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.b = false;
                break;
        }
    }

    public ae3(bj6 bj6Var, int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = bj6Var.d(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.b = bj6Var.d(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public ae3(Context context) {
        this.a = 11;
        context.getApplicationContext();
    }
}
