package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ej8 implements pj8, qj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ej8(sj8 sj8Var, int i, int i2) {
        this.a = i2;
        this.b = sj8Var;
        this.c = i;
    }

    @Override // defpackage.qj8
    public void b(x4b x4bVar, oh8 oh8Var, List list) {
        switch (this.a) {
            case 1:
                x4bVar.d0(this.b.J0(oh8Var, x4bVar, this.c), list);
                break;
            case 2:
                sj8 sj8Var = this.b;
                sj8Var.getClass();
                int size = list.size();
                int i = this.c;
                if (size != 1) {
                    x4bVar.s0(list, sj8Var.J0(oh8Var, x4bVar, i), sj8Var.J0(oh8Var, x4bVar, i + 1));
                    break;
                } else {
                    x4bVar.A0(sj8Var.J0(oh8Var, x4bVar, i), (tb8) list.get(0));
                    break;
                }
            default:
                x4bVar.d0(this.b.J0(oh8Var, x4bVar, this.c), list);
                break;
        }
    }

    @Override // defpackage.pj8
    public void f(x4b x4bVar, oh8 oh8Var) {
        switch (this.a) {
            case 0:
                x4bVar.Z(this.b.J0(oh8Var, x4bVar, this.c));
                break;
            default:
                x4bVar.S(this.b.J0(oh8Var, x4bVar, this.c));
                break;
        }
    }
}
