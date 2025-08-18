package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class a5g implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ a5g(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Widget.viewBinding$lambda$6(this.b, (View) obj, (l23) obj2);
            default:
                return Widget.binding$lambda$9(this.b, obj, (l23) obj2);
        }
    }
}
