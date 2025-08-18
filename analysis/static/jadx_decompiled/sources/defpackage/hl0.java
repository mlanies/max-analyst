package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class hl0 extends qi3 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(ej3 ej3Var, int i) {
        super(ej3Var);
        this.f = i;
    }

    @Override // defpackage.qi3
    public final boolean a(h8g h8gVar) {
        switch (this.f) {
            case 0:
                return h8gVar.j.b;
            case 1:
                return h8gVar.j.d;
            case 2:
                return h8gVar.j.a == 2;
            case 3:
                int i = h8gVar.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return h8gVar.j.e;
        }
    }

    @Override // defpackage.qi3
    public final boolean b(Object obj) {
        switch (this.f) {
            case 2:
                xn9 xn9Var = (xn9) obj;
                if (!xn9Var.a || !xn9Var.b) {
                }
                break;
            case 3:
                xn9 xn9Var2 = (xn9) obj;
                if (!xn9Var2.a || xn9Var2.c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }
}
