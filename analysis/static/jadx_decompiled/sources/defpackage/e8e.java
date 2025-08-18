package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class e8e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8e b;

    public /* synthetic */ e8e(h8e h8eVar, int i) {
        this.a = i;
        this.b = h8eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.X;
                if (!recyclerView.Z()) {
                    recyclerView.Y();
                    break;
                }
                break;
            default:
                this.b.v0.set(true);
                break;
        }
    }
}
