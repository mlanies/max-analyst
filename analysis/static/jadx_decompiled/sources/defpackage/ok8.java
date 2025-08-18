package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class ok8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ ok8(imc imcVar, Pair pair, int i) {
        this.a = i;
        this.b = imcVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i74 i74Var = (i74) ((vk8) this.b.c).j;
                Pair pair = this.c;
                i74Var.z(((Integer) pair.first).intValue(), (yj8) pair.second);
                break;
            case 1:
                i74 i74Var2 = (i74) ((vk8) this.b.c).j;
                Pair pair2 = this.c;
                i74Var2.D(((Integer) pair2.first).intValue(), (yj8) pair2.second);
                break;
            case 2:
                i74 i74Var3 = (i74) ((vk8) this.b.c).j;
                Pair pair3 = this.c;
                i74Var3.H(((Integer) pair3.first).intValue(), (yj8) pair3.second);
                break;
            default:
                i74 i74Var4 = (i74) ((vk8) this.b.c).j;
                Pair pair4 = this.c;
                i74Var4.C(((Integer) pair4.first).intValue(), (yj8) pair4.second);
                break;
        }
    }
}
