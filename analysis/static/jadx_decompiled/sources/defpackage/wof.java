package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wof {
    public Interpolator c;
    public xof d;
    public boolean e;
    public long b = -1;
    public final qwe f = new qwe(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((vof) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vof vofVar = (vof) it.next();
            long j = this.b;
            if (j >= 0) {
                vofVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) vofVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                vofVar.d(this.f);
            }
            View view2 = (View) vofVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
