package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lx5 implements uw4 {
    public Handler X;
    public Executor Y;
    public ThreadPoolExecutor Z;
    public final Context a;
    public final bg4 b;
    public final dp3 c;
    public final Object o;
    public tu0 s0;

    public lx5(Context context, bg4 bg4Var) {
        dp3 dp3Var = mx5.i;
        this.o = new Object();
        c54.o(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = bg4Var;
        this.c = dp3Var;
    }

    @Override // defpackage.uw4
    public final void a(tu0 tu0Var) {
        synchronized (this.o) {
            this.s0 = tu0Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.o) {
            try {
                this.s0 = null;
                Handler handler = this.X;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.X = null;
                ThreadPoolExecutor threadPoolExecutor = this.Z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.Y = null;
                this.Z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.o) {
            try {
                if (this.s0 == null) {
                    return;
                }
                if (this.Y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pd3(0, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.Z = threadPoolExecutor;
                    this.Y = threadPoolExecutor;
                }
                this.Y.execute(new dd4(25, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vx5 d() {
        try {
            dp3 dp3Var = this.c;
            Context context = this.a;
            bg4 bg4Var = this.b;
            dp3Var.getClass();
            sh0 sh0VarP = z7.p(context, bg4Var);
            int i = sh0VarP.b;
            if (i != 0) {
                throw new RuntimeException(wg0.g(i, "fetchFonts failed (", ")"));
            }
            vx5[] vx5VarArr = (vx5[]) sh0VarP.c;
            if (vx5VarArr == null || vx5VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return vx5VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
