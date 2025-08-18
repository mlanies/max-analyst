package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class d17 extends u2 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ e17 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d17(e17 e17Var) {
        super(9, (Object) null);
        this.o = e17Var;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    if (drawable != null) {
                        drawable.setBounds(this.o.getBounds());
                        break;
                    }
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    e17 e17Var = this.o;
                    e17Var.d.setColor(iIntValue);
                    e17Var.invalidateSelf();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d17(Integer num, e17 e17Var) {
        super(9, num);
        this.o = e17Var;
    }
}
