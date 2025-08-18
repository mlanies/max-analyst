package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class b81 extends hm9 {
    public final /* synthetic */ int o;
    public final List p;
    public final List q;

    public /* synthetic */ b81(int i, List list, List list2) {
        this.o = i;
        this.p = list;
        this.q = list2;
    }

    @Override // defpackage.hm9
    public final int D() {
        switch (this.o) {
        }
        return this.q.size();
    }

    @Override // defpackage.hm9
    public final int F() {
        switch (this.o) {
        }
        return this.p.size();
    }

    @Override // defpackage.hm9
    public final boolean c(int i, int i2) {
        switch (this.o) {
            case 0:
                return tpa.f(this.p.get(i), this.q.get(i2));
            case 1:
                return tpa.f(this.p.get(i), this.q.get(i2));
            case 2:
                return this.p.get(i) == this.q.get(i2);
            default:
                return tpa.f(x53.j0(i, this.p), x53.j0(i2, this.q));
        }
    }

    @Override // defpackage.hm9
    public final boolean d(int i, int i2) {
        switch (this.o) {
            case 0:
                return ((w81) this.p.get(i)).c == ((w81) this.q.get(i2)).c;
            case 1:
                return tpa.f(((av5) this.p.get(i)).a, ((av5) this.q.get(i2)).a);
            case 2:
                return ((bd7) this.p.get(i)).c == ((bd7) this.q.get(i2)).c;
            default:
                uab uabVar = (uab) x53.j0(i, this.p);
                Long lValueOf = uabVar != null ? Long.valueOf(uabVar.a) : null;
                uab uabVar2 = (uab) x53.j0(i2, this.q);
                return tpa.f(lValueOf, uabVar2 != null ? Long.valueOf(uabVar2.a) : null);
        }
    }
}
