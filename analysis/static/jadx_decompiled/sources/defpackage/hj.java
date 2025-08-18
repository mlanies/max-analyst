package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hj implements Runnable {
    public final long a;
    public final WeakReference b;
    public volatile boolean c;
    public static final Handler o = new Handler(Looper.getMainLooper());
    public static volatile long X = -1;

    public hj(View view) {
        long j;
        Context context = view.getContext();
        if (X == -1) {
            Display display = Build.VERSION.SDK_INT >= 30 ? context.getDisplay() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Long lValueOf = display != null ? Long.valueOf((long) display.getRefreshRate()) : null;
            uv7 uv7Var = new uv7(0L, 30L);
            if (lValueOf == null || !uv7Var.a(lValueOf.longValue())) {
                uv7 uv7Var2 = new uv7(31, 60L);
                if (lValueOf == null || !uv7Var2.a(lValueOf.longValue())) {
                    j = (lValueOf == null || !new uv7((long) 61, 90L).a(lValueOf.longValue())) ? 6L : 9L;
                } else {
                    j = 12;
                }
            } else {
                j = 16;
            }
            X = j;
        }
        this.a = X;
        this.b = new WeakReference(view);
    }

    public final void a() {
        this.c = false;
        if (this.b.get() == null) {
            return;
        }
        o.postDelayed(this, this.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            o.removeCallbacks(this);
            return;
        }
        View view = (View) this.b.get();
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            this.b.clear();
            return;
        }
        if (view.isAttachedToWindow()) {
            view.invalidate();
        }
        o.postDelayed(this, this.a);
    }
}
