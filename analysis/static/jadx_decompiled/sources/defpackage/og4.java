package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class og4 extends zu3 {
    public yg3 Y;
    public final long o = 1000;
    public final Handler X = new Handler(Looper.getMainLooper());

    @Override // defpackage.zu3
    public final void a() throws Throwable {
        yg3 yg3Var = this.Y;
        if (yg3Var != null) {
            this.X.removeCallbacks(yg3Var);
        }
        yg3 yg3Var2 = this.Y;
        if (yg3Var2 != null) {
            yg3Var2.run();
        }
        this.Y = null;
    }

    @Override // defpackage.zu3
    public final void f(zu3 zu3Var, uu3 uu3Var) {
        yg3 yg3Var = this.Y;
        if (yg3Var != null) {
            this.X.removeCallbacks(yg3Var);
        }
        this.Y = null;
    }

    @Override // defpackage.zu3
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3Var) {
        yg3 yg3Var = this.Y;
        Handler handler = this.X;
        if (yg3Var != null) {
            handler.removeCallbacks(yg3Var);
        }
        yg3 yg3Var2 = new yg3(view, z, this, viewGroup, view2, xu3Var);
        handler.postDelayed(yg3Var2, this.o);
        this.Y = yg3Var2;
    }
}
