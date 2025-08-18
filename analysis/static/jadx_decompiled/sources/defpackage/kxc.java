package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class kxc extends e3 implements hp {
    public final ml0 h;
    public final ml0 i;
    public final ml0 j;
    public final ml0 k;
    public final q0e l;

    public kxc(Context context, mi5 mi5Var) {
        super(context, "app.prefs", mi5Var);
        this.h = ml0.z(Float.valueOf(this.g.getFloat("app.extra.text.size.sp", 0.0f)));
        this.i = ml0.z(Integer.valueOf(e("app.extra.text.size.mode", 1)));
        this.j = ml0.z(Integer.valueOf(p()));
        this.k = ml0.z(Integer.valueOf(o()));
        this.l = r0e.a(Boolean.valueOf(d("app.pinLock.screenshotEnabled", true)));
    }

    public final boolean n() {
        return this.g.getBoolean("app.media.load.roaming", false);
    }

    public final int o() {
        return e("app.notification.chats.show", 0);
    }

    public final int p() {
        return e("app.notification.dialogs.show", 0);
    }

    public final xdf q() {
        String string = this.g.getString("app.media.video.compress", null);
        return string == null ? xdf.c : xdf.valueOf(string);
    }

    public final boolean r() {
        return this.g.getBoolean("app.privacy.safe_mode", false);
    }

    public final void s(int i) {
        k(i, "app.notification.chats.show");
        if (i != 1) {
            k(i, "app.notification.chats.show.last");
        }
        this.k.e(Integer.valueOf(i));
    }

    public final void t(boolean z) {
        j("app.pinLock.screenshotEnabled", z);
        this.l.m(null, Boolean.valueOf(z));
    }
}
