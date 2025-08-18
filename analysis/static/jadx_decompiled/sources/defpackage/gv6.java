package defpackage;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.a;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class gv6 extends a implements Closeable, iqf {
    public final hc9 a;
    public final d b;
    public final xu3 c;

    public gv6(hc9 hc9Var, d dVar, xu3 xu3Var) {
        this.a = hc9Var;
        this.b = dVar;
        this.c = xu3Var;
    }

    @Override // defpackage.iqf
    public final void a(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        xu3 xu3Var = this.c;
        hc9 hc9Var = this.a;
        d dVar = this.b;
        if (z) {
            hc9Var.now();
            dVar.getClass();
            nqf nqfVar = nqf.b;
            dVar.getClass();
            dVar.getClass();
            if (!xu3Var.a || (copyOnWriteArrayList2 = (CopyOnWriteArrayList) xu3Var.h) == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            c cVarB2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) xu3Var.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(cVarB2, nqfVar);
            }
            return;
        }
        hc9Var.now();
        dVar.getClass();
        nqf nqfVar2 = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (!xu3Var.a || (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3Var.h) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        c cVarB22 = dVar.b2();
        Iterator it2 = ((CopyOnWriteArrayList) xu3Var.h).iterator();
        while (it2.hasNext()) {
            ((ImagePerfDataListener) it2.next()).onImageVisibilityUpdated(cVarB22, nqfVar2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.Z1();
    }

    @Override // defpackage.iqf
    public final void onDraw() {
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onEmptyEvent(Object obj) {
        vu6 vu6Var = vu6.X;
        d dVar = this.b;
        dVar.getClass();
        this.c.p(dVar, vu6Var);
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.getClass();
        vu6 vu6Var = vu6.o;
        xu3 xu3Var = this.c;
        xu3Var.p(dVar, vu6Var);
        nqf nqfVar = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (!xu3Var.a || (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3Var.h) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        c cVarB2 = dVar.b2();
        Iterator it = ((CopyOnWriteArrayList) xu3Var.h).iterator();
        while (it.hasNext()) {
            ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(cVarB2, nqfVar);
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (ru6) obj;
        this.c.p(dVar, vu6.c);
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onIntermediateImageSet(String str, Object obj) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (ru6) obj;
        this.c.p(dVar, vu6.b);
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onRelease(String str, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        vu6 vu6Var = vu6.Y;
        xu3 xu3Var = this.c;
        xu3Var.p(dVar, vu6Var);
        nqf nqfVar = nqf.c;
        dVar.getClass();
        dVar.getClass();
        if (!xu3Var.a || (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3Var.h) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        c cVarB2 = dVar.b2();
        Iterator it = ((CopyOnWriteArrayList) xu3Var.h).iterator();
        while (it.hasNext()) {
            ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(cVarB2, nqfVar);
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public final void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.a2();
        dVar.getClass();
        dVar.c = str;
        dVar.X = obj;
        dVar.getClass();
        vu6 vu6Var = vu6.a;
        xu3 xu3Var = this.c;
        xu3Var.p(dVar, vu6Var);
        nqf nqfVar = nqf.b;
        dVar.getClass();
        dVar.getClass();
        if (!xu3Var.a || (copyOnWriteArrayList = (CopyOnWriteArrayList) xu3Var.h) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        c cVarB2 = dVar.b2();
        Iterator it = ((CopyOnWriteArrayList) xu3Var.h).iterator();
        while (it.hasNext()) {
            ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(cVarB2, nqfVar);
        }
    }
}
