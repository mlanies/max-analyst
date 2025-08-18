package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x6g {
    public static final x6g b;
    public final v6g a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = u6g.q;
        } else {
            b = v6g.b;
        }
    }

    public x6g(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u6g(this, windowInsets);
        } else {
            this.a = new s6g(this, windowInsets);
        }
    }

    public static x6g f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        x6g x6gVar = new x6g(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = zmf.a;
            x6g x6gVarA = pmf.a(view);
            v6g v6gVar = x6gVar.a;
            v6gVar.q(x6gVarA);
            v6gVar.d(view.getRootView());
        }
        return x6gVar;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final WindowInsets e() {
        v6g v6gVar = this.a;
        if (v6gVar instanceof p6g) {
            return ((p6g) v6gVar).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6g)) {
            return false;
        }
        return Objects.equals(this.a, ((x6g) obj).a);
    }

    public final int hashCode() {
        v6g v6gVar = this.a;
        if (v6gVar == null) {
            return 0;
        }
        return v6gVar.hashCode();
    }

    public x6g() {
        this.a = new v6g(this);
    }
}
