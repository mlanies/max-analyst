package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class en5 implements Drawable.Callback {
    public final dd4 a;
    public final kl4 b;
    public final /* synthetic */ fn5 c;

    public en5(fn5 fn5Var) {
        this.c = fn5Var;
        this.a = new dd4(22, fn5Var);
        this.b = new kl4(fn5Var, 29, this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        fn5 fn5Var = this.c;
        RecyclerView recyclerView = fn5Var.t0;
        kl4 kl4Var = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(kl4Var);
        }
        RecyclerView recyclerView2 = fn5Var.t0;
        if (recyclerView2 != null) {
            recyclerView2.post(kl4Var);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        fn5 fn5Var = this.c;
        RecyclerView recyclerView = fn5Var.t0;
        kl4 kl4Var = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(kl4Var);
        }
        RecyclerView recyclerView2 = fn5Var.t0;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(kl4Var, j - System.currentTimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        RecyclerView recyclerView = this.c.t0;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.b);
        }
    }
}
