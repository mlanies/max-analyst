package defpackage;

/* loaded from: classes2.dex */
public final class via extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wia o;

    /* JADX WARN: Illegal instructions before constructor call */
    public via(wia wiaVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                ria riaVar = ria.a;
                this.o = wiaVar;
                super(9, riaVar);
                break;
            default:
                lia liaVar = lia.a;
                this.o = wiaVar;
                super(9, liaVar);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                oia oiaVar = (oia) obj2;
                if (!tpa.f((oia) obj, oiaVar)) {
                    wia wiaVar = this.o;
                    wiaVar.setLeft(oiaVar);
                    wiaVar.y();
                    break;
                }
                break;
            default:
                tia tiaVar = (tia) obj2;
                if (!tpa.f((tia) obj, tiaVar)) {
                    wia wiaVar2 = this.o;
                    wiaVar2.setRight(tiaVar);
                    wiaVar2.y();
                    break;
                }
                break;
        }
    }
}
