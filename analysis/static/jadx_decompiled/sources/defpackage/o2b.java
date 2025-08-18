package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class o2b extends Surface {
    public static boolean X;
    public static int o;
    public final boolean a;
    public final bt4 b;
    public boolean c;

    public o2b(bt4 bt4Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bt4Var;
        this.a = z;
    }

    public static synchronized boolean a(Context context) {
        try {
            if (!X) {
                int i = oaf.a;
                o = (i >= 24 && ((i >= 26 || (!"samsung".equals(oaf.c) && !"XT1650".equals(oaf.d))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) ? mr0.L("EGL_EXT_protected_content") : false ? mr0.L("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
                X = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return o != 0;
    }

    public static o2b b(Context context, boolean z) {
        boolean z2 = false;
        fm9.k(!z || a(context));
        bt4 bt4Var = new bt4("ExoPlayer:PlaceholderSurface", 1);
        int i = z ? o : 0;
        bt4Var.start();
        Handler handler = new Handler(bt4Var.getLooper(), bt4Var);
        bt4Var.b = handler;
        bt4Var.X = new mu4(handler, 1);
        synchronized (bt4Var) {
            bt4Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (((o2b) bt4Var.Y) == null && bt4Var.o == null && bt4Var.c == null) {
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
        o2b o2bVar = (o2b) bt4Var.Y;
        o2bVar.getClass();
        return o2bVar;
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
