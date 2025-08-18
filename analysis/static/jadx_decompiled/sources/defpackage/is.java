package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class is implements dq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;

    public is(js jsVar, int i) {
        this.b = jsVar;
        this.a = i;
    }

    @Override // defpackage.dq4
    public final Drawable f(Drawable drawable) {
        return this.b.b(drawable, this.a);
    }

    @Override // defpackage.dq4
    public final Drawable j() {
        return this.b.a(this.a);
    }
}
