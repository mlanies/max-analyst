package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class z4g implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ int c;

    public /* synthetic */ z4g(Widget widget, int i, int i2) {
        this.a = i2;
        this.b = widget;
        this.c = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Widget.childSlotRouter$lambda$11(this.b, this.c, (j03) obj);
            default:
                return Widget.viewBinding$lambda$5(this.b, this.c, (View) obj);
        }
    }
}
