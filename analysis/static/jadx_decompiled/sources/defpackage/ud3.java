package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class ud3 implements Iterator, qb7 {
    public final /* synthetic */ vd3 X;
    public final a66 a;
    public int b = -1;
    public Object c;
    public Object o;

    public ud3(vd3 vd3Var, a66 a66Var) {
        this.X = vd3Var;
        this.a = a66Var;
        a();
    }

    public final void a() {
        T t;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            vd3 vd3Var = this.X;
            if (i >= vd3Var.a) {
                return;
            }
            ui6 ui6Var = (ui6) vd3Var.d.get(i);
            if (ui6Var != null && (t = ui6Var.get()) != 0) {
                this.c = t;
                Object obj = vd3Var.e.get(this.b);
                if (obj instanceof a08) {
                    obj = ((a08) obj).a;
                }
                if (obj != null) {
                    this.o = obj;
                    return;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.X.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b >= this.X.a) {
            throw new NoSuchElementException();
        }
        Object obj = this.c;
        Object obj2 = e5f.a;
        if (obj == null) {
            obj = obj2;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            obj2 = obj3;
        }
        Object objInvoke = this.a.invoke(obj, obj2);
        a();
        return objInvoke;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Symbol symbol = zd3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
