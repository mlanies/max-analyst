package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ag8;
import defpackage.eh8;
import defpackage.k7;
import defpackage.of8;
import defpackage.wg8;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends k7 {
    public final eh8 b;
    public final wg8 c;
    public final ag8 d;
    public of8 e;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.c = wg8.c;
        this.d = ag8.a;
        this.b = eh8.d(context);
        new WeakReference(this);
    }

    @Override // defpackage.k7
    public final boolean b() {
        wg8 wg8Var = this.c;
        this.b.getClass();
        return eh8.e(wg8Var);
    }

    @Override // defpackage.k7
    public final View c() {
        of8 of8Var = new of8(this.a);
        this.e = of8Var;
        of8Var.setCheatSheetEnabled(true);
        this.e.setRouteSelector(this.c);
        this.e.setAlwaysVisible(false);
        this.e.setDialogFactory(this.d);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.e;
    }

    @Override // defpackage.k7
    public final boolean e() {
        of8 of8Var = this.e;
        if (of8Var != null) {
            return of8Var.d();
        }
        return false;
    }

    @Override // defpackage.k7
    public final boolean g() {
        return true;
    }
}
