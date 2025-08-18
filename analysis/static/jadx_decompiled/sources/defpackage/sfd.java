package defpackage;

/* loaded from: classes2.dex */
public final class sfd extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ ufd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfd(xed xedVar, ufd ufdVar) {
        super(9, xedVar);
        this.o = ufdVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                kfd kfdVar = (kfd) obj2;
                if (!tpa.f((kfd) obj, kfdVar)) {
                    ufd ufdVar = this.o;
                    ufd.E(ufdVar, kfdVar);
                    ufdVar.onThemeChanged(qp4.u0.j(ufdVar));
                    break;
                }
                break;
            default:
                if (((pfd) obj) != ((pfd) obj2)) {
                    ufd ufdVar2 = this.o;
                    ufdVar2.onThemeChanged(ufdVar2.getCurrentTheme());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sfd(ufd ufdVar) {
        pfd pfdVar = pfd.a;
        this.o = ufdVar;
        super(9, pfdVar);
    }
}
