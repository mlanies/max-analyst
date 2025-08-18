package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class axe extends ViewOutlineProvider {
    public int a;
    public int b;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, this.a, view.getWidth(), view.getHeight() - this.b);
        view.setClipToOutline(true);
    }
}
