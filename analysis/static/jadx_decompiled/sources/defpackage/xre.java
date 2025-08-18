package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class xre extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ zre o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xre(Object obj, zre zreVar, int i) {
        super(9, obj);
        this.c = i;
        this.o = zreVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    zre zreVar = this.o;
                    zreVar.onThemeChanged(zreVar.getTheme());
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    this.o.setBackground((Drawable) obj2);
                    break;
                }
                break;
        }
    }
}
