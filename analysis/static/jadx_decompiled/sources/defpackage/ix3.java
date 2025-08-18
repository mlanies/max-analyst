package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class ix3 extends ViewOutlineProvider {
    public float a;

    public ix3(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        view.setClipToOutline(true);
    }
}
