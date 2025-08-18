package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextPaint;
import android.util.LogPrinter;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.emoji.sprite.IllegalWidthSpriteException;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class nw4 implements px7, Provider, abe {
    public static final lh4 X = new lh4();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ nw4(int i) {
        this.a = i;
    }

    public static Object[] j(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = hg6.w0;
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public void a(int i, String str) {
        e(String.valueOf(i), str);
    }

    @Override // defpackage.px7
    public void b(String str, List list) {
        bc7[] bc7VarArr = eya.F0;
        ((eya) this.b).r().i = null;
        boolean zF = tpa.f(str, (String) this.c);
        ry1 ry1Var = (ry1) this.o;
        if (zF) {
            ry1Var.resumeWith(list);
            return;
        }
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause(null);
        ry1Var.resumeWith(new njc(cancellationException));
    }

    public void d(String str, boolean z) {
        e(String.valueOf(z), str);
    }

    public void e(Object obj, String str) {
        jo7 jo7Var = new jo7();
        ((jo7) this.o).c = jo7Var;
        this.o = jo7Var;
        jo7Var.b = obj;
        jo7Var.a = str;
    }

    public ab0 f() {
        String strG = ((mc0) this.b) == null ? " videoSpec" : "";
        if (((o90) this.c) == null) {
            strG = strG.concat(" audioSpec");
        }
        if (((Integer) this.o) == null) {
            strG = au1.g(strG, " outputFormat");
        }
        if (strG.isEmpty()) {
            return new ab0((mc0) this.b, (o90) this.c, ((Integer) this.o).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    @Override // defpackage.abe
    public int g(long j) {
        long[] jArr = (long[]) this.o;
        int iB = maf.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new puc(((Integer) ((Provider) this.o).get()).intValue(), (Context) ((Provider) this.b).get(), (String) ((Provider) this.c).get());
    }

    public void h(Collection collection) {
        gx0 gx0Var;
        Iterator it;
        HashMap map = new HashMap(collection.size());
        Iterator it2 = collection.iterator();
        long j = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            gx0Var = gx0.a;
            if (!zHasNext) {
                break;
            }
            gx0 gx0Var2 = (gx0) it2.next();
            Iterator it3 = ((List) this.b).iterator();
            long j2 = 0;
            long j3 = 0;
            while (it3.hasNext()) {
                pw0 pw0Var = (pw0) it3.next();
                if (gx0Var2 != gx0Var) {
                    if (pw0Var.d == gx0Var2) {
                    }
                }
                it3.remove();
                if (pw0Var.a.delete()) {
                    j2++;
                    j3 += pw0Var.b;
                    hm9.m("nw4", "deleteEntries: delete=%s", pw0Var);
                } else {
                    hm9.q("nw4", "deleteEntries: failed to delete=%s", pw0Var);
                }
            }
            hm9.m("nw4", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", gx0Var2, Long.valueOf(j2), Long.valueOf(j3));
            j += j3;
            map.put(gx0Var2, Long.valueOf(j3));
        }
        je7 je7Var = ((og5) this.c).a;
        ((ad) je7Var.getValue()).f("ACTION_CACHE_CLEARED");
        Set setEntrySet = map.entrySet();
        Iterator it4 = setEntrySet.iterator();
        long j4 = 0;
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            gx0 gx0Var3 = (gx0) entry.getKey();
            if (gx0Var3 == gx0.b || gx0Var3 == gx0Var) {
                iv6 iv6VarO = s36.o();
                it = it4;
                ig5 ig5Var = new ig5(24);
                iv6VarO.f.n(ig5Var);
                iv6VarO.g.n(ig5Var);
                bl4 bl4Var = (bl4) iv6VarO.c.get();
                bl4Var.a().a();
                ((du0) bl4Var.d.getValue()).a();
                Iterator it5 = ((dx6) bl4Var.f.getValue()).entrySet().iterator();
                while (it5.hasNext()) {
                    ((du0) ((Map.Entry) it5.next()).getValue()).a();
                }
            } else {
                it = it4;
            }
            long jLongValue = ((Long) entry.getValue()).longValue();
            j4 += jLongValue;
            File fileA = ((pg5) this.o).a(gx0Var3);
            ((ad) je7Var.getValue()).e(jLongValue, "ACTION_CACHE_CLEARED_SIZE", fileA != null ? fileA.getName() : gx0Var3.name());
            it4 = it;
        }
        if (cx0.l.equals(map.keySet()) || (setEntrySet.size() == 1 && ((Map.Entry) setEntrySet.iterator().next()).getKey() == gx0Var)) {
            ((ad) je7Var.getValue()).e(j4, "ACTION_CACHE_CLEARED_SIZE", "ALL");
        }
        hm9.m("nw4", "clearCacheTypes: removed %d bytes", Long.valueOf(j));
    }

    @Override // defpackage.abe
    public long i(int i) {
        np8.d(i >= 0);
        long[] jArr = (long[]) this.o;
        np8.d(i < jArr.length);
        return jArr[i];
    }

    public void k(iee ieeVar, Map.Entry entry) {
        iee ieeVar2 = (iee) entry.getValue();
        yb0 yb0Var = null;
        yb0 yb0Var2 = new yb0(ieeVar.g.a, ((cb0) entry.getKey()).d, ieeVar.c ? (ax1) this.c : null, ((cb0) entry.getKey()).f, ((cb0) entry.getKey()).g);
        int i = ((cb0) entry.getKey()).c;
        ieeVar2.getClass();
        kq0.e();
        ieeVar2.b();
        c54.p("Consumer can only be linked once.", !ieeVar2.j);
        ieeVar2.j = true;
        hee heeVar = ieeVar2.l;
        kq0.a(kq0.K(heeVar.c(), new gee(ieeVar2, heeVar, i, yb0Var2, yb0Var), ju0.D()), new l7b(this, 9, ieeVar2), ju0.D());
    }

    public long l(gx0 gx0Var) {
        long j = 0;
        for (pw0 pw0Var : (List) this.b) {
            boolean z = false;
            try {
                if (gx0Var == gx0.a || pw0Var.d == gx0Var) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            if (z) {
                j += pw0Var.b;
            }
        }
        return j;
    }

    public boolean m(int i) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
        return i == chatsListWidget.A0.j() + chatsListWidget.B0.j() && chatsListWidget.C0.j() > 0;
    }

    public void n() {
        ((lee) this.b).release();
        kq0.H(new u3c(23, this));
    }

    public Bitmap o(nx4 nx4Var) {
        Bitmap bitmap = (Bitmap) ((bo0) ((adb) this.b).b).c(nx4Var);
        if (bitmap != null) {
            return bitmap;
        }
        int i = nx4Var.a;
        Bitmap bitmap2 = ((Bitmap[]) ((adb) this.b).a)[i];
        if (bitmap2 != null) {
            iy4 iy4Var = (iy4) this.c;
            int iG = i == 24 ? tu0.G(iy4Var.a() * 1) : tu0.G(iy4Var.a() * 13);
            boolean z = bitmap2.getWidth() == iG;
            if (!z) {
                String name = iy4.class.getName();
                StringBuilder sbJ = wg0.j("Sprite is not width enough - index: ", i, "; width: ", bitmap2.getWidth(), "; requiredWidth: ");
                sbJ.append(iG);
                hm9.p(name, "Sprite is not width enough, may be a problem of extracting emoji", new IllegalWidthSpriteException(sbJ.toString()));
            }
            if (z) {
                float f = nx4Var.b;
                iy4 iy4Var2 = (iy4) this.c;
                int iG2 = tu0.G(((Number) iy4Var2.b.getValue()).floatValue() * f);
                int iG3 = tu0.G(((Number) iy4Var2.b.getValue()).floatValue() * nx4Var.c);
                int iG4 = tu0.G(iy4Var2.a());
                Rect rect = iy4.c;
                rect.left = 0;
                rect.top = 0;
                rect.right = iG4;
                rect.bottom = iG4;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, ote.e(iG2, 0, bitmap2.getWidth() - iG4), ote.e(iG3, 0, bitmap2.getHeight() - iG4), iG4, iG4);
                ((bo0) ((adb) this.b).b).d(new nx4(nx4Var.a, nx4Var.b, nx4Var.c), bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
        }
        String name2 = nw4.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name2, ey8.j("Cannot resolve SpriteBitmap. It's null - ", bitmap2 == null), null);
        }
        gy4 gy4Var = (gy4) this.o;
        gy4Var.g.computeIfAbsent(Integer.valueOf(i), new di(9, new m8(i, 2, gy4Var)));
        return null;
    }

    @Override // defpackage.abe
    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.b;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                g4g g4gVar = (g4g) list.get(i);
                xz3 xz3Var = g4gVar.a;
                if (xz3Var.X == -3.4028235E38f) {
                    arrayList2.add(g4gVar);
                } else {
                    arrayList.add(xz3Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new ye4(28));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            vz3 vz3VarA = ((g4g) arrayList2.get(i3)).a.a();
            vz3VarA.e = (-1) - i3;
            vz3VarA.f = 1;
            arrayList.add(vz3VarA.a());
        }
        return arrayList;
    }

    public void q(TextPaint textPaint) {
        kqe kqeVar = i4f.r;
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.o;
        kqeVar.a(textPaint, endlessRecyclerView2.getResources().getDisplayMetrics(), du4.b);
        textPaint.setColor(qp4.u0.j(endlessRecyclerView2).getText().i);
    }

    public xs4 r(ac0 ac0Var) {
        iee ieeVar;
        Rect rectH;
        kq0.e();
        this.o = new xs4();
        Iterator it = ac0Var.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ieeVar = ac0Var.a;
            if (zHasNext) {
                cb0 cb0Var = (cb0) it.next();
                xs4 xs4Var = (xs4) this.o;
                Rect rect = cb0Var.d;
                Matrix matrix = new Matrix(ieeVar.b);
                RectF rectF = new RectF(rect);
                RectF rectF2 = e1f.a;
                float f = 0;
                Size size = cb0Var.e;
                RectF rectF3 = new RectF(f, f, size.getWidth(), size.getHeight());
                int i = cb0Var.f;
                boolean z = cb0Var.g;
                Matrix matrixA = e1f.a(rectF, rectF3, i, z);
                matrix.postConcat(matrixA);
                c54.k(e1f.d(e1f.g(e1f.e(rect), i), false, size));
                if (cb0Var.h) {
                    Rect rect2 = cb0Var.d;
                    Rect rect3 = ieeVar.d;
                    c54.j("Output crop rect " + rect2 + " must contain input crop rect " + rect3, rect2.contains(rect3));
                    rectH = new Rect();
                    RectF rectF4 = new RectF(rect3);
                    matrixA.mapRect(rectF4);
                    rectF4.round(rectH);
                } else {
                    rectH = e1f.h(size);
                }
                x3c x3cVarA = ieeVar.g.a();
                x3cVarA.b = size;
                xs4Var.put(cb0Var, new iee(cb0Var.b, cb0Var.c, x3cVarA.c(), matrix, false, rectH, ieeVar.i - i, -1, ieeVar.e != z));
            } else {
                try {
                    break;
                } catch (ProcessingException unused) {
                }
            }
        }
        ((lee) this.b).a(ieeVar.d((ax1) this.c, true));
        for (Map.Entry entry : ((xs4) this.o).entrySet()) {
            k(ieeVar, entry);
            ((iee) entry.getValue()).a(new ewc(this, ieeVar, entry, 6));
        }
        cy1 cy1Var = new cy1(7, (xs4) this.o);
        ieeVar.getClass();
        ieeVar.o.add(cy1Var);
        return (xs4) this.o;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                jo7 jo7Var = (jo7) ((jo7) this.c).c;
                String str = "";
                while (jo7Var != null) {
                    Object obj = jo7Var.b;
                    sb.append(str);
                    String str2 = (String) jo7Var.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    jo7Var = (jo7) jo7Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.abe
    public int u() {
        return ((long[]) this.o).length;
    }

    public /* synthetic */ nw4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public nw4(sy4 sy4Var) {
        this.a = 11;
        oq9 oq9Var = s5c.a;
        pq9 pq9Var = wmd.c;
        this.b = sy4Var;
        this.c = oq9Var;
        this.o = pq9Var;
    }

    public nw4(List list, og5 og5Var, pg5 pg5Var) {
        this.a = 3;
        this.b = list;
        this.c = og5Var;
        this.o = pg5Var;
        System.currentTimeMillis();
    }

    public nw4(ArrayList arrayList) {
        this.a = 14;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            g4g g4gVar = (g4g) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = g4gVar.b;
            jArr[i2 + 1] = g4gVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public nw4(int i, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = 13;
        this.b = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.o = bArr;
    }

    public nw4(ax1 ax1Var, lee leeVar) {
        this.a = 12;
        this.c = ax1Var;
        this.b = leeVar;
    }

    public nw4(String str) {
        this.a = 9;
        jo7 jo7Var = new jo7();
        this.c = jo7Var;
        this.o = jo7Var;
        this.b = str;
    }

    public nw4(d84 d84Var) {
        this.a = 5;
        this.o = d84Var;
        this.b = new Handler();
        this.c = new b84(0, this);
    }

    public nw4(Object[] objArr, Object[] objArr2) {
        this.a = 7;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i] = numValueOf.intValue();
        }
        this.b = iArr;
        this.c = j(objArr, iArr);
        this.o = j(objArr2, iArr);
    }
}
