package defpackage;

import android.content.Context;
import android.view.View;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;

/* loaded from: classes2.dex */
public final class sk9 extends v2 implements an4 {
    public vm4 X;
    public vm4 Y;
    public final tg o;

    public sk9(Context context, DoubleTapVideoViewWrapper doubleTapVideoViewWrapper, tg tgVar) {
        super(context);
        this.o = tgVar;
        this.c = doubleTapVideoViewWrapper;
        m();
        doubleTapVideoViewWrapper.setTouchEventListener(this);
    }

    public final void A(rk9 rk9Var) {
        if (!rk9Var.c) {
            this.X.a();
            this.Y.a();
            return;
        }
        boolean z = rk9Var.b;
        int i = rk9Var.a;
        if (z) {
            this.X.a();
            this.Y.b();
            this.Y.c(i);
        } else {
            this.X.b();
            this.X.c(i);
            this.Y.a();
        }
    }

    @Override // defpackage.v2
    public final void m() {
        this.X = (vm4) ((View) this.c).findViewById(xxb.double_tap_video_view_wrapper__arrows_view_left);
        this.Y = (vm4) ((View) this.c).findViewById(xxb.double_tap_video_view_wrapper__arrows_view_right);
        vm4 vm4Var = this.X;
        tg tgVar = this.o;
        vm4Var.setAnimations(tgVar);
        this.Y.setAnimations(tgVar);
    }
}
