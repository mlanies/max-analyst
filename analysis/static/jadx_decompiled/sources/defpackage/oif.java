package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oif implements SurfaceTexture.OnFrameAvailableListener {
    public final boolean a;
    public final /* synthetic */ sif b;

    public oif(sif sifVar, boolean z) {
        this.b = sifVar;
        this.a = z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (surfaceTexture == null) {
            hm9.p(this.b.a, "onFrameAvailable, surface texture is null!", null);
            return;
        }
        sif sifVar = this.b;
        if (sifVar.v0 || sifVar.b.get()) {
            hm9.p(this.b.a, "onFrameAvailable, called in released state", null);
            return;
        }
        sif sifVar2 = this.b;
        fjf fjfVar = sifVar2.u0;
        if (fjfVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : sifVar2.Z.entrySet()) {
            kee keeVar = (kee) entry.getKey();
            Surface surface = (Surface) entry.getValue();
            int i = keeVar.c;
            if (i == 34) {
                if (!z2) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(sifVar2.s0);
                    z2 = true;
                }
                keeVar.n(sifVar2.t0, sifVar2.s0);
                try {
                    fjfVar.w(surfaceTexture, surface, sifVar2.t0, this.a);
                    z = true;
                } catch (RuntimeException e) {
                    hm9.p(sifVar2.a, "failed to render with GL renderer", e);
                }
            } else {
                hm9.m0(sifVar2.a, "onFrameAvailable, unsupported format=" + i + " for surfaceOutput=" + keeVar, new Object[0]);
            }
        }
        if (z) {
            sif sifVar3 = this.b;
            if (sifVar3.x0) {
                return;
            }
            sifVar3.x0 = true;
            String str = sifVar3.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                us7 us7Var = us7.X;
                pif pifVar = sifVar3.c;
                pifVar.getClass();
                ir6Var.d(us7Var, str, ey8.i(SystemClock.elapsedRealtime() - pifVar.c, "notifyFirstFrameRendered, in ", " ms after video message processor started"), null);
            }
            Iterator it = sifVar3.Y.iterator();
            while (it.hasNext()) {
                ((tif) it.next()).c();
            }
        }
    }
}
