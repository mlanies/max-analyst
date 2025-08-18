package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fg {
    public static final ThreadLocal i = new ThreadLocal();
    public final ph4 e;
    public y7g h;
    public final qpd a = new qpd(0);
    public final ArrayList b = new ArrayList();
    public final qqd c = new qqd(2, this);
    public final b d = new b(8, this);
    public boolean f = false;
    public float g = 1.0f;

    public fg(ph4 ph4Var) {
        this.e = ph4Var;
    }

    public final boolean a() {
        ph4 ph4Var = this.e;
        ph4Var.getClass();
        return Thread.currentThread() == ((Looper) ph4Var.b).getThread();
    }
}
