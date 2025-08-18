package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ad3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd3 b;
    public final /* synthetic */ hlf c;

    public /* synthetic */ ad3(bd3 bd3Var, hlf hlfVar, int i) {
        this.a = i;
        this.b = bd3Var;
        this.c = hlfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                this.c.getClass();
                break;
            case 1:
                this.b.getClass();
                this.c.M();
                break;
            default:
                this.b.getClass();
                this.c.onFirstFrameRendered();
                break;
        }
    }

    public /* synthetic */ ad3(bd3 bd3Var, hlf hlfVar, jlf jlfVar) {
        this.a = 0;
        this.b = bd3Var;
        this.c = hlfVar;
    }
}
