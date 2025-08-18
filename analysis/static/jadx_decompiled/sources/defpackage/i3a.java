package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class i3a {
    public final Runnable a;
    public final hs b = new hs();
    public a3a c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public i3a(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? f3a.a.a(new b3a(this, 0), new b3a(this, 1), new c3a(this, 0), new c3a(this, 1)) : d3a.a.a(new c3a(this, 2));
        }
    }

    public final void a(eh7 eh7Var, a3a a3aVar) {
        gh7 gh7VarQ = eh7Var.Q();
        if (gh7VarQ.d == fg7.a) {
            return;
        }
        a3aVar.b.add(new g3a(this, gh7VarQ, a3aVar));
        f();
        a3aVar.c = new e09(0, this, i3a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
    }

    public final h3a b(a3a a3aVar) {
        this.b.b(a3aVar);
        h3a h3aVar = new h3a(this, a3aVar);
        a3aVar.b.add(h3aVar);
        f();
        a3aVar.c = new e09(0, this, i3a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        return h3aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        a3a a3aVarPrevious;
        a3a a3aVar = this.c;
        if (a3aVar == null) {
            hs hsVar = this.b;
            ListIterator listIterator = hsVar.listIterator(hsVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a3aVarPrevious = 0;
                    break;
                } else {
                    a3aVarPrevious = listIterator.previous();
                    if (((a3a) a3aVarPrevious).a) {
                        break;
                    }
                }
            }
            a3aVar = a3aVarPrevious;
        }
        this.c = null;
        if (a3aVar != null) {
            a3aVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        a3a a3aVarPrevious;
        a3a a3aVar = this.c;
        if (a3aVar == null) {
            hs hsVar = this.b;
            ListIterator listIterator = hsVar.listIterator(hsVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a3aVarPrevious = 0;
                    break;
                } else {
                    a3aVarPrevious = listIterator.previous();
                    if (((a3a) a3aVarPrevious).a) {
                        break;
                    }
                }
            }
            a3aVar = a3aVarPrevious;
        }
        this.c = null;
        if (a3aVar != null) {
            a3aVar.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        d3a d3aVar = d3a.a;
        if (z && !this.f) {
            d3aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            d3aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        hs hsVar = this.b;
        boolean z2 = false;
        if (!(hsVar instanceof Collection) || !hsVar.isEmpty()) {
            Iterator it = hsVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((a3a) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
