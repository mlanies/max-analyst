package defpackage;

/* loaded from: classes.dex */
public final class ib3 extends iqd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ib3(iqd iqdVar, pa3 pa3Var) {
        this.a = 3;
        this.c = iqdVar;
        this.b = pa3Var;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new ph4((Object) this, (Object) erdVar, false));
                break;
            case 1:
                ((f38) this.b).a(new h38(erdVar, (iqd) this.c, 0));
                break;
            case 2:
                ((f38) this.b).a(new cb3(erdVar, 3, this.c));
                break;
            case 3:
                ((pa3) this.b).i(new h38(erdVar, (iqd) this.c, 1));
                break;
            case 4:
                ((iqd) this.b).k(new iq1(erdVar, (f6) this.c));
                break;
            case 5:
                ((iqd) this.b).k(new b9b(this, erdVar, false, 6));
                break;
            default:
                iqd[] iqdVarArr = (iqd[]) this.b;
                int length = iqdVarArr.length;
                if (length == 1) {
                    iqdVarArr[0].k(new l7b(erdVar, new gd1(20, this), false, 7));
                    break;
                } else {
                    hsd hsdVar = new hsd(length, (b66) this.c, erdVar);
                    erdVar.c(hsdVar);
                    for (int i = 0; i < length && !hsdVar.h(); i++) {
                        iqd iqdVar = iqdVarArr[i];
                        if (iqdVar == null) {
                            hsdVar.a(new NullPointerException("One of the sources is null"), i);
                            break;
                        } else {
                            iqdVar.k(hsdVar.c[i]);
                        }
                    }
                }
        }
    }

    public /* synthetic */ ib3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
