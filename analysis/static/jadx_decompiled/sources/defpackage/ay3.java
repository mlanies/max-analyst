package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class ay3 extends s47 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay3(String[] strArr, Object obj, int i) {
        super(strArr);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.s47
    public final void a(Set set) {
        switch (this.b) {
            case 0:
                ((e32) this.c).n(e5f.a);
                break;
            case 1:
                ds dsVarG0 = ds.g0();
                kmc kmcVar = ((lmc) this.c).u;
                if (!dsVarG0.h0()) {
                    dsVarG0.i0(kmcVar);
                    break;
                } else {
                    kmcVar.run();
                    break;
                }
            default:
                ((ez9) ((uz9) this.c)).d(ngg.c);
                break;
        }
    }
}
