package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class rif implements tj3 {
    public final see a;
    public final SurfaceTexture b;
    public final Surface c;
    public final /* synthetic */ sif d;

    public rif(sif sifVar, see seeVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = sifVar;
        this.a = seeVar;
        this.b = surfaceTexture;
        this.c = surface;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        sif sifVar = this.d;
        String str = sifVar.a;
        int i = ((bc0) obj).a;
        hm9.n(str, "onSurfaceRequestResult event=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? zr6.h(i, "SerufaceRequest.Result_UNKNOWN_code_") : "WILL_NOT_PROVIDE_SURFACE" : "SURFACE_ALREADY_PROVIDED" : "INVALID_SURFACE" : "REQUEST_CANCELLED" : "SURFACE_USED_SUCCESSFULLY"));
        sifVar.e();
        see seeVar = this.a;
        synchronized (seeVar.a) {
            seeVar.n = null;
            seeVar.o = null;
        }
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        this.c.release();
        sifVar.w0--;
        sifVar.f();
    }
}
