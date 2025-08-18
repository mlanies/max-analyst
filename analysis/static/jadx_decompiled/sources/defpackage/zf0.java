package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;
import me.leolin.shortcutbadger.ShortcutBadger;

/* loaded from: classes.dex */
public final class zf0 implements qu7 {
    public final Context a;
    public final iy2 b;
    public final ci0 c;
    public final ContextScope o;

    public zf0(Context context, iy2 iy2Var, ci0 ci0Var, kke kkeVar, ox3 ox3Var) {
        this.a = context;
        this.b = iy2Var;
        this.c = ci0Var;
        this.o = j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "badge-count").plus(ox3Var));
    }

    @Override // defpackage.qu7
    public final void a() {
        ShortcutBadger.removeCount(this.a);
    }
}
