package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class nk8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ pc8 o;

    public /* synthetic */ nk8(imc imcVar, Pair pair, pc8 pc8Var, int i) {
        this.a = i;
        this.b = imcVar;
        this.c = pair;
        this.o = pc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i74 i74Var = (i74) ((vk8) this.b.c).j;
                Pair pair = this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                yj8 yj8Var = (yj8) pair.second;
                yj8Var.getClass();
                i74Var.A(iIntValue, yj8Var, this.o);
                break;
            default:
                i74 i74Var2 = (i74) ((vk8) this.b.c).j;
                Pair pair2 = this.c;
                i74Var2.L(((Integer) pair2.first).intValue(), (yj8) pair2.second, this.o);
                break;
        }
    }
}
