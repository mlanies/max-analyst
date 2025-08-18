package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class ct4 extends Surface {
    public static boolean X;
    public static int o;
    public final boolean a;
    public final bt4 b;
    public boolean c;

    public ct4(bt4 bt4Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bt4Var;
        this.a = z;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = maf.a;
        if (i >= 24 && ((i >= 26 || !("samsung".equals(maf.c) || "XT1650".equals(maf.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!X) {
                o = a(context);
                X = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return o != 0;
    }

    public static ct4 c(Context context, boolean z) {
        boolean z2 = false;
        np8.f(!z || b(context));
        bt4 bt4Var = new bt4("ExoPlayer:DummySurface", 0);
        int i = z ? o : 0;
        bt4Var.start();
        Handler handler = new Handler(bt4Var.getLooper(), bt4Var);
        bt4Var.b = handler;
        bt4Var.X = new mu4(handler, 0);
        synchronized (bt4Var) {
            bt4Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (((ct4) bt4Var.Y) == null && bt4Var.o == null && bt4Var.c == null) {
                try {
                    bt4Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bt4Var.o;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bt4Var.c;
        if (error != null) {
            throw error;
        }
        ct4 ct4Var = (ct4) bt4Var.Y;
        ct4Var.getClass();
        return ct4Var;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    bt4 bt4Var = this.b;
                    bt4Var.b.getClass();
                    bt4Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
