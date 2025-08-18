package defpackage;

import java.util.ArrayList;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public final /* synthetic */ class yw0 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ yw0(cx0 cx0Var, int i) {
        this.a = i;
        this.b = cx0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                cx0 cx0Var = this.b;
                cx0Var.getClass();
                hm9.k("cx0", "onViewCreated: finished");
                cx0Var.h.m(((ax0) obj).b);
                return;
            case 1:
            default:
                cx0 cx0Var2 = this.b;
                synchronized (cx0Var2) {
                    cx0Var2.j = null;
                }
                return;
            case 2:
                cx0 cx0Var3 = this.b;
                cx0Var3.getClass();
                hm9.k("cx0", "onClearCacheTypesPicked: success");
                bx0 bx0Var = cx0Var3.h;
                ((FrgBase) bx0Var).j1();
                bx0Var.I();
                bx0Var.m(((ax0) obj).b);
                return;
            case 3:
                cx0 cx0Var4 = this.b;
                cx0Var4.getClass();
                hm9.p("cx0", "onClearCacheTypesPicked: failed", (Throwable) obj);
                bx0 bx0Var2 = cx0Var4.h;
                ((FrgBase) bx0Var2).j1();
                bx0Var2.J();
                return;
            case 4:
                ax0 ax0Var = (ax0) obj;
                cx0 cx0Var5 = this.b;
                cx0Var5.getClass();
                hm9.n("cx0", "onClearCacheClicked: finished");
                bx0 bx0Var3 = cx0Var5.h;
                ((FrgBase) bx0Var3).j1();
                bx0Var3.m(ax0Var.b);
                bx0Var3.f((ArrayList) ax0Var.c);
                return;
            case 5:
                cx0 cx0Var6 = this.b;
                cx0Var6.getClass();
                hm9.p("cx0", "onClearCacheClicked: failed", (Throwable) obj);
                bx0 bx0Var4 = cx0Var6.h;
                ((FrgBase) bx0Var4).j1();
                bx0Var4.J();
                return;
            case 6:
                cx0 cx0Var7 = this.b;
                ax0 ax0Var2 = (ax0) obj;
                synchronized (cx0Var7) {
                    cx0Var7.k = ax0Var2;
                }
                return;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        qy9 qy9VarC;
        cx0 cx0Var = this.b;
        synchronized (cx0Var) {
            cx0Var.j = null;
            qy9VarC = cx0Var.c();
        }
        return qy9VarC;
    }
}
