package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException;

/* loaded from: classes.dex */
public final /* synthetic */ class ft0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ft0(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.o = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iIntValue;
        o43 o43Var;
        boolean z;
        switch (this.a) {
            case 0:
                ht0 ht0Var = (ht0) this.o;
                int i = this.b;
                int i2 = this.c;
                while (true) {
                    int i3 = ht0Var.j;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    fm5 fm5Var = ht0Var.i;
                    int i4 = ht0Var.e;
                    fm5Var.getClass();
                    j37 j37VarY = ote.Y(0, i4);
                    ArrayList arrayList = new ArrayList(z53.S(j37VarY, 10));
                    Iterator it = j37VarY.iterator();
                    while (((i37) it).c) {
                        arrayList.add(Integer.valueOf(fm5Var.a(((i37) it).a() + i3)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (ht0Var.l.contains(Integer.valueOf(((Number) next).intValue()))) {
                            arrayList2.add(next);
                        }
                    }
                    Set setH0 = x53.H0(arrayList2);
                    ArrayDeque arrayDeque = new ArrayDeque(bcd.Y(setH0, ht0Var.f.keySet()));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        if (ht0Var.f.get(Integer.valueOf(iIntValue2)) == null) {
                            int i5 = ht0Var.j;
                            if (i5 == -1 || setH0.contains(Integer.valueOf(i5))) {
                                Integer num = (Integer) arrayDeque.pollFirst();
                                int iIntValue3 = num != null ? num.intValue() : -1;
                                gt0 gt0Var = (gt0) ht0Var.f.get(Integer.valueOf(iIntValue3));
                                o43 o43VarN = (gt0Var == null || (o43Var = gt0Var.a) == null) ? null : o43Var.n();
                                if (o43VarN == null) {
                                    s2b s2bVar = ht0Var.a;
                                    s2bVar.getClass();
                                    o43 o43VarC = s2bVar.c(i, i2, Bitmap.Config.ARGB_8888);
                                    gt0Var = new gt0((v84) o43VarC);
                                    o43VarN = o43VarC.clone();
                                }
                                gt0Var.b = true;
                                try {
                                    ht0Var.f(iIntValue2, o43VarN);
                                    v3c.i(o43VarN, null);
                                    ht0Var.f.remove(Integer.valueOf(iIntValue3));
                                    gt0Var.b = false;
                                    ht0Var.f.put(Integer.valueOf(iIntValue2), gt0Var);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        v3c.i(o43VarN, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        iIntValue = (int) (ht0Var.e * 0.5f);
                    } else {
                        int size = arrayList2.size();
                        iIntValue = ((Number) arrayList2.get(ote.e((int) (size * 0.5f), 0, size - 1))).intValue();
                    }
                    ht0Var.g = iIntValue;
                    ht0Var.h = false;
                    return;
                    break;
                }
                break;
            case 1:
                h26 h26Var = (h26) this.o;
                int i6 = this.b;
                int i7 = this.c;
                if (h26Var.t0 && h26Var.u0 && h26Var.Y != null) {
                    try {
                        h26Var.Y.changeCaptureFormat(i6, i7, 0);
                        return;
                    } catch (Throwable th3) {
                        h26Var.c.reportException("FrameCapturerImpl", "", new ScreenShareException("Error change capture format", th3));
                        return;
                    }
                }
                return;
            case 2:
                ((m1f) ((rxd) this.o).b).X.o(this.b, this.c);
                return;
            case 3:
                h26 h26Var2 = ((fwc) this.o).o;
                if (h26Var2 != null) {
                    h26Var2.a(this.b, this.c);
                    return;
                }
                return;
            case 4:
                ((ard) ((g03) this.o).c).o.o(this.b, this.c);
                return;
            case 5:
                iee ieeVar = (iee) this.o;
                int i8 = ieeVar.i;
                int i9 = this.b;
                boolean z2 = true;
                if (i8 != i9) {
                    ieeVar.i = i9;
                    z = true;
                } else {
                    z = false;
                }
                int i10 = ieeVar.h;
                int i11 = this.c;
                if (i10 != i11) {
                    ieeVar.h = i11;
                } else {
                    z2 = z;
                }
                if (z2) {
                    ieeVar.f();
                    return;
                }
                return;
            case 6:
                ((SurfaceTextureHelper) this.o).lambda$setTextureSize$2(this.b, this.c);
                return;
            case 7:
                ((SurfaceViewRenderer) this.o).lambda$onFrameResolutionChanged$0(this.b, this.c);
                return;
            default:
                TextureViewRenderer.updateFrameDimensionsAndReportEvents$lambda$8((TextureViewRenderer) this.o, this.b, this.c);
                return;
        }
    }
}
