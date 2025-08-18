package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class o75 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ u75 a;

    public o75(u75 u75Var) {
        this.a = u75Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        u75 u75Var = this.a;
        u75Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        u75Var.p2(surface);
        u75Var.c1 = surface;
        u75Var.k2(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u75 u75Var = this.a;
        u75Var.p2(null);
        u75Var.k2(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.k2(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.k2(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        u75 u75Var = this.a;
        u75Var.getClass();
        u75Var.k2(0, 0);
    }
}
