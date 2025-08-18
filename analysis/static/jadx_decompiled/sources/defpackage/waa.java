package defpackage;

import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class waa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;

    public /* synthetic */ waa(OneMeDraweeView oneMeDraweeView, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                OneMeDraweeView oneMeDraweeView = this.b;
                oneMeDraweeView.requestLayout();
                oneMeDraweeView.invalidate();
                break;
            case 1:
                OneMeDraweeView oneMeDraweeView2 = this.b;
                oneMeDraweeView2.requestLayout();
                oneMeDraweeView2.invalidate();
                break;
            case 2:
                OneMeDraweeView oneMeDraweeView3 = this.b;
                oneMeDraweeView3.requestLayout();
                oneMeDraweeView3.invalidate();
                break;
            default:
                OneMeDraweeView oneMeDraweeView4 = this.b;
                oneMeDraweeView4.requestLayout();
                oneMeDraweeView4.invalidate();
                break;
        }
    }
}
