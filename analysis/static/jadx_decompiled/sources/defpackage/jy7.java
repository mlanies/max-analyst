package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class jy7 {
    public int a;
    public int b;
    public int c;
    public Object o;

    public jy7() {
        if (yb9.Y == null) {
            yb9.Y = new yb9();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.o).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((ky7) this.o).s0 != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return c(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.o).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void f() {
        while (true) {
            int i = this.a;
            ky7 ky7Var = (ky7) this.o;
            if (i >= ky7Var.Y || ky7Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        if (h(e(view), obj)) {
            WeakHashMap weakHashMap = zmf.a;
            View.AccessibilityDelegate accessibilityDelegateA = umf.a(view);
            a4 a4Var = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof z3 ? ((z3) accessibilityDelegateA).a : new a4(accessibilityDelegateA);
            if (a4Var == null) {
                a4Var = new a4();
            }
            zmf.j(view, a4Var);
            view.setTag(this.a, obj);
            zmf.e(view, this.c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((ky7) this.o).Y;
    }

    public void remove() {
        b();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        ky7 ky7Var = (ky7) this.o;
        ky7Var.c();
        ky7Var.j(this.b);
        this.b = -1;
        this.c = ky7Var.s0;
    }
}
