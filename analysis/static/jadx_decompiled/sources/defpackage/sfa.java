package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class sfa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfa b;

    public /* synthetic */ sfa(tfa tfaVar, int i) {
        this.a = i;
        this.b = tfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tfa tfaVar = this.b;
                if (!tfaVar.c.get()) {
                    tfaVar.b.execute(new u60((Object) tfaVar, true, 10));
                    break;
                }
                break;
            default:
                tfa tfaVar2 = this.b;
                if (!tfaVar2.c.get()) {
                    tfaVar2.b.execute(new u60((Object) tfaVar2, false, 10));
                    break;
                }
                break;
        }
    }
}
