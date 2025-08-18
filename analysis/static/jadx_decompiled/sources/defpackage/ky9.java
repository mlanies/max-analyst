package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ky9 extends ps0 {
    public LinkedList f;

    @Override // defpackage.ps0
    public final void a(Object obj) {
        jy9 jy9Var = (jy9) this.f.poll();
        if (jy9Var == null) {
            jy9Var = new jy9();
            jy9Var.a = null;
            jy9Var.b = null;
            jy9Var.c = null;
        }
        jy9Var.a = new SoftReference(obj);
        jy9Var.b = new SoftReference(obj);
        jy9Var.c = new SoftReference(obj);
        this.c.add(jy9Var);
    }

    @Override // defpackage.ps0
    public final Object b() {
        jy9 jy9Var = (jy9) this.c.poll();
        jy9Var.getClass();
        SoftReference softReference = jy9Var.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = jy9Var.a;
        if (softReference2 != null) {
            softReference2.clear();
            jy9Var.a = null;
        }
        SoftReference softReference3 = jy9Var.b;
        if (softReference3 != null) {
            softReference3.clear();
            jy9Var.b = null;
        }
        SoftReference softReference4 = jy9Var.c;
        if (softReference4 != null) {
            softReference4.clear();
            jy9Var.c = null;
        }
        this.f.add(jy9Var);
        return obj;
    }
}
