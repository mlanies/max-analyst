package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class id7 implements zb4 {
    public final View a;
    public final hd7 b;
    public int c = 0;

    public id7(View view, gd7 gd7Var) {
        this.a = view;
        Objects.requireNonNull(view);
        this.b = new hd7(gd7Var, new v5(4, view));
    }

    @Override // defpackage.zb4
    public final void onPause(eh7 eh7Var) {
        hm9.k("id7", "onPause: unregisterGlobalLayoutListener");
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }

    @Override // defpackage.zb4
    public final void onResume(eh7 eh7Var) {
        hm9.k("id7", "onResume: registerGlobalLayoutListener");
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}
