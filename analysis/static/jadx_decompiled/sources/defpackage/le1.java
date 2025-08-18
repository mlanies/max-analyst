package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class le1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ me1 c;

    public /* synthetic */ le1(m56 m56Var, me1 me1Var, int i) {
        this.a = i;
        this.b = m56Var;
        this.c = me1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
    }
}
