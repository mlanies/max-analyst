package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioRecord;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.view.View;
import androidx.fragment.app.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes.dex */
public abstract class wmd {
    public static volatile vmd a;
    public static volatile ArrayList b;
    public static final pq9 c = new pq9();
    public static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS"};
    public static final String[] f = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] g = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] h = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    public static SharedPreferences i;

    public static tpb A(byte[] bArr) {
        int iS;
        yaf yafVar = new yaf(bArr);
        if (yafVar.c < 32) {
            return null;
        }
        yafVar.H(0);
        if (yafVar.h() != yafVar.c() + 4 || yafVar.h() != 1886614376 || (iS = oy.s(yafVar.h())) > 1) {
            return null;
        }
        UUID uuid = new UUID(yafVar.p(), yafVar.p());
        if (iS == 1) {
            yafVar.I(yafVar.y() * 16);
        }
        int iY = yafVar.y();
        if (iY != yafVar.c()) {
            return null;
        }
        byte[] bArr2 = new byte[iY];
        yafVar.g(0, bArr2, iY);
        return new tpb(uuid, iS, bArr2);
    }

    public static byte[] B(UUID uuid, byte[] bArr) {
        tpb tpbVarA = A(bArr);
        if (tpbVarA == null) {
            return null;
        }
        UUID uuid2 = tpbVarA.a;
        if (uuid.equals(uuid2)) {
            return tpbVarA.c;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(uuid2);
        new StringBuilder(strValueOf2.length() + strValueOf.length() + 33);
        return null;
    }

    public static long C(wpa wpaVar, int i2, int i3) {
        wpaVar.G(i2);
        if (wpaVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = wpaVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i3 || (iG & 32) == 0 || wpaVar.u() < 7 || wpaVar.a() < 7 || (wpaVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        wpaVar.e(0, new byte[6], 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static void D(a aVar, String[] strArr, int i2) {
        try {
            aVar.requestPermissions(strArr, i2);
            H(r(aVar.d0()), strArr);
        } catch (Exception e2) {
            x6a x6aVar = nd7.h;
            if (x6aVar == null) {
                x6aVar = null;
            }
            x6aVar.getClass();
            hm9.p("wmd", "Can't request permission", e2);
        }
    }

    public static int E(int i2, int i3, int i4, int i5, int i6, Range range) {
        Rational rational = new Rational(i3, i4);
        int iDoubleValue = (int) (new Rational(i5, i6).doubleValue() * rational.doubleValue() * i2);
        if (mqd.u(3, "AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(iDoubleValue));
        }
        if (!o90.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (mqd.u(3, "AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        return iDoubleValue;
    }

    public static int F(Range range, int i2, int i3, int i4) {
        ArrayList arrayList = null;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (range.contains((Range) Integer.valueOf(i5))) {
                int i7 = h70.n;
                if (i5 > 0 && i2 > 0) {
                    if (AudioRecord.getMinBufferSize(i5, i2 == 1 ? 16 : 12, i3) > 0) {
                        return i5;
                    }
                }
            } else {
                range.toString();
            }
            if (arrayList == null) {
                arrayList = new ArrayList(n90.e);
                Collections.sort(arrayList, new y30(i4, 0));
            }
            if (i6 >= arrayList.size()) {
                return 44100;
            }
            int i8 = i6 + 1;
            int iIntValue = ((Integer) arrayList.get(i6)).intValue();
            i6 = i8;
            i5 = iIntValue;
        }
    }

    public static final void G(View view, isc iscVar) {
        view.setTag(fvb.view_tree_saved_state_registry_owner, iscVar);
    }

    public static void H(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str + "_req", true);
        }
        editorEdit.apply();
    }

    public static final mh1 I(gpd gpdVar) {
        return new mh1(gpdVar.a, gpdVar.b, gpdVar.c, gpdVar.d, gpdVar.e, gpdVar.f);
    }

    public static final String J(Object obj, boolean z, boolean z2) {
        return obj == null ? "null" : obj instanceof ct7 ? ((ct7) obj).getClass().getName().concat(".NULL") : obj instanceof dt7 ? ((dt7) obj).a(z, z2) : obj.toString();
    }

    public static final void L(y5f y5fVar) {
        lz7.Z(y5fVar);
        y5fVar.e(cu7.class, new uza(21));
        y5fVar.e(t23.class, new uza(23));
        y5fVar.e(pk.class, new qxc(2));
        y5fVar.e(qj6.class, new rxc(11));
        y5fVar.e(v7g.class, new rxc(22));
        y5fVar.e(eoe.class, new sxc(3));
        y5fVar.e(boe.class, new sxc(14));
        y5fVar.e(zwd.class, new sxc(25));
        y5fVar.e(k33.class, new txc(6));
        y5fVar.e(bd4.class, new txc(17));
        y5fVar.e(s84.class, new txc(28));
        y5fVar.c(qu7.class, new dcb(17));
        y5fVar.e(jbd.class, new n7b(22));
        y5fVar.e(mh3.class, new nxc(3));
        y5fVar.e(hbd.class, new nxc(14));
        y5fVar.e(ch3.class, new nxc(25));
        y5fVar.e(yle.class, new oxc(6));
        y5fVar.e(mle.class, new oxc(17));
        y5fVar.e(oad.class, new oxc(28));
        y5fVar.e(ome.class, new pxc(9));
        y5fVar.e(cy7.class, new pxc(20));
        y5fVar.e(av0.class, new qxc(1));
        y5fVar.e(s8g.class, new qxc(13));
        y5fVar.e(yme.class, new qxc(24));
        y5fVar.e(k24.class, new rxc(3));
        y5fVar.e(c34.class, new rxc(4));
        y5fVar.e(vxc.class, new rxc(5));
        y5fVar.e(xxc.class, new rxc(6));
        y5fVar.e(yxc.class, new rxc(7));
        y5fVar.e(pfa.class, new rxc(8));
        y5fVar.e(jlc.class, new uza(24));
        y5fVar.e(OneMeRoomDatabase.class, new uza(25));
        y5fVar.e(mtf.class, new dcb(27));
        y5fVar.e(js7.class, new rxc(9));
        y5fVar.c(qu7.class, new dcb(19));
        y5fVar.e(ad.class, new rxc(10));
        y5fVar.e(sj6.class, new dcb(28));
        y5fVar.e(cw9.class, new dcb(29));
        y5fVar.e(u0b.class, new rxc(12));
        y5fVar.e(mqf.class, new rxc(13));
        y5fVar.e(tg.class, new rxc(14));
        y5fVar.e(ds3.class, new rxc(15));
        y5fVar.e(xc4.class, new rxc(16));
        y5fVar.e(u7b.class, new rxc(17));
        y5fVar.c(qu7.class, new dcb(20));
        y5fVar.e(w7b.class, new rxc(18));
        y5fVar.e(y7b.class, new rxc(19));
        y5fVar.e(el3.class, new rxc(20));
        y5fVar.e(v6b.class, new rxc(21));
        y5fVar.e(t6b.class, new rxc(23));
        y5fVar.e(zx8.class, new rxc(24));
        y5fVar.e(sw8.class, new rxc(25));
        y5fVar.e(ns8.class, new uza(26));
        y5fVar.e(kr2.class, new rxc(26));
        y5fVar.e(zu8.class, new rxc(27));
        y5fVar.e(r79.class, new rxc(28));
        y5fVar.e(sna.class, new rxc(29));
        y5fVar.e(au8.class, new sxc(0));
        y5fVar.e(ma2.class, new sxc(1));
        y5fVar.e(rhc.class, new sxc(2));
        y5fVar.e(hc2.class, new sxc(4));
        y5fVar.e(p82.class, new sxc(5));
        y5fVar.e(jz2.class, new sxc(6));
        y5fVar.e(iy2.class, new sxc(7));
        y5fVar.e(zrc.class, new sxc(8));
        y5fVar.c(qu7.class, new dcb(21));
        y5fVar.e(mm2.class, new uza(27));
        y5fVar.e(ps2.class, new uza(28));
        y5fVar.e(yu2.class, new sxc(9));
        y5fVar.e(t12.class, new sxc(10));
        y5fVar.e(r12.class, new sxc(11));
        y5fVar.e(yfc.class, new sxc(12));
        y5fVar.e(xb9.class, new sxc(13));
        y5fVar.c(qu7.class, new dcb(22));
        y5fVar.e(dr9.class, new sxc(15));
        y5fVar.c(qu7.class, new dcb(23));
        y5fVar.e(mq3.class, new sxc(16));
        y5fVar.e(zi5.class, new sxc(17));
        y5fVar.e(o2e.class, new sxc(18));
        y5fVar.e(y4e.class, new sxc(19));
        y5fVar.e(e4e.class, new sxc(20));
        y5fVar.e(e8d.class, new sxc(21));
        y5fVar.e(pl.class, new sxc(22));
        y5fVar.e(x9c.class, new sxc(23));
        y5fVar.e(dg5.class, new sxc(24));
        y5fVar.e(xt7.class, new sxc(26));
        y5fVar.e(a4e.class, new sxc(27));
        y5fVar.c(qu7.class, new dcb(24));
        y5fVar.e(md5.class, new sxc(28));
        y5fVar.e(sc5.class, new sxc(29));
        y5fVar.c(qu7.class, new dcb(25));
        y5fVar.e(tu.class, new txc(0));
        y5fVar.e(ta2.class, new txc(1));
        y5fVar.c(qu7.class, new dcb(26));
        y5fVar.e(of9.class, new txc(2));
        y5fVar.e(t20.class, new txc(3));
        y5fVar.e(rf5.class, new txc(4));
        y5fVar.e(jrc.class, new txc(5));
        y5fVar.e(bv4.class, new txc(7));
        y5fVar.e(cyd.class, new txc(8));
        y5fVar.e(u2a.class, new txc(9));
        y5fVar.e(tke.class, new txc(10));
        y5fVar.e(cz.class, new txc(11));
        y5fVar.e(lx8.class, new txc(12));
        y5fVar.e(p7c.class, new txc(13));
        y5fVar.e(u23.class, new txc(14));
        y5fVar.e(zfc.class, new txc(15));
        y5fVar.e(j52.class, new txc(16));
        y5fVar.e(bn3.class, new txc(18));
        y5fVar.e(jc2.class, new txc(19));
        y5fVar.e(fd1.class, new txc(20));
        y5fVar.e(jy8.class, new txc(21));
        y5fVar.e(s9b.class, new txc(22));
        y5fVar.e(ku7.class, new txc(23));
        y5fVar.e(cn7.class, new txc(24));
        y5fVar.e(ioe.class, new txc(25));
        y5fVar.e(glc.class, new txc(26));
        y5fVar.e(wlc.class, new txc(27));
        y5fVar.e(vlc.class, new n7b(12));
        y5fVar.e(elc.class, new n7b(13));
        y5fVar.e(imc.class, new n7b(14));
        y5fVar.e(hmc.class, new n7b(15));
        y5fVar.e(y8f.class, new n7b(16));
        y5fVar.e(py8.class, new n7b(17));
        y5fVar.e(up4.class, new n7b(18));
        y5fVar.e(yef.class, new n7b(19));
        y5fVar.e(dp3.class, new n7b(20));
        y5fVar.e(nd2.class, new n7b(21));
        y5fVar.e(c4e.class, new n7b(23));
        y5fVar.e(wc5.class, new n7b(24));
        y5fVar.e(hc5.class, new n7b(25));
        y5fVar.e(p9c.class, new n7b(26));
        y5fVar.e(ka4.class, new n7b(27));
        y5fVar.e(hd1.class, new n7b(28));
        y5fVar.e(gj.class, new n7b(29));
        y5fVar.e(rj.class, new nxc(0));
        y5fVar.e(r47.class, new nxc(1));
        y5fVar.e(fme.class, new nxc(2));
        y5fVar.e(hd5.class, new nxc(4));
        y5fVar.e(dd5.class, new nxc(5));
        y5fVar.e(zle.class, new nxc(6));
        y5fVar.e(ge2.class, new nxc(7));
        y5fVar.e(wle.class, new nxc(8));
        y5fVar.e(bs9.class, new nxc(9));
        y5fVar.e(rw9.class, new nxc(10));
        y5fVar.c(qu7.class, new dcb(7));
        y5fVar.e(rs9.class, new nxc(11));
        y5fVar.e(lt9.class, new nxc(12));
        y5fVar.e(s7d.class, new nxc(13));
        y5fVar.e(mz6.class, new nxc(15));
        y5fVar.e(ime.class, new nxc(16));
        y5fVar.e(xr9.class, new nxc(17));
        y5fVar.e(fs9.class, new nxc(18));
        y5fVar.e(js9.class, new nxc(19));
        y5fVar.e(ur9.class, new nxc(20));
        y5fVar.e(sr9.class, new nxc(21));
        y5fVar.e(ts9.class, new nxc(22));
        y5fVar.e(qr9.class, new nxc(23));
        y5fVar.e(ds9.class, new nxc(24));
        y5fVar.e(lr9.class, new nxc(26));
        y5fVar.e(as9.class, new nxc(27));
        y5fVar.e(vs9.class, new nxc(28));
        y5fVar.e(ps9.class, new nxc(29));
        y5fVar.e(pd0.class, new oxc(0));
        y5fVar.e(o44.class, new oxc(1));
        y5fVar.e(dq0.class, new oxc(2));
        y5fVar.e(mp4.class, new oxc(3));
        y5fVar.e(wef.class, new oxc(4));
        y5fVar.e(cde.class, new oxc(5));
        y5fVar.e(dz.class, new oxc(7));
        y5fVar.e(b0d.class, new oxc(8));
        y5fVar.e(jva.class, new oxc(9));
        y5fVar.e(bva.class, new oxc(10));
        y5fVar.c(qu7.class, new dcb(8));
        y5fVar.e(rk4.class, new oxc(11));
        y5fVar.e(gn4.class, new oxc(12));
        y5fVar.e(eqb.class, new oxc(13));
        y5fVar.c(qu7.class, new dcb(9));
        y5fVar.e(kw9.class, new oxc(14));
        y5fVar.c(qu7.class, new dcb(10));
        y5fVar.e(qx9.class, new oxc(15));
        y5fVar.e(n79.class, new oxc(16));
        y5fVar.c(qu7.class, new dcb(11));
        y5fVar.e(b79.class, new oxc(18));
        y5fVar.e(ng5.class, new oxc(19));
        y5fVar.e(wa4.class, new oxc(20));
        y5fVar.e(pg5.class, new oxc(21));
        y5fVar.e(y4d.class, new oxc(22));
        y5fVar.e(oq3.class, new oxc(23));
        y5fVar.e(xj3.class, new oxc(24));
        y5fVar.e(ck3.class, new oxc(25));
        y5fVar.e(gq3.class, new oxc(26));
        y5fVar.e(qq3.class, new oxc(27));
        y5fVar.e(yj3.class, new oxc(29));
        y5fVar.e(hq3.class, new pxc(0));
        y5fVar.e(ew9.class, new pxc(1));
        y5fVar.c(qu7.class, new dcb(12));
        y5fVar.e(ud5.class, new pxc(2));
        y5fVar.c(qu7.class, new dcb(13));
        y5fVar.e(le5.class, new pxc(3));
        y5fVar.c(qu7.class, new dcb(14));
        y5fVar.e(fqb.class, new pxc(4));
        y5fVar.e(rx9.class, new pxc(5));
        y5fVar.e(yx9.class, new pxc(6));
        y5fVar.c(qu7.class, new dcb(15));
        y5fVar.e(cm2.class, new pxc(7));
        y5fVar.e(yo7.class, new pxc(8));
        y5fVar.e(he5.class, new pxc(10));
        y5fVar.e(aw9.class, new pxc(11));
        y5fVar.e(xv9.class, new pxc(12));
        y5fVar.d(rke.class, new pxc(13));
        y5fVar.d(ak3.class, new pxc(14));
        y5fVar.d(are.class, new pxc(15));
        y5fVar.d(av6.class, new pxc(16));
        y5fVar.d(oz7.class, new pxc(17));
        y5fVar.d(cc6.class, new pxc(18));
        y5fVar.d(q50.class, new pxc(19));
        y5fVar.d(crd.class, new pxc(21));
        y5fVar.d(gn7.class, new pxc(22));
        y5fVar.d(yx7.class, new pxc(23));
        y5fVar.d(qx7.class, new pxc(24));
        y5fVar.d(yb9.class, new pxc(25));
        y5fVar.d(qh5.class, new pxc(26));
        y5fVar.d(ga4.class, new pxc(27));
        y5fVar.b(qu7.class, new dcb(16));
        y5fVar.d(hx9.class, new pxc(28));
        y5fVar.d(agc.class, new pxc(29));
        y5fVar.d(mh5.class, new qxc(0));
        y5fVar.d(g8f.class, new qxc(3));
        y5fVar.d(oz.class, new qxc(4));
        y5fVar.d(mc6.class, new qxc(5));
        y5fVar.d(nkd.class, new qxc(6));
        y5fVar.d(k9c.class, new qxc(7));
        y5fVar.d(ec6.class, new qxc(8));
        y5fVar.d(r5d.class, new qxc(9));
        y5fVar.d(ky1.class, new qxc(10));
        y5fVar.d(rr3.class, new qxc(11));
        y5fVar.d(ks1.class, new qxc(12));
        y5fVar.b(qu7.class, new dcb(18));
        y5fVar.d(c32.class, new qxc(14));
        y5fVar.d(xf2.class, new qxc(15));
        y5fVar.d(zm8.class, new qxc(16));
        y5fVar.d(sp3.class, new qxc(17));
        y5fVar.d(q2e.class, new qxc(18));
        y5fVar.d(kw3.class, new qxc(19));
        y5fVar.d(tp7.class, new qxc(20));
        y5fVar.d(m9b.class, new qxc(21));
        y5fVar.d(gc2.class, new qxc(22));
        y5fVar.d(ki7.class, new qxc(23));
        y5fVar.d(sc2.class, new qxc(25));
        y5fVar.d(fe7.class, new qxc(26));
        y5fVar.d(mw8.class, new uza(29));
        y5fVar.d(hu8.class, new mxc(0));
        y5fVar.d(kt8.class, new uza(11));
        y5fVar.d(u79.class, new uza(12));
        y5fVar.d(k6f.class, new uza(13));
        y5fVar.d(pf5.class, new uza(14));
        y5fVar.d(vt7.class, new qxc(27));
        y5fVar.d(ru.ok.tamtam.logout.a.class, new qxc(28));
        y5fVar.d(ci0.class, new qxc(29));
        y5fVar.d(tm3.class, new uza(15));
        y5fVar.d(gb6.class, new lxc(0));
        y5fVar.d(ab6.class, new rxc(0));
        y5fVar.d(eyd.class, new uza(16));
        y5fVar.d(afe.class, new uza(17));
        y5fVar.d(no4.class, new uza(18));
        y5fVar.d(d00.class, new rxc(1));
        y5fVar.d(ie3.class, new uza(19));
        y5fVar.d(q6f.class, new lxc(1));
        y5fVar.d(i6f.class, new lxc(2));
        y5fVar.d(t6f.class, new lxc(3));
        y5fVar.d(blb.class, new rxc(2));
        y5fVar.d(zs9.class, new uza(20));
        y5fVar.d(wxc.class, new uza(22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r7[r3] != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001f, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean M(java.lang.String[] r6, int[] r7, java.lang.String[] r8) {
        /*
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 1
            if (r2 >= r0) goto L26
            r4 = r8[r2]
            int r5 = r6.length
            if (r5 < r3) goto L25
            int r5 = r7.length
            if (r5 >= r3) goto Lf
            goto L25
        Lf:
            r3 = r1
        L10:
            int r5 = r6.length
            if (r3 >= r5) goto L25
            r5 = r6[r3]
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L22
            r3 = r7[r3]
            if (r3 != 0) goto L25
            int r2 = r2 + 1
            goto L3
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            return r1
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmd.M(java.lang.String[], int[], java.lang.String[]):boolean");
    }

    public static boolean N(q5 q5Var, a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        boolean z;
        if (M(strArr, iArr, strArr2)) {
            hm9.n("wmd", "all permissions granted");
            return true;
        }
        int length = strArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = false;
                break;
            }
            String str = strArr2[i4];
            int i5 = Build.VERSION.SDK_INT;
            if ((i5 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? i5 >= 32 ? x7.a(q5Var, str) : i5 == 31 ? w7.b(q5Var, str) : v7.c(q5Var, str) : false) {
                z = true;
                break;
            }
            i4++;
        }
        if (z) {
            hm9.n("wmd", "some permissions denied");
            a14.N(0, q5Var, q5Var.getString(i3));
        } else {
            FrgDlgPermissions frgDlgPermissionsN1 = FrgDlgPermissions.n1(null, FrgDlgPermissions.G1, i2, FrgDlgPermissions.H1, true);
            if (aVar != null) {
                frgDlgPermissionsN1.k1(aVar.c0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            } else {
                frgDlgPermissionsN1.k1(q5Var.S(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            }
            hm9.n("wmd", "some permissions denied forever");
        }
        return false;
    }

    public static boolean O(a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        q5 q5Var = (q5) aVar.b0();
        return q5Var != null && N(q5Var, aVar, strArr, iArr, strArr2, i2, i3);
    }

    public static void a(int i2, int i3, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            new StringBuilder(str.length() + String.valueOf(GLES20.glGetShaderInfoLog(iGlCreateShader)).length() + 10);
        }
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        h();
    }

    public static final float b(float f2, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return ((Float.intBitsToFloat((int) (j & 4294967295L)) - fIntBitsToFloat) * f2) + fIntBitsToFloat;
    }

    public static final void c(mne mneVar, coe coeVar, String str) {
        foe.i.fine(coeVar.f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + mneVar.c);
    }

    public static ArrayList d(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static byte[] e(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final int f(Spanned spanned) {
        Object[] spans;
        int iHashCode = spanned.toString().hashCode();
        try {
            spans = spanned.getSpans(0, spanned.length(), Object.class);
        } catch (Throwable unused) {
            spans = null;
        }
        if (spans == null) {
            return iHashCode;
        }
        int length = (iHashCode * 31) + spans.length;
        for (Object obj : spans) {
            if (obj != null) {
                if (obj != spanned) {
                    length = (length * 31) + obj.hashCode();
                }
                length = spanned.getSpanFlags(obj) + ((spanned.getSpanEnd(obj) + ((spanned.getSpanStart(obj) + (length * 31)) * 31)) * 31);
            }
        }
        return length;
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void h() {
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            if (strValueOf.length() != 0) {
                "glError: ".concat(strValueOf);
            }
            i2 = iGlGetError;
        }
        if (i2 != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i2));
            if (strValueOf2.length() != 0) {
                "glError: ".concat(strValueOf2);
            }
        }
    }

    public static void i(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static boolean j(Context context, String[] strArr) {
        for (String str : strArr) {
            if (z7.c(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void k(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbJ = wg0.j("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            sbJ.append(i4);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(rh4.h("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public static boolean l(Context context) {
        if (j(context, s())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return j(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    public static long m(long j, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return mr0.k(f2, f3);
    }

    public static final List n() {
        return y53.M(new y47(x47.c, new eqe(hca.e), Integer.valueOf(woc.f1)), new y47(x47.a, new eqe(hca.f), Integer.valueOf(woc.c0)), new y47(x47.b, new eqe(hca.k), Integer.valueOf(woc.N1)));
    }

    public static final boolean o(float f2, float f3, float f4) {
        return Math.abs(f2 - f3) < f4;
    }

    public static final String p(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= ((long) (-999500000)) ? zr6.k(new StringBuilder(), (j - 500000000) / 1000000000, " s ") : j <= ((long) (-999500)) ? zr6.k(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? zr6.k(new StringBuilder(), (j - 500) / 1000, " µs") : j < ((long) 999500) ? zr6.k(new StringBuilder(), (j + 500) / 1000, " µs") : j < ((long) 999500000) ? zr6.k(new StringBuilder(), (j + 500000) / 1000000, " ms") : zr6.k(new StringBuilder(), (j + 500000000) / 1000000000, " s ")}, 1));
    }

    public static long q(byte b2, byte b3) {
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        return i2 * (i5 >= 16 ? 2500 << r6 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static SharedPreferences r(Context context) {
        if (i == null) {
            i = context.getSharedPreferences("permissions_prefs", 0);
        }
        return i;
    }

    public static String[] s() {
        if (Build.VERSION.SDK_INT >= 33) {
            return h;
        }
        uuc.a.getClass();
        return tuc.c;
    }

    public static List t(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        au1.r(Class.forName(string, false, wmd.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                        arrayList.add(null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static vmd u(Context context) {
        if (a == null) {
            try {
                a = (vmd) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, wmd.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new vmd();
            }
        }
        return a;
    }

    public static final void v(lx3 lx3Var, Throwable th) {
        try {
            ox3 ox3Var = (ox3) lx3Var.get(qx7.c);
            if (ox3Var != null) {
                ox3Var.g(lx3Var, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(lx3Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j47.e(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(lx3Var, th);
        }
    }

    public static final boolean w(byte b2) {
        int i2 = b2 & 255;
        return i2 <= 127 || i2 >= 224;
    }

    public static final String x(List list, final boolean z, final boolean z2) {
        return !z ? String.valueOf(list.size()) : x53.n0(list, ",", "[", "]", new m56() { // from class: at7
            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                return wmd.J(obj, z, z2);
            }
        }, 24);
    }

    public static final String y(Map map, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(map.size());
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.valueOf(key));
            sb.append('=');
            sb.append(J(value, z, z2));
            sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }

    public static void z(Context context, String[] strArr, int[] iArr) {
        if (Arrays.equals(strArr, d)) {
            SharedPreferences.Editor editorEdit = r(context).edit();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                editorEdit.putBoolean(strArr[i2], iArr[i2] == 0);
            }
            editorEdit.commit();
        }
    }

    public abstract void K();
}
