package defpackage;

import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class kva implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lva b;

    public /* synthetic */ kva(lva lvaVar, int i) {
        this.a = i;
        this.b = lvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lva lvaVar = this.b;
        switch (this.a) {
            case 0:
                lvaVar.d();
                break;
            default:
                lvaVar.getClass();
                try {
                    lvaVar.d();
                    break;
                } catch (Exception e) {
                    hm9.p("lva", "syncInternal: exception", e);
                    ((cba) lvaVar.h).c(new HandledException(e), true);
                }
        }
    }
}
