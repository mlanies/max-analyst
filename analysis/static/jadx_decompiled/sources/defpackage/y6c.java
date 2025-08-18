package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class y6c extends tdc {
    public final RecyclerView a;
    public final h6c b;
    public final k56 c;
    public final String d = y6c.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public y6c(EndlessRecyclerView2 endlessRecyclerView2, h6c h6cVar, zj7 zj7Var) {
        this.a = endlessRecyclerView2;
        this.b = h6cVar;
        this.c = zj7Var;
    }

    public static final Rect c(y6c y6cVar, View view) {
        View view2 = (View) y6cVar.c.invoke();
        if (view2 == null || view == null) {
            return null;
        }
        return mpf.c(view, view2);
    }

    public static final void d(y6c y6cVar, String str, long j, Rect rect) {
        String str2 = y6cVar.d;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, ey8.h(j, "Play message "), null);
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        RLottieDrawable rLottieDrawableCreateByUrl$default = RLottieFactory.createByUrl$default(str, tu0.G(q6c.b.getWidth() * fk4.d().getDisplayMetrics().density), tu0.G(q6c.b.getHeight() * fk4.d().getDisplayMetrics().density), false, false, true, false, true, false, 72, null);
        rLottieDrawableCreateByUrl$default.setAutoRepeat(0);
        y6cVar.b.a(j, rLottieDrawableCreateByUrl$default, rect);
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (!this.g) {
            g(false);
        } else {
            this.g = false;
            pla.a(recyclerView, new q57(19, recyclerView, this));
        }
    }

    public final void e(long j, v5c v5cVar, String str) {
        String str2 = this.d;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, "Add reaction effect, reaction:" + ((Object) v5cVar) + ", " + j, null);
        }
        this.e.add(new v6c(j, v5cVar, str));
    }

    public final boolean f(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager linearLayoutManagerT = z7.t(recyclerView);
        int iW0 = linearLayoutManagerT != null ? linearLayoutManagerT.W0() : -1;
        LinearLayoutManager linearLayoutManagerT2 = z7.t(recyclerView);
        return i == -1 || iW0 > i || i > (linearLayoutManagerT2 != null ? linearLayoutManagerT2.Y0() : -1);
    }

    public final void g(boolean z) {
        long jLongValue;
        dec decVarN;
        Object next;
        LinkedList linkedList = this.f;
        Long l = (Long) linkedList.peek();
        if (l == null || (decVarN = this.a.N((jLongValue = l.longValue()))) == null) {
            return;
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((v6c) next).a == jLongValue) {
                    break;
                }
            }
        }
        v6c v6cVar = (v6c) next;
        if (v6cVar == null) {
            linkedList.remove(l);
        } else {
            RecyclerView recyclerView = this.a;
            pla.a(recyclerView, new w6c(recyclerView, this, decVarN, jLongValue, v6cVar, z));
        }
    }
}
