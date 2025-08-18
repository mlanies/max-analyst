package defpackage;

/* loaded from: classes.dex */
public final class c0d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0d b;

    public /* synthetic */ c0d(o0d o0dVar, int i) {
        this.a = i;
        this.b = o0dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h04 h04Var = this.b.mSuggestionsAdapter;
                if (h04Var instanceof qce) {
                    h04Var.b(null);
                    break;
                }
                break;
            default:
                this.b.updateFocusedState();
                break;
        }
    }
}
