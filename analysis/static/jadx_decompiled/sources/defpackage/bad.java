package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class bad extends aad {
    public static bad d(o9f o9fVar, Size size) {
        if (((dv1) o9fVar.f(o9f.i0, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) o9fVar.f(cne.d0, o9fVar.toString())));
        }
        bad badVar = new bad();
        fad fadVar = (fad) o9fVar.f(o9f.g0, null);
        ce3 ce3Var = wma.c;
        int i = fad.a().g.c;
        if (fadVar != null) {
            i = fadVar.g.c;
            for (CameraDevice.StateCallback stateCallback : fadVar.c) {
                ArrayList arrayList = badVar.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : fadVar.d) {
                ArrayList arrayList2 = badVar.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            badVar.b.a(fadVar.g.e);
            ce3Var = fadVar.g.b;
        }
        u40 u40Var = badVar.b;
        u40Var.getClass();
        u40Var.f = mi9.c(ce3Var);
        if (o9fVar instanceof i8b) {
            Rational rational = j8b.a;
            if (((PreviewPixelHDRnetQuirk) zi4.a.e(PreviewPixelHDRnetQuirk.class)) != null && !j8b.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                mi9 mi9VarB = mi9.b();
                mi9VarB.j(cv1.v0(CaptureRequest.TONEMAP_MODE), 2);
                badVar.b.c(new cv1(8, wma.a(mi9VarB)));
            }
        }
        badVar.b.c = ((Integer) o9fVar.f(cv1.Z, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) o9fVar.f(cv1.t0, new ow1());
        ArrayList arrayList3 = badVar.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) o9fVar.f(cv1.u0, new sv1());
        ArrayList arrayList4 = badVar.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        jz1 jz1Var = new jz1((CameraCaptureSession.CaptureCallback) o9fVar.f(cv1.v0, new ku1()));
        badVar.b.b(jz1Var);
        ArrayList arrayList5 = badVar.e;
        if (!arrayList5.contains(jz1Var)) {
            arrayList5.add(jz1Var);
        }
        int iO = o9fVar.O();
        if (iO != 0) {
            u40 u40Var2 = badVar.b;
            u40Var2.getClass();
            if (iO != 0) {
                ((mi9) u40Var2.f).j(o9f.q0, Integer.valueOf(iO));
            }
        }
        int iX = o9fVar.X();
        if (iX != 0) {
            u40 u40Var3 = badVar.b;
            u40Var3.getClass();
            if (iX != 0) {
                ((mi9) u40Var3.f).j(o9f.p0, Integer.valueOf(iX));
            }
        }
        mi9 mi9VarB2 = mi9.b();
        aa0 aa0Var = cv1.w0;
        mi9VarB2.j(aa0Var, (String) o9fVar.f(aa0Var, null));
        aa0 aa0Var2 = cv1.s0;
        Long l = (Long) o9fVar.f(aa0Var2, -1L);
        l.getClass();
        mi9VarB2.j(aa0Var2, l);
        badVar.b.c(mi9VarB2);
        badVar.b.c(wd6.w(o9fVar).u());
        return badVar;
    }

    public final void a(ce3 ce3Var) {
        this.b.c(ce3Var);
    }

    public final void b(xf4 xf4Var, eu4 eu4Var, int i) {
        xe5 xe5VarA = rb0.a(xf4Var);
        xe5VarA.c = null;
        if (eu4Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        xe5VarA.Y = eu4Var;
        xe5VarA.o = Integer.valueOf(i);
        this.a.add(xe5VarA.a());
        ((HashSet) this.b.e).add(xf4Var);
    }

    public final fad c() {
        return new fad(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), this.f, this.g, this.h, this.i);
    }
}
