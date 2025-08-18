package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class ix7 extends FrameLayout {
    public final /* synthetic */ MainScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix7(MainScreen mainScreen, Context context) {
        super(context);
        this.a = mainScreen;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        x6g x6gVarF = x6g.f(null, windowInsets);
        v27 v27VarF = x6gVarF.a.f(7);
        View childAt = getChildAt(0);
        FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
        if (frameLayout == null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        huc hucVar = MainScreen.Z;
        this.a.o0().dispatchApplyWindowInsets(windowInsets);
        u6a.b.getClass();
        int iA = qx7.a(this);
        o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVarF) : new m6g(x6gVarF);
        n6gVar.c(7, v27.b(v27VarF.a, v27VarF.b, v27VarF.c, v27VarF.d + iA));
        frameLayout.dispatchApplyWindowInsets(n6gVar.b().e());
        return windowInsets;
    }
}
