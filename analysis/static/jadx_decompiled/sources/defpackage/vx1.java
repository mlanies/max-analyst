package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class vx1 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                ce4 ce4Var = (ce4) obj3;
                ce4Var.getClass();
                kee keeVar = (kee) obj2;
                keeVar.close();
                Surface surface = (Surface) ce4Var.s0.remove(keeVar);
                if (surface != null) {
                    zm4 zm4Var = ce4Var.a;
                    o76.d((AtomicBoolean) zm4Var.c, true);
                    o76.c((Thread) zm4Var.e);
                    zm4Var.s(surface, true);
                    break;
                }
                break;
            case 2:
                vs4 vs4Var = (vs4) obj3;
                vs4Var.getClass();
                kee keeVar2 = (kee) obj2;
                keeVar2.close();
                Surface surface2 = (Surface) vs4Var.s0.remove(keeVar2);
                if (surface2 != null) {
                    ts4 ts4Var = vs4Var.a;
                    o76.d((AtomicBoolean) ts4Var.c, true);
                    o76.c((Thread) ts4Var.e);
                    ts4Var.s(surface2, true);
                    break;
                }
                break;
            case 3:
                gr7 gr7Var = (gr7) obj;
                fk9 fk9Var = (fk9) obj3;
                fk9Var.getClass();
                gr7Var.f = ((Boolean) obj2).booleanValue();
                fk9Var.Y.getClass();
                hm9.o("nr7", "background permissions is not supported yet");
                gr7Var.g = false;
                break;
            default:
                Throwable th = (Throwable) obj;
                adc adcVar = (adc) obj3;
                if (adcVar.W == null) {
                    if (th instanceof EncodeException) {
                        adcVar.f0 = 5;
                    } else {
                        adcVar.f0 = 6;
                    }
                    adcVar.W = th;
                    adcVar.H();
                    ((lq1) obj2).b(null);
                    break;
                }
                break;
        }
    }
}
