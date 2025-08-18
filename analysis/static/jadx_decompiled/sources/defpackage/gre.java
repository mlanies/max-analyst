package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gre implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ hre a;

    public gre(hre hreVar) {
        this.a = hreVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        hre hreVar = this.a;
        hreVar.f = surfaceTexture;
        if (hreVar.g == null) {
            hreVar.p();
            return;
        }
        hreVar.h.getClass();
        Objects.toString(hreVar.h);
        hreVar.h.l.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hre hreVar = this.a;
        hreVar.f = null;
        oq1 oq1Var = hreVar.g;
        if (oq1Var == null) {
            return true;
        }
        kq0.a(oq1Var, new b9b(this, surfaceTexture, false, 9), ot3.a(hreVar.e.getContext()));
        hreVar.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        lq1 lq1Var = (lq1) this.a.k.getAndSet(null);
        if (lq1Var != null) {
            lq1Var.b(null);
        }
    }
}
