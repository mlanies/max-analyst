package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class wy6 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ wy6(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        int i = 2;
        e5f e5fVar = e5f.a;
        int i2 = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    hm9.p(fz6.E0, "prefetch " + i2 + " fetchVirtualAlbums() completed by error", th);
                }
                return e5fVar;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    hm9.p(fz6.E0, "prefetch " + i2 + " fetchRealAlbums() completed by error", th2);
                }
                return e5fVar;
            case 2:
                bc7[] bc7VarArr = OneMeButton.B0;
                return Boolean.valueOf(((View) obj).getId() != i2);
            default:
                l17 l17Var = (l17) obj;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new vtd(l17Var, objArr == true ? 1 : 0));
                valueAnimatorOfFloat.addListener(new qg(i2, i, l17Var));
                valueAnimatorOfFloat.start();
                return e5fVar;
        }
    }

    public /* synthetic */ wy6(bud budVar, int i) {
        this.a = 3;
        this.b = i;
    }
}
