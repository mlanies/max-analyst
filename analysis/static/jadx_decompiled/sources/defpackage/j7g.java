package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class j7g implements Runnable {
    public static final String Z = a14.O("WorkForegroundRunnable");
    public final dy5 X;
    public final wne Y;
    public final dcd a = new dcd();
    public final Context b;
    public final h8g c;
    public final gm7 o;

    public j7g(Context context, h8g h8gVar, gm7 gm7Var, k7g k7gVar, wne wneVar) {
        this.b = context;
        this.c = h8gVar;
        this.o = gm7Var;
        this.X = k7gVar;
        this.Y = wneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.j(null);
            return;
        }
        dcd dcdVar = new dcd();
        bkb bkbVar = (bkb) this.Y;
        ((k40) bkbVar.c).execute(new fre(this, 19, dcdVar));
        dcdVar.d(new i76((Object) this, (Object) dcdVar, false, 26), (k40) bkbVar.c);
    }
}
