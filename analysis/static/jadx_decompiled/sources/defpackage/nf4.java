package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class nf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nf4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xff
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                return;
            case 1:
                ((rk5) this.b).flush();
                return;
            case 2:
                rf4 rf4Var = (rf4) this.b;
                EGLDisplay eGLDisplay = rf4Var.c;
                va8 va8Var = rf4Var.b;
                try {
                    try {
                        rf4Var.d.a();
                        i = 0;
                    } catch (Exception e) {
                        z04.v("Error releasing shader program", e);
                    }
                    while (true) {
                        ArrayList arrayList = rf4Var.j;
                        if (i >= arrayList.size()) {
                            rf4Var.i.release();
                            try {
                                va8Var.C(eGLDisplay);
                                return;
                            } catch (GlUtil$GlException e2) {
                                z04.v("Error releasing GL objects", e2);
                                return;
                            }
                        }
                        ((gd6) arrayList.get(i)).release();
                        i++;
                    }
                } catch (Throwable th) {
                    try {
                        va8Var.C(eGLDisplay);
                    } catch (GlUtil$GlException e3) {
                        z04.v("Error releasing GL objects", e3);
                    }
                    throw th;
                }
            case 3:
                l0f l0fVar = ((soe) this.b).o;
                l0fVar.getClass();
                l0fVar.S();
                d54.a();
                return;
            case 4:
                ((l0f) this.b).h();
                return;
            default:
                ((v2) this.b).i();
                return;
        }
    }
}
