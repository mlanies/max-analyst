package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.facebook.animated.gif.GifImage;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class j84 implements cq4 {
    public final gaa a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final hc9 d;
    public final s2b e;
    public final jy3 f;
    public final ide g;
    public final ide h;
    public final ide i;
    public final ide j;
    public final ide k;
    public final ide l;

    public j84(gaa gaaVar, v4f v4fVar, v6d v6dVar, RealtimeSinceBootClock realtimeSinceBootClock, s2b s2bVar, jy3 jy3Var, xe xeVar, xe xeVar2, x24 x24Var, x24 x24Var2, x24 x24Var3, x24 x24Var4) {
        this.a = gaaVar;
        this.b = v4fVar;
        this.c = v6dVar;
        this.d = realtimeSinceBootClock;
        this.e = s2bVar;
        this.f = jy3Var;
        this.g = xeVar;
        this.h = xeVar2;
        this.i = x24Var;
        this.k = x24Var3;
        this.j = x24Var2;
        this.l = x24Var4;
    }

    @Override // defpackage.cq4
    public final Drawable a(l43 l43Var) {
        GifImage gifImage;
        a8g a8gVar;
        wn0 w36Var;
        l84 l84Var;
        fm5 fm5Var = null;
        if (!(l43Var instanceof j43)) {
            return null;
        }
        j43 j43Var = (j43) l43Var;
        synchronized (j43Var) {
            a8g a8gVar2 = j43Var.o;
            gifImage = a8gVar2 == null ? null : (GifImage) a8gVar2.a;
        }
        synchronized (j43Var) {
            a8gVar = j43Var.o;
        }
        a8gVar.getClass();
        Bitmap.Config config = gifImage != null ? gifImage.a : null;
        GifImage gifImage2 = (GifImage) a8gVar.a;
        ue ueVarJ = this.a.j(a8gVar, new Rect(0, 0, gifImage2.k(), gifImage2.h()));
        re6 re6Var = new re6(2, ueVarJ);
        int iIntValue = ((Integer) this.g.get()).intValue();
        if (iIntValue == 1) {
            w36Var = new w36(new die(new cg(a8gVar.hashCode(), false), this.f), true);
        } else if (iIntValue == 2) {
            w36Var = new w36(new die(new cg(a8gVar.hashCode(), false), this.f), false);
        } else if (iIntValue != 3) {
            w36Var = new xxc();
        } else {
            y26 y26Var = new y26();
            y26Var.a = -1;
            w36Var = y26Var;
        }
        ide ideVar = this.i;
        te teVar = new te(w36Var, ueVarJ, ((Boolean) ideVar.get()).booleanValue());
        int iIntValue2 = ((Integer) this.h.get()).intValue();
        s2b s2bVar = this.e;
        if (iIntValue2 > 0) {
            fm5Var = new fm5(iIntValue2, 0);
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            ExecutorService executorService = this.c;
            l84 l84Var2 = new l84();
            l84Var2.a = s2bVar;
            l84Var2.b = teVar;
            l84Var2.c = config;
            l84Var2.d = executorService;
            l84Var2.e = new SparseArray();
            l84Var = l84Var2;
        } else {
            l84Var = null;
        }
        pn0 pn0Var = new pn0(this.e, w36Var, re6Var, teVar, ((Boolean) ideVar.get()).booleanValue(), ((Boolean) ideVar.get()).booleanValue() ? new woe((String) a8gVar.b, re6Var, teVar, new u26(s2bVar, ((Integer) this.k.get()).intValue(), ((Integer) this.l.get()).intValue()), ((Boolean) this.j.get()).booleanValue()) : fm5Var, l84Var);
        hc9 hc9Var = this.d;
        ScheduledExecutorService scheduledExecutorService = this.b;
        wf wfVar = new wf();
        wfVar.c = pn0Var;
        wfVar.a = false;
        wfVar.Z = new re(1, wfVar);
        wfVar.Y = pn0Var;
        wfVar.o = hc9Var;
        wfVar.X = scheduledExecutorService;
        return new se(wfVar);
    }

    @Override // defpackage.cq4
    public final boolean b(l43 l43Var) {
        return l43Var instanceof j43;
    }
}
