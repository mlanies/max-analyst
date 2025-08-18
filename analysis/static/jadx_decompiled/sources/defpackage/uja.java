package defpackage;

/* loaded from: classes.dex */
public final class uja extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ vja o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uja(y5a y5aVar, vja vjaVar) {
        super(9, y5aVar);
        this.o = vjaVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f((y5a) obj, (y5a) obj2)) {
                    vja.a(this.o);
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    vja.a(this.o);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uja(vja vjaVar) {
        Boolean bool = Boolean.TRUE;
        this.o = vjaVar;
        super(9, bool);
    }
}
