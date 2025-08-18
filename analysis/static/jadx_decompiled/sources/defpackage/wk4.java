package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wk4 extends pj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pj0
    public final void a() {
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.b).set(true);
                break;
            default:
                r6b r6bVar = (r6b) this.b;
                if (r6bVar.n()) {
                    r6bVar.b.c();
                    break;
                }
                break;
        }
    }
}
