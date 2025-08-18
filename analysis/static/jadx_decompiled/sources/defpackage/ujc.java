package defpackage;

import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.lang.ref.WeakReference;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class ujc {
    public final hdc a;
    public final WeakReference d;
    public final gh7 e;
    public boolean f;
    public final ck h;
    public final String i;
    public int b = -1;
    public int c = 0;
    public final sjc g = new sjc(0, this);

    public ujc(hdc hdcVar, EndlessRecyclerView2 endlessRecyclerView2) throws InterruptedException {
        eh7 eh7Var;
        this.a = hdcVar;
        this.d = new WeakReference(endlessRecyclerView2);
        ck ckVar = new ck(8, this);
        this.h = ckVar;
        this.i = ujc.class.getName();
        endlessRecyclerView2.addOnAttachStateChangeListener(ckVar);
        Object context = endlessRecyclerView2.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                eh7Var = null;
                break;
            } else {
                if (context instanceof eh7) {
                    eh7Var = (eh7) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (eh7Var == null) {
            String str = this.i;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "registerLifecycleObserver findLifecycleOwner() is null", null);
            }
        } else {
            gh7 gh7VarQ = eh7Var.Q();
            this.e = gh7VarQ;
            if (gh7VarQ != null) {
                gh7VarQ.a(this.g);
            }
            this.f = !eh7Var.Q().d.a(fg7.o);
        }
        this.h.onViewAttachedToWindow(endlessRecyclerView2);
    }

    public final void a(RecyclerView recyclerView) {
        String str = this.i;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "attachAdapter", null);
        }
        hdc hdcVar = this.a;
        b recycledViewPool = recyclerView.getRecycledViewPool();
        recyclerView.setRecycledViewPool(null);
        if (recyclerView.getAdapter() != hdcVar) {
            recyclerView.setAdapter(hdcVar);
        }
        recyclerView.setRecycledViewPool(recycledViewPool);
        if (this.b != -1) {
            a layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.n1(this.b, this.c);
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        String str = this.i;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "detachAdapter", null);
        }
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            this.b = linearLayoutManager.W0();
            View childAt = recyclerView.getChildAt(0);
            this.c = childAt != null ? childAt.getTop() : 0;
        }
        b recycledViewPool = recyclerView.getRecycledViewPool();
        recyclerView.setRecycledViewPool(null);
        if (recyclerView.getAdapter() != null) {
            recyclerView.setAdapter(null);
        }
        recyclerView.setRecycledViewPool(recycledViewPool);
    }
}
