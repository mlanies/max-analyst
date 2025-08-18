package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iu1 implements yw1 {
    public final String a;
    public final xv1 b;
    public final wd6 c;
    public st1 e;
    public final hu1 h;
    public final bj6 j;
    public final ay k;
    public final Object d = new Object();
    public hu1 f = null;
    public hu1 g = null;
    public ArrayList i = null;

    public iu1(dx1 dx1Var, String str) {
        str.getClass();
        this.a = str;
        xv1 xv1VarA = dx1Var.a(str);
        this.b = xv1VarA;
        wd6 wd6Var = new wd6(6, false);
        wd6Var.b = this;
        this.c = wd6Var;
        bj6 bj6VarI = ft.i(xv1VarA);
        this.j = bj6VarI;
        this.k = new ay(str, bj6VarI);
        this.h = new hu1(new u90(5, null));
    }

    @Override // defpackage.yw1
    public final Set a() {
        return ((iu4) o9g.x(this.b).b).a();
    }

    @Override // defpackage.yw1
    public final int b() {
        return l(0);
    }

    @Override // defpackage.yw1
    public final boolean c() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yw1
    public final String d() {
        return this.a;
    }

    @Override // defpackage.yw1
    public final xm7 e() {
        synchronized (this.d) {
            try {
                st1 st1Var = this.e;
                if (st1Var == null) {
                    if (this.f == null) {
                        this.f = new hu1(0);
                    }
                    return this.f;
                }
                hu1 hu1Var = this.f;
                if (hu1Var != null) {
                    return hu1Var;
                }
                return st1Var.j.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yw1
    public final int g() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        c54.j("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(wg0.g(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // defpackage.yw1
    public final bue h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? bue.a : bue.b;
    }

    @Override // defpackage.yw1
    public final String j() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.yw1
    public final List k(int i) {
        c8d c8dVarB = this.b.b();
        HashMap map = (HashMap) c8dVarB.o;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) ((fd7) c8dVarB.a).a).getHighResolutionOutputSizes(i);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = ((y7g) c8dVarB.b).p(highResolutionOutputSizes, i);
            }
            map.put(Integer.valueOf(i), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) map.get(Integer.valueOf(i))) != null) {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.emptyList();
    }

    @Override // defpackage.yw1
    public final int l(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return kp.m(kp.C(i), num.intValue(), 1 == g());
    }

    @Override // defpackage.yw1
    public final boolean m() {
        xv1 xv1Var = this.b;
        Objects.requireNonNull(xv1Var);
        return kq0.s(new ync(23, xv1Var));
    }

    @Override // defpackage.yw1
    public final void n(ok4 ok4Var, pt1 pt1Var) {
        synchronized (this.d) {
            try {
                st1 st1Var = this.e;
                if (st1Var != null) {
                    st1Var.c.execute(new f5(st1Var, ok4Var, pt1Var, 12));
                } else {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(pt1Var, ok4Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yw1
    public final e15 o() {
        return this.k;
    }

    @Override // defpackage.yw1
    public final bj6 p() {
        return this.j;
    }

    @Override // defpackage.yw1
    public final List q(int i) {
        Size[] sizeArrS = this.b.b().s(i);
        return sizeArrS != null ? Arrays.asList(sizeArrS) : Collections.emptyList();
    }

    @Override // defpackage.yw1
    public final xm7 r() {
        synchronized (this.d) {
            try {
                st1 st1Var = this.e;
                if (st1Var != null) {
                    hu1 hu1Var = this.g;
                    if (hu1Var != null) {
                        return hu1Var;
                    }
                    return (ci9) st1Var.i.X;
                }
                if (this.g == null) {
                    cag cagVarB = od.b(this.b);
                    hag hagVar = new hag(cagVarB.c(), cagVarB.d());
                    hagVar.f(1.0f);
                    this.g = new hu1(sa0.e(hagVar));
                }
                return this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yw1
    public final void s(iv1 iv1Var) {
        synchronized (this.d) {
            try {
                st1 st1Var = this.e;
                if (st1Var != null) {
                    st1Var.c.execute(new c(st1Var, 27, iv1Var));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == iv1Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(st1 st1Var) {
        synchronized (this.d) {
            try {
                this.e = st1Var;
                hu1 hu1Var = this.g;
                if (hu1Var != null) {
                    hu1Var.m((ci9) st1Var.i.X);
                }
                hu1 hu1Var2 = this.f;
                if (hu1Var2 != null) {
                    hu1Var2.m(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        st1 st1Var2 = this.e;
                        Executor executor = (Executor) pair.second;
                        iv1 iv1Var = (iv1) pair.first;
                        st1Var2.getClass();
                        st1Var2.c.execute(new f5(st1Var2, executor, iv1Var, 12));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
    }
}
