package defpackage;

import one.me.sdk.zoom.ZoomableDraweeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class kag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ZoomableDraweeView b;

    public /* synthetic */ kag(ZoomableDraweeView zoomableDraweeView, int i) {
        this.a = i;
        this.b = zoomableDraweeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZoomableDraweeView zoomableDraweeView = this.b;
        switch (this.a) {
            case 0:
                int i = ZoomableDraweeView.F0;
                zoomableDraweeView.requestLayout();
                zoomableDraweeView.invalidate();
                break;
            default:
                int i2 = ZoomableDraweeView.F0;
                ta5.d(ZoomableDraweeView.class, Integer.valueOf(zoomableDraweeView.hashCode()), "onRelease: view %x");
                uf4 uf4Var = (uf4) zoomableDraweeView.E0;
                uf4Var.c = false;
                uf4Var.reset();
                break;
        }
    }
}
