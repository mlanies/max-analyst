package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* loaded from: classes.dex */
public final class o68 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final m68 d = new m68(this);
    public final us e = new us(0);
    public y7g f;
    public Messenger g;
    public ai8 h;

    public o68(Context context, ComponentName componentName, jo7 jo7Var) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        jo7Var.b = this;
        n68 n68Var = (n68) jo7Var.a;
        n68Var.getClass();
        this.b = new MediaBrowser(context, componentName, n68Var, bundle);
    }
}
