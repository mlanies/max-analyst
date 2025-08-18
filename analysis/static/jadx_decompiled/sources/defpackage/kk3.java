package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;

/* loaded from: classes.dex */
public final class kk3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lk3 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public kk3(lk3 lk3Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = lk3Var;
                super(9, bool);
                break;
            case 2:
                this.o = lk3Var;
                super(9, (Object) null);
                break;
            case 3:
                jk3 jk3Var = jk3.a;
                this.o = lk3Var;
                super(9, jk3Var);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.o = lk3Var;
                super(9, bool2);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    lk3 lk3Var = this.o;
                    if (lk3Var.P0.a() || zBooleanValue) {
                        ((View) lk3Var.P0.getValue()).setVisibility(zBooleanValue ? 0 : 8);
                        lk3.x(lk3Var);
                        break;
                    }
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue2) {
                    je7 je7Var = this.o.P0;
                    if (je7Var.a()) {
                        ((AppCompatCheckBox) je7Var.getValue()).setChecked(zBooleanValue2);
                        break;
                    }
                }
                break;
            case 2:
                fka fkaVarJ = (fka) obj2;
                if (!tpa.f((fka) obj, fkaVarJ)) {
                    lk3 lk3Var2 = this.o;
                    if (fkaVarJ == null) {
                        fkaVarJ = qp4.u0.j(lk3Var2);
                    }
                    lk3Var2.onThemeChanged(fkaVarJ);
                    break;
                }
                break;
            default:
                if (((jk3) obj) != ((jk3) obj2)) {
                    this.o.T();
                    break;
                }
                break;
        }
    }
}
