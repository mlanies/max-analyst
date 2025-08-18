package defpackage;

/* loaded from: classes2.dex */
public final class y5c extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z5c o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5c(v5c v5cVar, z5c z5cVar) {
        super(9, v5cVar);
        this.c = 1;
        this.o = z5cVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    z5c z5cVar = this.o;
                    if (!zBooleanValue && zBooleanValue2) {
                        z5cVar.a(true);
                        break;
                    } else {
                        z5cVar.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    this.o.w0.setText(((v5c) obj2).a);
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    this.o.x0.g(iIntValue, true);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y5c(z5c z5cVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                this.o = z5cVar;
                super(9, (Object) 0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.o = z5cVar;
                super(9, bool);
                break;
        }
    }
}
