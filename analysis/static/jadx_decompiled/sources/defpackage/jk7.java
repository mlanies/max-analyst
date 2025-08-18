package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jk7 implements m66 {
    public final /* synthetic */ kk7 a;

    public jk7(kk7 kk7Var) {
        this.a = kk7Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jk7) && (obj instanceof m66)) {
            return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        return new p66(2, 0, kk7.class, this.a, "onMessageElementClick", "onMessageElementClick(Landroid/view/View;Lru/ok/tamtam/models/MessageElementData;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
