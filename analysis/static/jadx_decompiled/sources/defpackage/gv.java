package defpackage;

/* loaded from: classes.dex */
public final class gv extends hm9 {
    public final /* synthetic */ hv o;

    public gv(hv hvVar) {
        this.o = hvVar;
    }

    @Override // defpackage.hm9
    public final Object A(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((ema) hvVar.X.b.c).r(obj, obj2);
    }

    @Override // defpackage.hm9
    public final int D() {
        return this.o.b.size();
    }

    @Override // defpackage.hm9
    public final int F() {
        return this.o.a.size();
    }

    @Override // defpackage.hm9
    public final boolean c(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((ema) hvVar.X.b.c).d(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.hm9
    public final boolean d(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((ema) hvVar.X.b.c).e(obj, obj2);
    }
}
