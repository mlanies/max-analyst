package defpackage;

/* loaded from: classes.dex */
public final class r9 implements dab {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r9(dab dabVar, int i) {
        this.a = i;
        this.b = dabVar;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        switch (this.a) {
            case 0:
                ((dab) this.b).a(new q9(fi0Var, 0), eabVar);
                break;
            case 1:
                ((dab) this.b).a(new q9(fi0Var, 2), eabVar);
                break;
            case 2:
                ((dab) this.b).a(new q9(fi0Var, 3), eabVar);
                break;
            default:
                if (((oj0) eabVar).a.i != null) {
                    if (!c(0, fi0Var, eabVar)) {
                        fi0Var.g(1, null);
                        break;
                    }
                } else {
                    fi0Var.g(1, null);
                    break;
                }
                break;
        }
    }

    public boolean c(int i, fi0 fi0Var, eab eabVar) {
        nte[] nteVarArr;
        jic jicVar = ((oj0) eabVar).a.i;
        while (true) {
            nteVarArr = (nte[]) this.b;
            if (i >= nteVarArr.length) {
                i = -1;
                break;
            }
            if (nteVarArr[i].b(jicVar)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        nteVarArr[i].a(new mte(this, fi0Var, eabVar, i), eabVar);
        return true;
    }

    public r9(nte[] nteVarArr) {
        this.a = 3;
        nte[] nteVarArr2 = nteVarArr;
        this.b = nteVarArr2;
        od2.m(0, nteVarArr2.length);
    }
}
