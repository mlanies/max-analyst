package defpackage;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class zdg extends keg {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c = 2;

    public zdg(Activity activity, Intent intent) {
        this.a = intent;
        this.b = activity;
    }

    @Override // defpackage.keg
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
