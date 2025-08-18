package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class u93 extends m2 {
    public final Object a;
    public int b;
    public final /* synthetic */ v93 c;

    public u93(v93 v93Var, int i) {
        this.c = v93Var;
        Object obj = v93.u0;
        this.a = v93Var.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        v93 v93Var = this.c;
        if (i != -1 && i < v93Var.size()) {
            if (f46.B(obj, v93Var.i()[this.b])) {
                return;
            }
        }
        Object obj2 = v93.u0;
        this.b = v93Var.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        v93 v93Var = this.c;
        Map mapB = v93Var.b();
        if (mapB != null) {
            return mapB.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return v93Var.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v93 v93Var = this.c;
        Map mapB = v93Var.b();
        Object obj2 = this.a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            v93Var.put(obj2, obj);
            return null;
        }
        Object obj3 = v93Var.j()[i];
        v93Var.j()[this.b] = obj;
        return obj3;
    }
}
