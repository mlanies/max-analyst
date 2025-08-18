package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class mu4 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] s0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public static final int[] t0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLContext X;
    public EGLSurface Y;
    public SurfaceTexture Z;
    public final /* synthetic */ int a;
    public final Handler b;
    public final int[] c;
    public EGLDisplay o;

    public mu4(Handler handler, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = handler;
                this.c = new int[1];
                break;
            default:
                this.b = handler;
                this.c = new int[1];
                break;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                this.b.post(this);
                break;
            default:
                this.b.post(this);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SurfaceTexture surfaceTexture = this.Z;
                if (surfaceTexture != null) {
                    try {
                        surfaceTexture.updateTexImage();
                        break;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                break;
            default:
                SurfaceTexture surfaceTexture2 = this.Z;
                if (surfaceTexture2 != null) {
                    try {
                        surfaceTexture2.updateTexImage();
                        break;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
