package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* loaded from: classes.dex */
public final /* synthetic */ class gee implements wu {
    public final /* synthetic */ yb0 X;
    public final /* synthetic */ iee a;
    public final /* synthetic */ hee b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yb0 o;

    public /* synthetic */ gee(iee ieeVar, hee heeVar, int i, yb0 yb0Var, yb0 yb0Var2) {
        this.a = ieeVar;
        this.b = heeVar;
        this.c = i;
        this.o = yb0Var;
        this.X = yb0Var2;
    }

    @Override // defpackage.wu
    public final bm7 apply(Object obj) {
        hee heeVar = this.b;
        Surface surface = (Surface) obj;
        iee ieeVar = this.a;
        ieeVar.getClass();
        surface.getClass();
        try {
            heeVar.d();
            kee keeVar = new kee(surface, this.c, ieeVar.g.a, this.o, this.X);
            keeVar.u0.b.d(new fee(heeVar, 1), ju0.k());
            c54.p("Consumer can only be linked once.", heeVar.q == null);
            heeVar.q = keeVar;
            return kq0.r(keeVar);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new dw6(1, e);
        }
    }
}
