package defpackage;

import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;

/* loaded from: classes2.dex */
public final class hr2 extends e0 implements ox3 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr2(kx3 kx3Var, int i) {
        super(kx3Var);
        this.a = i;
    }

    @Override // defpackage.ox3
    public final void g(lx3 lx3Var, Throwable th) {
        switch (this.a) {
            case 0:
                hm9.r("jr2", th, "fail in %s", lx3Var);
                break;
            default:
                ChromaIllegalApplyThemeException chromaIllegalApplyThemeException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
                if (chromaIllegalApplyThemeException == null) {
                    chromaIllegalApplyThemeException = new ChromaIllegalApplyThemeException(th);
                }
                bcf.a.c().a("ONEME-8759", chromaIllegalApplyThemeException);
                break;
        }
    }
}
