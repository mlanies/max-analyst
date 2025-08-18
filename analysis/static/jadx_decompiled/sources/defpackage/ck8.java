package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ck8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ ik8 c;
    public final /* synthetic */ yn7 o;

    public /* synthetic */ ck8(jn jnVar, ik8 ik8Var, yn7 yn7Var, pc8 pc8Var, int i) {
        this.a = i;
        this.b = jnVar;
        this.c = ik8Var;
        this.o = yn7Var;
        this.X = pc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                this.c.x(jnVar.b, (yj8) jnVar.c, this.o, this.X);
                break;
            case 1:
                jn jnVar2 = this.b;
                this.c.t(jnVar2.b, (yj8) jnVar2.c, this.o, this.X);
                break;
            default:
                jn jnVar3 = this.b;
                this.c.r(jnVar3.b, (yj8) jnVar3.c, this.o, this.X);
                break;
        }
    }
}
