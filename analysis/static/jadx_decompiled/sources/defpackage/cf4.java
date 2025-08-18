package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class cf4 extends hz7 implements jgc {
    public static final zma j = zma.a(new v00(19));
    public final Object c;
    public final Context d;
    public final kj6 e;
    public final boolean f;
    public oe4 g;
    public final w36 h;
    public h30 i;

    public cf4(Context context) {
        this(context, new kj6(6));
    }

    public static int c(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(tze tzeVar, j0f j0fVar, HashMap map) {
        for (int i = 0; i < tzeVar.a; i++) {
            c0f c0fVar = (c0f) j0fVar.A.get(tzeVar.a(i));
            if (c0fVar != null) {
                rze rzeVar = c0fVar.a;
                c0f c0fVar2 = (c0f) map.get(Integer.valueOf(rzeVar.c));
                if (c0fVar2 == null || (c0fVar2.b.isEmpty() && !c0fVar.b.isEmpty())) {
                    map.put(Integer.valueOf(rzeVar.c), c0fVar);
                }
            }
        }
    }

    public static int e(qy5 qy5Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(qy5Var.d)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(qy5Var.d);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        int i = oaf.a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(oe4 oe4Var, int i, qy5 qy5Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        f0f f0fVar = oe4Var.s;
        if (f0fVar.c && (i & 2048) == 0) {
            return false;
        }
        if (f0fVar.b) {
            return !(qy5Var.E != 0 || qy5Var.F != 0) || ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0);
        }
        return true;
    }

    public static Pair j(int i, fz7 fz7Var, int[][][] iArr, ve4 ve4Var, Comparator comparator) {
        RandomAccess randomAccessN;
        boolean z;
        fz7 fz7Var2 = fz7Var;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < fz7Var2.a) {
            if (i == fz7Var2.b[i2]) {
                tze tzeVar = fz7Var2.c[i2];
                for (int i3 = 0; i3 < tzeVar.a; i3++) {
                    rze rzeVarA = tzeVar.a(i3);
                    ffc ffcVarK = ve4Var.k(i2, rzeVarA, iArr[i2][i3]);
                    int i4 = rzeVarA.a;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        xe4 xe4Var = (xe4) ffcVarK.get(i5);
                        int iA = xe4Var.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessN = zw6.n(xe4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(xe4Var);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    xe4 xe4Var2 = (xe4) ffcVarK.get(i6);
                                    if (xe4Var2.a() == 2 && xe4Var.b(xe4Var2)) {
                                        arrayList2.add(xe4Var2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessN = arrayList2;
                            }
                            arrayList.add(randomAccessN);
                        }
                    }
                }
            }
            i2++;
            fz7Var2 = fz7Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((xe4) list.get(i7)).c;
        }
        xe4 xe4Var3 = (xe4) list.get(0);
        return Pair.create(new l85(xe4Var3.b, iArr2), Integer.valueOf(xe4Var3.a));
    }

    @Override // defpackage.hz7
    public final void a(h30 h30Var) {
        boolean z;
        synchronized (this.c) {
            z = !this.i.equals(h30Var);
            this.i = h30Var;
        }
        if (z) {
            g();
        }
    }

    @Override // defpackage.hz7
    public final void b(j0f j0fVar) {
        if (j0fVar instanceof oe4) {
            k((oe4) j0fVar);
        }
        me4 me4Var = new me4(f());
        me4Var.d(j0fVar);
        k(new oe4(me4Var));
    }

    public final oe4 f() {
        oe4 oe4Var;
        synchronized (this.c) {
            oe4Var = this.g;
        }
        return oe4Var;
    }

    public final void g() {
        boolean z;
        k0f k0fVar;
        w36 w36Var;
        synchronized (this.c) {
            try {
                z = this.g.s0 && !this.f && oaf.a >= 32 && (w36Var = this.h) != null && w36Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (k0fVar = this.a) == null) {
            return;
        }
        ((g85) k0fVar).s0.f(10);
    }

    public final void k(oe4 oe4Var) {
        boolean z;
        oe4Var.getClass();
        synchronized (this.c) {
            z = !this.g.equals(oe4Var);
            this.g = oe4Var;
        }
        if (z) {
            if (oe4Var.s0 && this.d == null) {
                z04.c0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            k0f k0fVar = this.a;
            if (k0fVar != null) {
                ((g85) k0fVar).s0.f(10);
            }
        }
    }

    public cf4(Context context, kj6 kj6Var) {
        String str = oe4.z0;
        oe4 oe4Var = new oe4(new me4(context));
        this.c = new Object();
        w36 w36Var = null;
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = kj6Var;
        this.g = oe4Var;
        this.i = h30.g;
        boolean z = context != null && oaf.P(context);
        this.f = z;
        if (!z && context != null && oaf.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                Spatializer spatializer = audioManager.getSpatializer();
                w36Var = new w36();
                w36Var.b = spatializer;
                w36Var.a = spatializer.getImmersiveAudioLevel() != 0;
            }
            this.h = w36Var;
        }
        if (this.g.s0 && context == null) {
            z04.c0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
