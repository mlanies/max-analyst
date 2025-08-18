package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class ii1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ii1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.b.z0.c();
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                this.b.z0.c();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                this.b.z0.c();
                break;
        }
    }
}
