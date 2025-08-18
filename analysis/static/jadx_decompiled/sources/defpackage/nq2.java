package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nq2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nq2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pnf.o(((rq2) this.c).b1, new fp2(6, this.b, 0L, null));
                return e5f.a;
            case 1:
                return r0e.a((uj3) ((ds3) this.c).a.a.get(Long.valueOf(this.b)));
            case 2:
                return r0e.a(((blb) this.c).e.get(Long.valueOf(this.b)));
            case 3:
                if (((yha) obj) != yha.X) {
                    cnb cnbVar = (cnb) this.c;
                    pab pabVar = cnbVar.O0;
                    boolean z = pabVar.p() && pabVar.q();
                    s8g s8gVar = (s8g) cnbVar.X.getValue();
                    long j = this.b;
                    s8gVar.a(new g8d(j, z));
                    if (z) {
                        pnf.o(cnbVar.A0, new nkb(j, cnbVar.b));
                    }
                }
                return e5f.a;
            default:
                ((Long) obj).getClass();
                b8e b8eVar = (b8e) this.c;
                int i = 0;
                for (Object obj2 : ((l7e) b8eVar.t0.getValue()).b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        y53.R();
                        throw null;
                    }
                    ol7 ol7Var = (ol7) obj2;
                    boolean z2 = ol7Var instanceof w3e;
                    long j2 = this.b;
                    if ((z2 && ((w3e) ol7Var).a == j2) || ((ol7Var instanceof e02) && ((e02) ol7Var).b.a == j2)) {
                        b8eVar.w0.m(null, new k7e(j2, i, 0, 4));
                    }
                    i = i2;
                }
                return e5f.a;
        }
    }
}
