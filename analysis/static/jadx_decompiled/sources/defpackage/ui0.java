package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ui0 implements grd, wu, qj3, m87, jm7, km7, u98, ri8, b66, ehe {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ui0(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    @Override // defpackage.ehe
    public Object a() {
        ((t8f) this.c).d.a((hc0) this.o, this.b + 1, false);
        return null;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                u82 u82Var = (u82) obj;
                ((p82) this.c).getClass();
                us usVar = new us(0);
                for (Long l : (List) this.o) {
                    s82 s82Var = new s82();
                    s82Var.b = l.longValue();
                    s82Var.a = this.b;
                    usVar.put(l, new t82(s82Var));
                }
                u82Var.R.putAll(usVar);
                break;
            case 3:
                u82 u82Var2 = (u82) obj;
                w82 w82VarA = ((x82) this.c).a();
                w82VarA.a = this.b;
                x82 x82VarA = w82VarA.a();
                HashSet hashSet = b10.D0;
                Set set = (Set) this.o;
                if (tpa.f(hashSet, set)) {
                    u82Var2.q = x82VarA;
                    break;
                } else if (tpa.f(b10.E0, set)) {
                    u82Var2.r = x82VarA;
                    break;
                } else if (tpa.f(b10.F0, set)) {
                    u82Var2.s = x82VarA;
                    break;
                } else if (tpa.f(b10.G0, set)) {
                    u82Var2.t = x82VarA;
                    break;
                } else if (tpa.f(b10.H0, set)) {
                    u82Var2.u = x82VarA;
                    break;
                } else if (tpa.f(b10.I0, set)) {
                    u82Var2.v = x82VarA;
                    break;
                } else if (tpa.f(b10.J0, set)) {
                    u82Var2.w = x82VarA;
                    break;
                }
                break;
            default:
                yqe yqeVar = (yqe) obj;
                int iOrdinal = ((lk7) this.o).ordinal();
                Spannable spannable = (Spannable) this.c;
                int i = this.b;
                if (iOrdinal == 1) {
                    spannable.setSpan(new ti6(yqeVar.c, i), yqeVar.a, yqeVar.b, 33);
                    break;
                } else if (iOrdinal == 2) {
                    spannable.setSpan(new cq0(yqeVar.c, i), yqeVar.a, yqeVar.b, 33);
                    break;
                } else if (iOrdinal == 3) {
                    spannable.setSpan(new cmb(yqeVar.c, i), yqeVar.a, yqeVar.b, 33);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        ov6 ov6Var;
        su1 su1Var = (su1) this.c;
        su1Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.o).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            st1 st1Var = su1Var.d;
            if (!zHasNext) {
                st1Var.z(arrayList2);
                return kq0.b(arrayList);
            }
            kz1 kz1Var = (kz1) it.next();
            u40 u40Var = new u40(kz1Var);
            pv1 pv1Var = null;
            int i = kz1Var.c;
            if (i == 5) {
                mag magVar = st1Var.l;
                if (!magVar.d && !magVar.c) {
                    try {
                        ov6Var = (ov6) magVar.b.d();
                    } catch (NoSuchElementException unused) {
                        ov6Var = null;
                    }
                    if (ov6Var != null) {
                        mag magVar2 = st1Var.l;
                        magVar2.getClass();
                        Image imageZ = ov6Var.Z();
                        ImageWriter imageWriter = magVar2.j;
                        if (imageWriter != null && imageZ != null) {
                            try {
                                imageWriter.queueInputImage(imageZ);
                                su6 imageInfo = ov6Var.getImageInfo();
                                if (imageInfo instanceof qv1) {
                                    pv1Var = ((qv1) imageInfo).a;
                                }
                            } catch (IllegalStateException e) {
                                e.getMessage();
                            }
                        }
                    }
                }
            }
            if (pv1Var != null) {
                u40Var.h = pv1Var;
            } else {
                int i2 = (su1Var.a != 3 || su1Var.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    u40Var.c = i2;
                }
            }
            oq0 oq0Var = su1Var.e;
            if (oq0Var.b && this.b == 0 && oq0Var.a) {
                mi9 mi9VarB = mi9.b();
                mi9VarB.j(cv1.v0(CaptureRequest.CONTROL_AE_MODE), 3);
                u40Var.c(new cv1(8, wma.a(mi9VarB)));
            }
            arrayList.add(f8.g(new f9(su1Var, 13, u40Var)));
            arrayList2.add(u40Var.d());
        }
    }

    @Override // defpackage.ri8
    public void b(oh8 oh8Var) {
        si8 si8Var = (si8) this.c;
        si8Var.getClass();
        ja8 ja8Var = (ja8) this.o;
        if (TextUtils.isEmpty(ja8Var.a)) {
            z04.c0("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        bm7 bm7VarK = si8Var.f.k(oh8Var, zw6.n(gf7.h(ja8Var)));
        jn jnVar = new jn(si8Var, oh8Var, this.b);
        bm7VarK.d(new h76(bm7VarK, 0, jnVar), nk4.a);
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 7:
                w98 w98Var = (w98) this.c;
                obd obdVar = w98Var.k;
                obdVar.getClass();
                int iF = obdVar.a.f();
                int i2 = this.b;
                tb8 tb8Var = (tb8) this.o;
                ga8 ga8Var = w98Var.c;
                if (iF < 2) {
                    qr6Var.E(ga8Var, i, i2 + 1, tb8Var.d(true));
                    qr6Var.L(ga8Var, i, i2);
                    break;
                } else {
                    qr6Var.D0(ga8Var, i, i2, tb8Var.d(true));
                    break;
                }
            default:
                w98 w98Var2 = (w98) this.c;
                w98Var2.getClass();
                ww6 ww6VarI = zw6.i();
                int i3 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i3 >= list.size()) {
                        qr6Var.U(w98Var2.c, i, this.b, new pu0(ww6VarI.j()));
                        break;
                    } else {
                        ww6VarI.a(((tb8) list.get(i3)).d(true));
                        i3++;
                    }
                }
        }
    }

    @Override // defpackage.m87
    public void e(g05 g05Var, int i) throws Throwable {
        String str;
        String str2;
        long j;
        hab habVar;
        l43 l43Var;
        v84 v84Var;
        int i2 = i;
        if (g05Var == null) {
            return;
        }
        j54 j54Var = (j54) this.c;
        eab eabVar = j54Var.c;
        oj0 oj0Var = (oj0) eabVar;
        wv6 wv6Var = oj0Var.a;
        g05Var.o0();
        oj0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, g05Var.c.a);
        Uri uri = wv6Var.b;
        g05Var.v0 = uri != null ? uri.toString() : null;
        k54 k54Var = (k54) this.o;
        bp4 bp4Var = wv6Var.t;
        if (bp4Var == null) {
            bp4Var = k54Var.e;
        }
        boolean zL = fi0.l(i2, 16);
        if ((bp4Var == bp4.a || (bp4Var == bp4.b && !zL)) && (k54Var.f || !e9f.e(wv6Var.b))) {
            g05Var.s0 = mqd.g(wv6Var.j, wv6Var.i, g05Var, this.b);
        }
        oj0Var.w0.v.getClass();
        int i3 = j54Var.h;
        g05Var.o0();
        if ((g05Var.c != qb4.a && fi0.b(i)) || j54Var.f || !g05.m0(g05Var)) {
            return;
        }
        g05Var.o0();
        boolean zF = tpa.f(g05Var.c, qb4.c);
        hab habVar2 = j54Var.d;
        if (zF) {
            g05Var.o0();
            long j2 = g05Var.Y;
            g05Var.o0();
            long j3 = g05Var.Z;
            ju6 ju6Var = j54Var.e;
            if (j2 * j3 * qo0.b(ju6Var.a) > 104857600) {
                g05Var.o0();
                int i4 = g05Var.Y;
                g05Var.o0();
                StringBuilder sbJ = wg0.j("Image is too big to attempt decoding: w = ", i4, ", h = ", g05Var.Z, ", pixel config = ");
                sbJ.append(ju6Var.a);
                sbJ.append(", max bitmap size = 104857600");
                IllegalStateException illegalStateException = new IllegalStateException(sbJ.toString());
                habVar2.d(eabVar, "DecodeProducer", illegalStateException, null);
                j54Var.q(illegalStateException);
                return;
            }
        }
        g05Var.o0();
        String str3 = g05Var.c.a;
        String str4 = str3 == null ? "unknown" : str3;
        g05Var.o0();
        int i5 = g05Var.Y;
        g05Var.o0();
        String str5 = i5 + "x" + g05Var.Z;
        String strValueOf = String.valueOf(g05Var.s0);
        boolean zA = fi0.a(i);
        boolean z = zA && !fi0.l(i2, 8);
        boolean zL2 = fi0.l(i2, 4);
        jic jicVar = oj0Var.a.i;
        if (jicVar != null) {
            str = jicVar.a + "x" + jicVar.b;
        } else {
            str = "unknown";
        }
        try {
            n87 n87Var = j54Var.g;
            synchronized (n87Var) {
                str2 = str4;
                j = n87Var.i - n87Var.h;
            }
            String string = ((oj0) eabVar).a.b.toString();
            int iO = (z || zL2) ? g05Var.o() : j54Var.n(g05Var);
            hx6 hx6VarO = (z || zL2) ? hx6.d : j54Var.o();
            habVar2.j(eabVar, "DecodeProducer");
            try {
                l43 l43VarR = j54Var.r(g05Var, iO, hx6VarO);
                try {
                    if (g05Var.s0 != 1) {
                        i2 |= 16;
                    }
                    int i6 = i2;
                    try {
                        habVar2.a(eabVar, "DecodeProducer", j54Var.m(l43VarR, j, hx6VarO, zA, str2, str5, str, strValueOf));
                        j54Var.t(g05Var, l43VarR, i3);
                        sy4 sy4Var = (sy4) j54Var.i.j.b;
                        if (l43VarR == null) {
                            v84Var = null;
                        } else {
                            hx9 hx9Var = o43.X;
                            sy4Var.f();
                            boolean z2 = l43VarR instanceof Bitmap;
                            v84Var = new v84(l43VarR, hx9Var, sy4Var, null, true);
                        }
                        try {
                            j54Var.s(fi0.a(i6));
                            j54Var.b.g(i6, v84Var);
                        } finally {
                            o43.S(v84Var);
                        }
                    } catch (Throwable th) {
                        th = th;
                        g05.d(g05Var);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    habVar = habVar2;
                    l43Var = l43VarR;
                    habVar.d(eabVar, "DecodeProducer", e, j54Var.m(l43Var, j, hx6VarO, zA, str2, str5, str, strValueOf));
                    j54Var.q(e);
                    g05.d(g05Var);
                }
            } catch (DecodeException e2) {
                habVar = habVar2;
                try {
                    g05 g05Var2 = e2.a;
                    ta5.m("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), string, g05Var2.m(), Integer.valueOf(g05Var2.o()));
                    throw e2;
                } catch (Exception e3) {
                    e = e3;
                    l43Var = null;
                    habVar.d(eabVar, "DecodeProducer", e, j54Var.m(l43Var, j, hx6VarO, zA, str2, str5, str, strValueOf));
                    j54Var.q(e);
                    g05.d(g05Var);
                }
            } catch (Exception e4) {
                e = e4;
                habVar = habVar2;
                l43Var = null;
                habVar.d(eabVar, "DecodeProducer", e, j54Var.m(l43Var, j, hx6VarO, zA, str2, str5, str, strValueOf));
                j54Var.q(e);
                g05.d(g05Var);
            }
            g05.d(g05Var);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                m3b m3bVar = (m3b) obj;
                m3bVar.getClass();
                m3bVar.C((o3b) this.c, (o3b) this.o, this.b);
                break;
            default:
                n3b n3bVar = (n3b) obj;
                int i = this.b;
                n3bVar.p(i);
                n3bVar.q((p3b) this.c, (p3b) this.o, i);
                break;
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        Object objV;
        switch (this.a) {
            case 0:
                ((qy7) this.c).i.getClass();
                Resources resources = ((Context) this.o).getResources();
                int i = this.b;
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    while (true) {
                        try {
                            int i2 = inputStreamOpenRawResource.read(bArr, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                            if (i2 == -1) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused2) {
                                }
                                nqdVar.a(new xy7(new wy7(new String(byteArrayOutputStream.toByteArray(), "UTF-8"))));
                                return;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    throw new Resources.NotFoundException("Failed to read resource " + i + ": " + e.toString());
                }
            default:
                ede edeVar = (ede) this.c;
                ArrayList arrayList = edeVar.p;
                if (arrayList.isEmpty() && edeVar.e()) {
                    long j = edeVar.n.a;
                    dq0 dq0Var = edeVar.d;
                    dq0Var.getClass();
                    try {
                        objV = pag.v(((kk5) dq0Var.a).e(j));
                    } catch (Exception e2) {
                        hm9.m("dq0", "Failed to load botCommands, chatId = %d, exception message = %s", Long.valueOf(j), e2.getMessage());
                    }
                    eq0 eq0Var = objV != null ? (eq0) objV : null;
                    if (eq0Var != null) {
                        List list = eq0Var.a;
                        Map map = eq0Var.b;
                        y8 y8Var = edeVar.f;
                        HashMap map2 = (HashMap) map;
                        y8Var.getClass();
                        List listEmptyList = list == null ? Collections.emptyList() : nd7.F(list, new f9(y8Var, 3, map2));
                        synchronized (edeVar) {
                            edeVar.p.clear();
                            edeVar.p.addAll(listEmptyList);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(edeVar.e.f((String) this.o, this.b, new ArrayList(arrayList), edeVar.c()));
                if (nqdVar.h()) {
                    return;
                }
                nqdVar.a(arrayList2);
                return;
        }
    }

    public /* synthetic */ ui0(x82 x82Var, int i, jz2 jz2Var, Set set) {
        this.a = 3;
        this.c = x82Var;
        this.b = i;
        this.o = set;
    }

    public /* synthetic */ ui0(k9c k9cVar, List list) {
        this.a = 11;
        this.c = k9cVar;
        this.b = 10;
        this.o = list;
    }

    public /* synthetic */ ui0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ ui0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        p8f p8fVar;
        Object obj2 = this.o;
        int i = this.b;
        Object obj3 = this.c;
        int i2 = 2;
        int i3 = 3;
        switch (this.a) {
            case 11:
                List list = (List) obj;
                k9c k9cVar = (k9c) obj3;
                k9cVar.getClass();
                int size = list.size();
                hb3 hb3VarJ = qy9.j(list);
                if (size == i) {
                    return hb3VarJ;
                }
                hm9.n("k9c", "getRecentContactsOldWay");
                return new xy9(new cz9((qy9) new hb3(i3, new r1a[]{hb3VarJ, new ty9(qy9.j((List) obj2), new j9c(k9cVar, i3), 1).i(new p4c(6), Integer.MAX_VALUE)}), (b66) ft.b, wq5.a, 2), new p4c(i2)).s(i);
            default:
                sq6 sq6Var = (sq6) obj;
                ((c7f) obj3).getClass();
                boolean z = sq6Var.a;
                p8f p8fVar2 = null;
                v6f v6fVar = (v6f) obj2;
                String str = sq6Var.b;
                if (z && (i == 3 || h4f.a(i) || i == 7)) {
                    String strV = z7.v(str);
                    if (!oag.t(strV)) {
                        o8f o8fVar = new o8f();
                        o8fVar.a = strV;
                        p8fVar = new p8f(o8fVar);
                        p8fVar2 = p8fVar;
                    }
                } else if (z && h4f.b(i)) {
                    if (!oag.t(str)) {
                        String strZ = z7.z(str);
                        if (oag.t(strZ)) {
                            hm9.p("c7f", str, null);
                        } else {
                            o8f o8fVar2 = new o8f();
                            o8fVar2.a = strZ;
                            p8fVar = new p8f(o8fVar2);
                            p8fVar2 = p8fVar;
                        }
                    }
                } else {
                    p8fVar2 = v6fVar.h;
                }
                if (z && p8fVar2 == null) {
                    throw new UploadException("upload failed. no upload result on finished upload");
                }
                if (z && oag.t(p8fVar2.a) && p8fVar2.b <= 0) {
                    throw new UploadException("upload failed. token and attachId are empty");
                }
                long j = sq6Var.d;
                if (j != 0) {
                    u6f u6fVarB = v6fVar.b();
                    u6fVarB.h = p8fVar2;
                    u6fVarB.g = z ? q8f.UPLOADED : q8f.UPLOADING;
                    u6fVarB.e = sq6Var.c;
                    u6fVarB.f = j;
                    return new v6f(u6fVarB);
                }
                throw new UploadException("upload failed. file has zero size");
        }
    }
}
