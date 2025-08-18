package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ji0 implements r24 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public z24 o;

    public ji0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(y0fVar)) {
            return;
        }
        arrayList.add(y0fVar);
        this.c++;
    }

    public final void b(int i) {
        z24 z24Var = this.o;
        int i2 = maf.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((h84) ((y0f) this.b.get(i3))).e(z24Var, this.a, i);
        }
    }

    public final void c() {
        z24 z24Var = this.o;
        int i = maf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((h84) ((y0f) this.b.get(i2))).f(z24Var, this.a);
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((y0f) this.b.get(i)).getClass();
        }
    }

    public final void f(z24 z24Var) {
        this.o = z24Var;
        for (int i = 0; i < this.c; i++) {
            ((h84) ((y0f) this.b.get(i))).g(z24Var, this.a);
        }
    }
}
