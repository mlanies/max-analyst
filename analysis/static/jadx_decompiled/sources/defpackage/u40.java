package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class u40 {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public u40(yb9 yb9Var, zw6 zw6Var) {
        this.d = new ArrayList();
        yb9Var.getClass();
        this.e = new k74(false, true);
        this.g = j60.e;
        this.h = m60.a;
        this.f = new h60(zw6Var);
    }

    public static boolean f(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        qz7 qz7Var = new qz7(nje.b, 9, totalCaptureResult);
        Set set = vv3.a;
        boolean z2 = qz7Var.N() == 2 || qz7Var.N() == 1 || vv3.a.contains(qz7Var.A());
        boolean z3 = qz7Var.M() == 2;
        boolean z4 = !z ? !(z3 || vv3.c.contains(qz7Var.v())) : !(z3 || vv3.d.contains(qz7Var.v()));
        boolean z5 = qz7Var.O() == 2 || vv3.b.contains(qz7Var.r());
        Objects.toString(qz7Var.v());
        Objects.toString(qz7Var.A());
        Objects.toString(qz7Var.r());
        return z2 && z4 && z5;
    }

    public static boolean g(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((iv1) it.next());
        }
    }

    public void b(iv1 iv1Var) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.contains(iv1Var)) {
            return;
        }
        arrayList.add(iv1Var);
    }

    public void c(ce3 ce3Var) {
        for (aa0 aa0Var : ce3Var.g()) {
            mi9 mi9Var = (mi9) this.f;
            mi9Var.getClass();
            try {
                mi9Var.h(aa0Var);
            } catch (IllegalArgumentException unused) {
            }
            ((mi9) this.f).d(aa0Var, ce3Var.q(aa0Var), ce3Var.h(aa0Var));
        }
    }

    public kz1 d() {
        ArrayList arrayList = new ArrayList((HashSet) this.e);
        wma wmaVarA = wma.a((mi9) this.f);
        int i = this.c;
        boolean z = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        boolean z2 = this.b;
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        ui9 ui9Var = (ui9) this.g;
        for (String str : ui9Var.a.keySet()) {
            arrayMap.put(str, ui9Var.a.get(str));
        }
        return new kz1(arrayList, wmaVarA, i, z, arrayList2, z2, new nje(arrayMap), (pv1) this.h);
    }

    public su1 e(int i, int i2, int i3) {
        bj6 bj6Var = (bj6) this.f;
        oq0 oq0Var = new oq0(bj6Var, 4);
        su1 su1Var = new su1(this.c, (Executor) this.g, (ScheduledExecutorService) this.h, (st1) this.d, this.b, oq0Var);
        ArrayList arrayList = su1Var.h;
        st1 st1Var = (st1) this.d;
        if (i == 0) {
            arrayList.add(new ou1(st1Var));
        }
        if (i2 == 3) {
            arrayList.add(new xu1(st1Var, (Executor) this.g, (ScheduledExecutorService) this.h, new w4d(bj6Var)));
        } else if (this.a) {
            boolean z = ((ae3) this.e).b;
            if (z || this.c == 3 || i3 == 1) {
                arrayList.add(new zu1((st1) this.d, i2, (Executor) this.g, (ScheduledExecutorService) this.h, !z && ((AtomicInteger) st1Var.o.c).get() <= 0));
            } else {
                arrayList.add(new nu1(st1Var, i2, oq0Var));
            }
        }
        Objects.toString(arrayList);
        return su1Var;
    }

    public boolean h() {
        return !((ByteBuffer) this.h).hasRemaining() && this.c >= ((ArrayList) this.d).size() && ((k74) this.e).e();
    }

    public w40 i(lv4 lv4Var, qy5 qy5Var) throws ExportException {
        fm9.f(qy5Var.D != -1);
        try {
            w40 w40Var = new w40((j60) this.g, lv4Var, qy5Var);
            if (Objects.equals((j60) this.g, j60.e)) {
                j60 j60Var = w40Var.a;
                this.g = j60Var;
                ((h60) this.f).a(j60Var);
                ((h60) this.f).b();
            }
            ((ArrayList) this.d).add(new t40(w40Var));
            LinkedHashMap linkedHashMap = d54.a;
            synchronized (d54.class) {
            }
            return w40Var;
        } catch (AudioProcessor$UnhandledAudioFormatException e) {
            throw ExportException.b(e, "Error while registering input " + ((ArrayList) this.d).size());
        }
    }

    public u40(st1 st1Var, xv1 xv1Var, bj6 bj6Var, q6d q6dVar, zh6 zh6Var) {
        this.c = 1;
        this.d = st1Var;
        Integer num = (Integer) xv1Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.b = num != null && num.intValue() == 2;
        this.g = q6dVar;
        this.h = zh6Var;
        this.f = bj6Var;
        this.e = new ae3(bj6Var, 8);
        this.a = kq0.s(new ync(23, xv1Var));
    }

    public u40() {
        this.e = new HashSet();
        this.f = mi9.b();
        this.c = -1;
        this.a = false;
        this.d = new ArrayList();
        this.b = false;
        this.g = ui9.a();
    }

    public u40(kz1 kz1Var) {
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = mi9.b();
        this.c = -1;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = false;
        this.g = ui9.a();
        hashSet.addAll(kz1Var.a);
        this.f = mi9.c(kz1Var.b);
        this.c = kz1Var.c;
        arrayList.addAll(kz1Var.e);
        this.b = kz1Var.f;
        ArrayMap arrayMap = new ArrayMap();
        nje njeVar = kz1Var.g;
        for (String str : njeVar.a.keySet()) {
            arrayMap.put(str, njeVar.a.get(str));
        }
        this.g = new ui9(arrayMap);
        this.a = kz1Var.d;
    }
}
