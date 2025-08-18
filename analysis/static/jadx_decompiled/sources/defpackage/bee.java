package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class bee {
    public final String i;
    public final ht1 j;
    public final xv1 k;
    public final rxd l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public dc0 s;
    public final ul4 u;
    public final td x;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final huc v = new huc();
    public final wmc w = new wmc(20);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    public bee(Context context, String str, dx1 dx1Var, ht1 ht1Var) throws CameraUnavailableException, NumberFormatException {
        ArrayList arrayListSingletonList;
        int[] outputFormats;
        long[] jArr;
        int[] iArr;
        boolean z;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        str.getClass();
        this.i = str;
        ht1Var.getClass();
        this.j = ht1Var;
        this.l = new rxd(15);
        this.u = ul4.b(context);
        try {
            xv1 xv1VarA = dx1Var.a(str);
            this.k = xv1VarA;
            Integer num = (Integer) xv1VarA.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) xv1VarA.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.n = true;
                    } else if (i == 6) {
                        this.o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.r = true;
                    }
                }
            }
            this.x = new td(this.k);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            cee ceeVar = new cee();
            dee deeVar = dee.MAXIMUM;
            k7d.m(1, deeVar, 0L, ceeVar);
            cee ceeVarI = k7d.i(arrayList2, ceeVar);
            k7d.m(3, deeVar, 0L, ceeVarI);
            cee ceeVarI2 = k7d.i(arrayList2, ceeVarI);
            k7d.m(2, deeVar, 0L, ceeVarI2);
            cee ceeVarI3 = k7d.i(arrayList2, ceeVarI2);
            dee deeVar2 = dee.PREVIEW;
            ceeVarI3.a(new xb0(1, deeVar2, 0L));
            k7d.m(3, deeVar, 0L, ceeVarI3);
            cee ceeVarI4 = k7d.i(arrayList2, ceeVarI3);
            ceeVarI4.a(new xb0(2, deeVar2, 0L));
            k7d.m(3, deeVar, 0L, ceeVarI4);
            cee ceeVarI5 = k7d.i(arrayList2, ceeVarI4);
            ceeVarI5.a(new xb0(1, deeVar2, 0L));
            k7d.m(1, deeVar2, 0L, ceeVarI5);
            cee ceeVarI6 = k7d.i(arrayList2, ceeVarI5);
            ceeVarI6.a(new xb0(1, deeVar2, 0L));
            k7d.m(2, deeVar2, 0L, ceeVarI6);
            cee ceeVarI7 = k7d.i(arrayList2, ceeVarI6);
            ceeVarI7.a(new xb0(1, deeVar2, 0L));
            ceeVarI7.a(new xb0(2, deeVar2, 0L));
            k7d.m(3, deeVar, 0L, ceeVarI7);
            arrayList2.add(ceeVarI7);
            arrayList.addAll(arrayList2);
            int i2 = this.m;
            dee deeVar3 = dee.RECORD;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList3 = new ArrayList();
                cee ceeVar2 = new cee();
                ceeVar2.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar3, 0L, ceeVar2);
                cee ceeVarI8 = k7d.i(arrayList3, ceeVar2);
                ceeVarI8.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar3, 0L, ceeVarI8);
                cee ceeVarI9 = k7d.i(arrayList3, ceeVarI8);
                ceeVarI9.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar3, 0L, ceeVarI9);
                cee ceeVarI10 = k7d.i(arrayList3, ceeVarI9);
                ceeVarI10.a(new xb0(1, deeVar2, 0L));
                ceeVarI10.a(new xb0(1, deeVar3, 0L));
                k7d.m(3, deeVar3, 0L, ceeVarI10);
                cee ceeVarI11 = k7d.i(arrayList3, ceeVarI10);
                ceeVarI11.a(new xb0(1, deeVar2, 0L));
                ceeVarI11.a(new xb0(2, deeVar3, 0L));
                k7d.m(3, deeVar3, 0L, ceeVarI11);
                cee ceeVarI12 = k7d.i(arrayList3, ceeVarI11);
                ceeVarI12.a(new xb0(2, deeVar2, 0L));
                ceeVarI12.a(new xb0(2, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI12);
                arrayList3.add(ceeVarI12);
                arrayList.addAll(arrayList3);
            }
            dee deeVar4 = dee.VGA;
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                cee ceeVar3 = new cee();
                ceeVar3.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar, 0L, ceeVar3);
                cee ceeVarI13 = k7d.i(arrayList4, ceeVar3);
                ceeVarI13.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI13);
                cee ceeVarI14 = k7d.i(arrayList4, ceeVarI13);
                ceeVarI14.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI14);
                cee ceeVarI15 = k7d.i(arrayList4, ceeVarI14);
                ceeVarI15.a(new xb0(1, deeVar2, 0L));
                ceeVarI15.a(new xb0(1, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI15);
                cee ceeVarI16 = k7d.i(arrayList4, ceeVarI15);
                ceeVarI16.a(new xb0(2, deeVar4, 0L));
                ceeVarI16.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI16);
                cee ceeVarI17 = k7d.i(arrayList4, ceeVarI16);
                ceeVarI17.a(new xb0(2, deeVar4, 0L));
                ceeVarI17.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI17);
                arrayList4.add(ceeVarI17);
                arrayList.addAll(arrayList4);
            }
            if (this.n) {
                ArrayList arrayList5 = new ArrayList();
                cee ceeVar4 = new cee();
                k7d.m(5, deeVar, 0L, ceeVar4);
                cee ceeVarI18 = k7d.i(arrayList5, ceeVar4);
                ceeVarI18.a(new xb0(1, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI18);
                cee ceeVarI19 = k7d.i(arrayList5, ceeVarI18);
                ceeVarI19.a(new xb0(2, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI19);
                cee ceeVarI20 = k7d.i(arrayList5, ceeVarI19);
                ceeVarI20.a(new xb0(1, deeVar2, 0L));
                ceeVarI20.a(new xb0(1, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI20);
                cee ceeVarI21 = k7d.i(arrayList5, ceeVarI20);
                ceeVarI21.a(new xb0(1, deeVar2, 0L));
                ceeVarI21.a(new xb0(2, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI21);
                cee ceeVarI22 = k7d.i(arrayList5, ceeVarI21);
                ceeVarI22.a(new xb0(2, deeVar2, 0L));
                ceeVarI22.a(new xb0(2, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI22);
                cee ceeVarI23 = k7d.i(arrayList5, ceeVarI22);
                ceeVarI23.a(new xb0(1, deeVar2, 0L));
                ceeVarI23.a(new xb0(3, deeVar, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI23);
                cee ceeVarI24 = k7d.i(arrayList5, ceeVarI23);
                ceeVarI24.a(new xb0(2, deeVar2, 0L));
                ceeVarI24.a(new xb0(3, deeVar, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI24);
                arrayList5.add(ceeVarI24);
                arrayList.addAll(arrayList5);
            }
            if (this.o && i2 == 0) {
                ArrayList arrayList6 = new ArrayList();
                cee ceeVar5 = new cee();
                ceeVar5.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar, 0L, ceeVar5);
                cee ceeVarI25 = k7d.i(arrayList6, ceeVar5);
                ceeVarI25.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI25);
                cee ceeVarI26 = k7d.i(arrayList6, ceeVarI25);
                ceeVarI26.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI26);
                arrayList6.add(ceeVarI26);
                arrayList.addAll(arrayList6);
            }
            if (i2 == 3) {
                ArrayList arrayList7 = new ArrayList();
                cee ceeVar6 = new cee();
                ceeVar6.a(new xb0(1, deeVar2, 0L));
                ceeVar6.a(new xb0(1, deeVar4, 0L));
                ceeVar6.a(new xb0(2, deeVar, 0L));
                k7d.m(5, deeVar, 0L, ceeVar6);
                cee ceeVarI27 = k7d.i(arrayList7, ceeVar6);
                ceeVarI27.a(new xb0(1, deeVar2, 0L));
                ceeVarI27.a(new xb0(1, deeVar4, 0L));
                ceeVarI27.a(new xb0(3, deeVar, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI27);
                arrayList7.add(ceeVarI27);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.l.b) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                cee ceeVar7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (this.i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.e()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.emptyList();
                }
            }
            arrayList8.addAll(arrayListSingletonList);
            if (this.r) {
                ArrayList arrayList10 = new ArrayList();
                cee ceeVar8 = new cee();
                dee deeVar5 = dee.ULTRA_MAXIMUM;
                ceeVar8.a(new xb0(2, deeVar5, 0L));
                ceeVar8.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar3, 0L, ceeVar8);
                cee ceeVarI28 = k7d.i(arrayList10, ceeVar8);
                ceeVarI28.a(new xb0(3, deeVar5, 0L));
                ceeVarI28.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar3, 0L, ceeVarI28);
                cee ceeVarI29 = k7d.i(arrayList10, ceeVarI28);
                ceeVarI29.a(new xb0(5, deeVar5, 0L));
                ceeVarI29.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar3, 0L, ceeVarI29);
                cee ceeVarI30 = k7d.i(arrayList10, ceeVarI29);
                ceeVarI30.a(new xb0(2, deeVar5, 0L));
                ceeVarI30.a(new xb0(1, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI30);
                cee ceeVarI31 = k7d.i(arrayList10, ceeVarI30);
                ceeVarI31.a(new xb0(3, deeVar5, 0L));
                ceeVarI31.a(new xb0(1, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI31);
                cee ceeVarI32 = k7d.i(arrayList10, ceeVarI31);
                ceeVarI32.a(new xb0(5, deeVar5, 0L));
                ceeVarI32.a(new xb0(1, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI32);
                cee ceeVarI33 = k7d.i(arrayList10, ceeVarI32);
                ceeVarI33.a(new xb0(2, deeVar5, 0L));
                ceeVarI33.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI33);
                cee ceeVarI34 = k7d.i(arrayList10, ceeVarI33);
                ceeVarI34.a(new xb0(3, deeVar5, 0L));
                ceeVarI34.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI34);
                cee ceeVarI35 = k7d.i(arrayList10, ceeVarI34);
                ceeVarI35.a(new xb0(5, deeVar5, 0L));
                ceeVarI35.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI35);
                cee ceeVarI36 = k7d.i(arrayList10, ceeVarI35);
                ceeVarI36.a(new xb0(2, deeVar5, 0L));
                ceeVarI36.a(new xb0(1, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI36);
                cee ceeVarI37 = k7d.i(arrayList10, ceeVarI36);
                ceeVarI37.a(new xb0(3, deeVar5, 0L));
                ceeVarI37.a(new xb0(1, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI37);
                cee ceeVarI38 = k7d.i(arrayList10, ceeVarI37);
                ceeVarI38.a(new xb0(5, deeVar5, 0L));
                ceeVarI38.a(new xb0(1, deeVar2, 0L));
                k7d.m(5, deeVar, 0L, ceeVarI38);
                arrayList10.add(ceeVarI38);
                this.b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.p = zHasSystemFeature;
            dee deeVar6 = dee.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                cee ceeVar9 = new cee();
                k7d.m(2, deeVar6, 0L, ceeVar9);
                cee ceeVarI39 = k7d.i(arrayList11, ceeVar9);
                k7d.m(1, deeVar6, 0L, ceeVarI39);
                cee ceeVarI40 = k7d.i(arrayList11, ceeVarI39);
                k7d.m(3, deeVar6, 0L, ceeVarI40);
                cee ceeVarI41 = k7d.i(arrayList11, ceeVarI40);
                dee deeVar7 = dee.s720p;
                ceeVarI41.a(new xb0(2, deeVar7, 0L));
                k7d.m(3, deeVar6, 0L, ceeVarI41);
                cee ceeVarI42 = k7d.i(arrayList11, ceeVarI41);
                ceeVarI42.a(new xb0(1, deeVar7, 0L));
                k7d.m(3, deeVar6, 0L, ceeVarI42);
                cee ceeVarI43 = k7d.i(arrayList11, ceeVarI42);
                ceeVarI43.a(new xb0(2, deeVar7, 0L));
                k7d.m(2, deeVar6, 0L, ceeVarI43);
                cee ceeVarI44 = k7d.i(arrayList11, ceeVarI43);
                ceeVarI44.a(new xb0(2, deeVar7, 0L));
                k7d.m(1, deeVar6, 0L, ceeVarI44);
                cee ceeVarI45 = k7d.i(arrayList11, ceeVarI44);
                ceeVarI45.a(new xb0(1, deeVar7, 0L));
                k7d.m(2, deeVar6, 0L, ceeVarI45);
                cee ceeVarI46 = k7d.i(arrayList11, ceeVarI45);
                ceeVarI46.a(new xb0(1, deeVar7, 0L));
                k7d.m(1, deeVar6, 0L, ceeVarI46);
                arrayList11.add(ceeVarI46);
                this.c.addAll(arrayList11);
            }
            if (this.x.b) {
                ArrayList arrayList12 = new ArrayList();
                cee ceeVar10 = new cee();
                k7d.m(1, deeVar, 0L, ceeVar10);
                cee ceeVarI47 = k7d.i(arrayList12, ceeVar10);
                k7d.m(2, deeVar, 0L, ceeVarI47);
                cee ceeVarI48 = k7d.i(arrayList12, ceeVarI47);
                ceeVarI48.a(new xb0(1, deeVar2, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI48);
                cee ceeVarI49 = k7d.i(arrayList12, ceeVarI48);
                ceeVarI49.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI49);
                cee ceeVarI50 = k7d.i(arrayList12, ceeVarI49);
                ceeVarI50.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI50);
                cee ceeVarI51 = k7d.i(arrayList12, ceeVarI50);
                ceeVarI51.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar3, 0L, ceeVarI51);
                cee ceeVarI52 = k7d.i(arrayList12, ceeVarI51);
                ceeVarI52.a(new xb0(1, deeVar2, 0L));
                ceeVarI52.a(new xb0(1, deeVar3, 0L));
                k7d.m(2, deeVar3, 0L, ceeVarI52);
                cee ceeVarI53 = k7d.i(arrayList12, ceeVarI52);
                ceeVarI53.a(new xb0(1, deeVar2, 0L));
                ceeVarI53.a(new xb0(1, deeVar3, 0L));
                k7d.m(3, deeVar3, 0L, ceeVarI53);
                arrayList12.add(ceeVarI53);
                this.f.addAll(arrayList12);
            }
            fd7 fd7Var = (fd7) this.k.b().a;
            fd7Var.getClass();
            try {
                outputFormats = ((StreamConfigurationMap) fd7Var.a).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException unused) {
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                int length = iArr3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (iArr3[i3] == 4101) {
                        ArrayList arrayList13 = new ArrayList();
                        cee ceeVar11 = new cee();
                        k7d.m(4, deeVar, 0L, ceeVar11);
                        cee ceeVarI54 = k7d.i(arrayList13, ceeVar11);
                        ceeVarI54.a(new xb0(1, deeVar2, 0L));
                        k7d.m(4, deeVar, 0L, ceeVarI54);
                        arrayList13.add(ceeVarI54);
                        this.g.addAll(arrayList13);
                        break;
                    }
                    i3++;
                }
            }
            xv1 xv1Var = this.k;
            aa0 aa0Var = e9e.a;
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 33 || (jArr = (long[]) xv1Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.q = z2;
            if (z2 && i4 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                cee ceeVar12 = new cee();
                k7d.m(1, deeVar6, 4L, ceeVar12);
                cee ceeVarI55 = k7d.i(arrayList14, ceeVar12);
                k7d.m(2, deeVar6, 4L, ceeVarI55);
                cee ceeVarI56 = k7d.i(arrayList14, ceeVarI55);
                k7d.m(1, deeVar3, 3L, ceeVarI56);
                cee ceeVarI57 = k7d.i(arrayList14, ceeVarI56);
                k7d.m(2, deeVar3, 3L, ceeVarI57);
                cee ceeVarI58 = k7d.i(arrayList14, ceeVarI57);
                k7d.m(3, deeVar, 2L, ceeVarI58);
                cee ceeVarI59 = k7d.i(arrayList14, ceeVarI58);
                k7d.m(2, deeVar, 2L, ceeVarI59);
                cee ceeVarI60 = k7d.i(arrayList14, ceeVarI59);
                ceeVarI60.a(new xb0(1, deeVar2, 1L));
                k7d.m(3, deeVar, 2L, ceeVarI60);
                cee ceeVarI61 = k7d.i(arrayList14, ceeVarI60);
                ceeVarI61.a(new xb0(1, deeVar2, 1L));
                k7d.m(2, deeVar, 2L, ceeVarI61);
                cee ceeVarI62 = k7d.i(arrayList14, ceeVarI61);
                ceeVarI62.a(new xb0(1, deeVar2, 1L));
                k7d.m(1, deeVar3, 3L, ceeVarI62);
                cee ceeVarI63 = k7d.i(arrayList14, ceeVarI62);
                ceeVarI63.a(new xb0(1, deeVar2, 1L));
                k7d.m(2, deeVar3, 3L, ceeVarI63);
                cee ceeVarI64 = k7d.i(arrayList14, ceeVarI63);
                ceeVarI64.a(new xb0(1, deeVar2, 1L));
                k7d.m(2, deeVar2, 1L, ceeVarI64);
                cee ceeVarI65 = k7d.i(arrayList14, ceeVarI64);
                ceeVarI65.a(new xb0(1, deeVar2, 1L));
                ceeVarI65.a(new xb0(1, deeVar3, 3L));
                k7d.m(3, deeVar3, 2L, ceeVarI65);
                cee ceeVarI66 = k7d.i(arrayList14, ceeVarI65);
                ceeVarI66.a(new xb0(1, deeVar2, 1L));
                ceeVarI66.a(new xb0(2, deeVar3, 3L));
                k7d.m(3, deeVar3, 2L, ceeVarI66);
                cee ceeVarI67 = k7d.i(arrayList14, ceeVarI66);
                ceeVarI67.a(new xb0(1, deeVar2, 1L));
                ceeVarI67.a(new xb0(2, deeVar2, 1L));
                k7d.m(3, deeVar, 2L, ceeVarI67);
                arrayList14.add(ceeVarI67);
                this.h.addAll(arrayList14);
            }
            xv1 xv1Var2 = this.k;
            if (i4 < 33 || (iArr = (int[]) xv1Var2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z = false;
            } else {
                for (int i5 : iArr) {
                    if (i5 == 2) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList();
                cee ceeVar13 = new cee();
                k7d.m(1, deeVar6, 0L, ceeVar13);
                cee ceeVarI68 = k7d.i(arrayList15, ceeVar13);
                k7d.m(2, deeVar6, 0L, ceeVarI68);
                cee ceeVarI69 = k7d.i(arrayList15, ceeVarI68);
                ceeVarI69.a(new xb0(1, deeVar6, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI69);
                cee ceeVarI70 = k7d.i(arrayList15, ceeVarI69);
                ceeVarI70.a(new xb0(2, deeVar6, 0L));
                k7d.m(3, deeVar, 0L, ceeVarI70);
                cee ceeVarI71 = k7d.i(arrayList15, ceeVarI70);
                ceeVarI71.a(new xb0(1, deeVar6, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI71);
                cee ceeVarI72 = k7d.i(arrayList15, ceeVarI71);
                ceeVarI72.a(new xb0(2, deeVar6, 0L));
                k7d.m(2, deeVar, 0L, ceeVarI72);
                cee ceeVarI73 = k7d.i(arrayList15, ceeVarI72);
                ceeVarI73.a(new xb0(1, deeVar2, 0L));
                k7d.m(1, deeVar6, 0L, ceeVarI73);
                cee ceeVarI74 = k7d.i(arrayList15, ceeVarI73);
                ceeVarI74.a(new xb0(2, deeVar2, 0L));
                k7d.m(1, deeVar6, 0L, ceeVarI74);
                cee ceeVarI75 = k7d.i(arrayList15, ceeVarI74);
                ceeVarI75.a(new xb0(1, deeVar2, 0L));
                k7d.m(2, deeVar6, 0L, ceeVarI75);
                cee ceeVarI76 = k7d.i(arrayList15, ceeVarI75);
                ceeVarI76.a(new xb0(2, deeVar2, 0L));
                k7d.m(2, deeVar6, 0L, ceeVarI76);
                arrayList15.add(ceeVarI76);
                this.d.addAll(arrayList15);
            }
            b();
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        x93 x93Var = new x93(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), x93Var);
        Size size2 = msd.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), x93Var);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), x93Var);
    }

    public static int e(Range range, Range range2) {
        c54.p("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(wb0 wb0Var, List list) {
        List list2;
        HashMap map = this.e;
        if (map.containsKey(wb0Var)) {
            list2 = (List) map.get(wb0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = wb0Var.d;
            int i = wb0Var.a;
            if (!z) {
                int i2 = wb0Var.b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i != 2) {
                            if (wb0Var.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        list2 = this.c;
                        map.put(wb0Var, list2);
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.g);
            }
            list2 = arrayList;
            map.put(wb0Var, list2);
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((cee) it.next()).c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() throws NumberFormatException {
        Size size;
        Size size2;
        int i;
        ht1 ht1Var;
        CamcorderProfile camcorderProfileA;
        CamcorderProfile camcorderProfileA2;
        Size sizeE = this.u.e();
        try {
            i = Integer.parseInt(this.i);
            ht1Var = this.j;
            camcorderProfileA = null;
            camcorderProfileA2 = ht1Var.c(i, 1) ? ht1Var.a(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((fd7) this.k.b().a).a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new x93(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size = msd.d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = msd.f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size = msd.d;
            }
        }
        if (camcorderProfileA2 != null) {
            size2 = new Size(camcorderProfileA2.videoFrameWidth, camcorderProfileA2.videoFrameHeight);
            this.s = new dc0(msd.c, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = msd.d;
        if (ht1Var.c(i, 10)) {
            camcorderProfileA = ht1Var.a(i, 10);
        } else if (ht1Var.c(i, 8)) {
            camcorderProfileA = ht1Var.a(i, 8);
        } else if (ht1Var.c(i, 12)) {
            camcorderProfileA = ht1Var.a(i, 12);
        } else if (ht1Var.c(i, 6)) {
            camcorderProfileA = ht1Var.a(i, 6);
        } else if (ht1Var.c(i, 5)) {
            camcorderProfileA = ht1Var.a(i, 5);
        } else if (ht1Var.c(i, 4)) {
            camcorderProfileA = ht1Var.a(i, 4);
        }
        if (camcorderProfileA != null) {
            size = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
        }
        size2 = size;
        this.s = new dc0(msd.c, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(wb0 wb0Var, List list) {
        aa0 aa0Var = e9e.a;
        if (wb0Var.a == 0 && wb0Var.b == 8) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((cee) it.next()).c(list);
                if (listC != null) {
                    return listC;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d1, code lost:
    
        if (r5.contains(r12) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x04df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair g(int r41, java.util.ArrayList r42, java.util.HashMap r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 3881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l90 l90Var = (l90) it.next();
            arrayList4.add(l90Var.a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), l90Var);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            o9f o9fVar = (o9f) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int inputFormat = o9fVar.getInputFormat();
            arrayList4.add(xb0.b(i, inputFormat, size, i(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), o9fVar);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(o9fVar.getInputFormat(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final dc0 i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i))) {
            j((HashMap) this.s.b, msd.e, i);
            j((HashMap) this.s.d, msd.g, i);
            Map map = this.s.f;
            xv1 xv1Var = this.k;
            Size sizeC = c((StreamConfigurationMap) ((fd7) xv1Var.b().a).a, i, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i), sizeC);
            }
            Map map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) xv1Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.s;
    }

    public final void j(HashMap map, Size size, int i) {
        if (this.p) {
            Size sizeC = c((StreamConfigurationMap) ((fd7) this.k.b().a).a, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new x93(false));
            }
            map.put(numValueOf, size);
        }
    }
}
