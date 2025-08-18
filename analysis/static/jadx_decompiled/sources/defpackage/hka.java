package defpackage;

/* loaded from: classes2.dex */
public final class hka extends Thread {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hka(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vse vseVar = (vse) this.b;
                if (vseVar != null) {
                    vseVar.a(getPriority());
                }
                super.run();
                return;
            case 1:
                fqd fqdVar = (fqd) this.b;
                fqdVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (fqdVar.e());
                return;
            case 2:
                vn0 vn0Var = (vn0) this.b;
                vn0Var.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (vn0Var.j());
                return;
            default:
                ((k56) this.b).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hka(String str, Runnable runnable) {
        super(runnable, str);
        this.a = 0;
    }

    public hka(k56 k56Var) {
        this.a = 3;
        this.b = k56Var;
    }
}
