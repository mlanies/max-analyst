package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class k68 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ k68(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                MediaBarWidget.o0(mediaBarWidget);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7VarArr = MediaBarWidget.d1;
                if (!mediaBarWidget.B0().s()) {
                    f6b f6bVarX0 = mediaBarWidget.x0();
                    int i9 = f6b.w0;
                    f6bVarX0.setHalfScreen(null);
                    break;
                } else {
                    mediaBarWidget.x0().k();
                    break;
                }
        }
    }
}
