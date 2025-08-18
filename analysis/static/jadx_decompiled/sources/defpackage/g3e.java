package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g3e extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ z2e Z;
    public final /* synthetic */ i3e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3e(z2e z2eVar, i3e i3eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = z2eVar;
        this.s0 = i3eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g3e(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        za3 za3VarE;
        int i2;
        tx3 tx3Var = tx3.a;
        int i3 = this.Y;
        z2e z2eVar = this.Z;
        i3e i3eVar = this.s0;
        if (i3 == 0) {
            od2.a0(obj);
            boolean z = !z2eVar.v0;
            md5 md5Var = (md5) i3eVar.Y.getValue();
            md5Var.getClass();
            long j = z2eVar.a;
            hm9.m("md5", "markAsFavorite: stickerId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
            rm4 rm4Var = md5Var.a;
            qa3 qa3Var = new qa3(z ? new qa3(new uqd(((hc5) rm4Var.get()).a(), new ta4(22), 0), 2, new kd5(md5Var, 4)) : wa3.a, 0, new qa3(((hc5) rm4Var.get()).a(), 2, new bc5(0, j, z)));
            if (z) {
                hm9.m("md5", "addToFavorites: stickerId=%d", Long.valueOf(j));
                hd5 hd5Var = (hd5) md5Var.g.get();
                hd5Var.getClass();
                za3VarE = new qa3(new oqd(new zc5(hd5Var, j, 1), 0).h(new gd1(12, cu.class)), 2, new nc5(18)).k(hd5Var.d);
                i = 1;
            } else {
                i = 1;
                za3VarE = md5Var.e(new long[]{j});
            }
            db3 db3VarG = new qa3(qa3Var, 0, za3VarE).f(new oc5(i, j, z)).g(new bc5(4, j, z));
            this.X = z ? 1 : 0;
            this.Y = i;
            if (s36.e(db3VarG, this) == tx3Var) {
                return tx3Var;
            }
            i2 = z ? 1 : 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.X;
            od2.a0(obj);
            i = 1;
        }
        i3eVar.x0.m(null, z2e.k(z2eVar, i2 != 0 ? i : 0, false, 7167));
        int i4 = i2 != 0 ? i : 0;
        pnf.o(i3eVar.w0, new qnd(i4 != 0 ? woc.n : woc.w, i4 != 0 ? cja.e : cja.f));
        return e5f.a;
    }
}
