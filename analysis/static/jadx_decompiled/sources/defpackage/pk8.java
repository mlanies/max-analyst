package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class pk8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ yn7 o;

    public /* synthetic */ pk8(imc imcVar, Pair pair, yn7 yn7Var, pc8 pc8Var, int i) {
        this.a = i;
        this.b = imcVar;
        this.c = pair;
        this.o = yn7Var;
        this.X = pc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i74 i74Var = (i74) ((vk8) this.b.c).j;
                Pair pair = this.c;
                i74Var.r(((Integer) pair.first).intValue(), (yj8) pair.second, this.o, this.X);
                break;
            case 1:
                i74 i74Var2 = (i74) ((vk8) this.b.c).j;
                Pair pair2 = this.c;
                i74Var2.x(((Integer) pair2.first).intValue(), (yj8) pair2.second, this.o, this.X);
                break;
            default:
                i74 i74Var3 = (i74) ((vk8) this.b.c).j;
                Pair pair3 = this.c;
                i74Var3.t(((Integer) pair3.first).intValue(), (yj8) pair3.second, this.o, this.X);
                break;
        }
    }
}
