package defpackage;

/* loaded from: classes2.dex */
public final class n5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;

    public /* synthetic */ n5a(s5a s5aVar, int i) {
        this.a = i;
        this.b = s5aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s5a s5aVar = this.b;
                k56 k56Var = s5aVar.C0;
                if (k56Var != null) {
                    k56Var.invoke();
                }
                s5aVar.invalidate();
                break;
            default:
                s5a s5aVar2 = this.b;
                k56 k56Var2 = s5aVar2.C0;
                if (k56Var2 != null) {
                    k56Var2.invoke();
                }
                s5aVar2.invalidate();
                break;
        }
    }
}
