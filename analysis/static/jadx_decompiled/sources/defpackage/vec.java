package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class vec {
    public final /* synthetic */ wec a;

    public vec(wec wecVar) {
        this.a = wecVar;
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        wec wecVar = this.a;
        wecVar.g = string;
        wecVar.h = bundle.getString("transferableTitle");
    }
}
