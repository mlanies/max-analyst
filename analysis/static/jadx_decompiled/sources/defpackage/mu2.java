package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final /* synthetic */ class mu2 implements on5, m66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objA = ((on5) this.b).a((mt2) obj, continuation);
                if (objA != tx3.a) {
                    break;
                }
                break;
            default:
                Object objO = ((fab) ((iab) this.b)).a.o((v6f) obj, continuation);
                if (objO != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof on5) && (obj instanceof m66)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof on5) && (obj instanceof m66)) {
                    break;
                }
                break;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new p66(2, 0, on5.class, (on5) this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new p66(2, 0, iab.class, (iab) this.b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
