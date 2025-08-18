package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public class w4d implements ah9, e71, cm1, abe, y2a, s7c, do7, wm4, e8, a76, obe, qfd, co7, zu6 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w4d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zu6
    public void A(String str) {
        h2e h2eVar = (h2e) this.b;
        h2eVar.c(h2eVar.f, new File(str));
    }

    @Override // defpackage.do7
    public b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        bqa bqaVar = (bqa) go7Var;
        y14 y14Var = (y14) this.b;
        y14Var.getClass();
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        y14Var.q.C(new yn7(j2), bqaVar.c, iOException, true);
        y14Var.m.getClass();
        y14Var.x(iOException);
        return vq7.Y;
    }

    public l4 D(int i) {
        return null;
    }

    public l4 E(int i) {
        return null;
    }

    public boolean F(CharSequence charSequence, pva pvaVar) {
        String str = pvaVar.b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((qqd) this.b).w(str).matcher(charSequence);
        if (matcher.lookingAt()) {
            return matcher.matches();
        }
        return false;
    }

    @Override // defpackage.obe
    public void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) {
        yz3 yz3VarA;
        wpa wpaVar = (wpa) this.b;
        wpaVar.E(i2 + i, bArr);
        wpaVar.G(i);
        ArrayList arrayList = new ArrayList();
        while (wpaVar.a() > 0) {
            fm9.e("Incomplete Mp4Webvtt Top Level box header found.", wpaVar.a() >= 8);
            int iG = wpaVar.g();
            if (wpaVar.g() == 1987343459) {
                int i3 = iG - 8;
                CharSequence charSequenceF = null;
                wz3 wz3VarB = null;
                while (i3 > 0) {
                    fm9.e("Incomplete vtt cue box header found.", i3 >= 8);
                    int iG2 = wpaVar.g();
                    int iG3 = wpaVar.g();
                    int i4 = iG2 - 8;
                    byte[] bArr2 = wpaVar.a;
                    int i5 = wpaVar.b;
                    int i6 = oaf.a;
                    String str = new String(bArr2, i5, i4, b52.c);
                    wpaVar.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (iG3 == 1937011815) {
                        o4g o4gVar = new o4g();
                        q4g.e(str, o4gVar);
                        wz3VarB = o4gVar.b();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = q4g.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (wz3VarB != null) {
                    wz3VarB.a = charSequenceF;
                    yz3VarA = wz3VarB.a();
                } else {
                    Pattern pattern = q4g.a;
                    o4g o4gVar2 = new o4g();
                    o4gVar2.c = charSequenceF;
                    yz3VarA = o4gVar2.b().a();
                }
                arrayList.add(yz3VarA);
            } else {
                wpaVar.H(iG - 8);
            }
        }
        pj3Var.accept(new b04(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void H(Exception exc) {
        fm9.c("Audio sink error", exc);
        ph4 ph4Var = ((u78) this.b).R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new x60(ph4Var, exc, 1));
        }
    }

    public void I(Object obj, boolean z) {
        ww0 ww0Var = (ww0) obj;
        die dieVar = (die) this.b;
        synchronized (dieVar) {
            try {
                if (z) {
                    ((LinkedHashSet) dieVar.o).add(ww0Var);
                } else {
                    ((LinkedHashSet) dieVar.o).remove(ww0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.obe
    public int J() {
        return 2;
    }

    public boolean K(int i, int i2, Bundle bundle) {
        return false;
    }

    public Long L(Long l) {
        if (l.longValue() < 0) {
            this.b = null;
            return null;
        }
        Long l2 = (Long) this.b;
        this.b = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        w53 w53Var = (w53) this.b;
        w53Var.getClass();
        WeakHashMap weakHashMap = zmf.a;
        x6g x6gVar2 = w53Var.getFitsSystemWindows() ? x6gVar : null;
        if (!Objects.equals(w53Var.O0, x6gVar2)) {
            w53Var.O0 = x6gVar2;
            w53Var.requestLayout();
        }
        return x6gVar.a.c();
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        return (x77) ((AtomicReference) this.b).get();
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.wm4
    public void b() {
        u5e u5eVar = (u5e) ((zm4) this.b).e;
        u5eVar.getClass();
        bc7[] bc7VarArr = VideoViewerWidget.u0;
        dmf dmfVarO0 = ((VideoViewerWidget) u5eVar.a).o0();
        if (dmfVarO0 != null) {
            ((ChatMediaViewerScreen) dmfVarO0).G0(true);
        }
    }

    @Override // defpackage.e71
    public int c() {
        ViewPager2 viewPager2 = ((h71) this.b).J0;
        int measuredHeight = viewPager2.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = viewPager2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        ((ut6) this.b).close();
    }

    @Override // defpackage.qfd
    public void e(long j, boolean z) {
        ((a66) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // defpackage.wm4
    public void f(int i) {
        zm4.a((zm4) this.b, true, i * 10);
    }

    @Override // defpackage.abe
    public int g(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.ah9
    public void h() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.abe
    public long i(int i) {
        np8.d(i == 0);
        return 0L;
    }

    @Override // defpackage.ah9
    public void j() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.zu6
    public void k() {
        h2e h2eVar = (h2e) this.b;
        h2eVar.b(h2eVar.f, new Exception("onDownloadFailed"));
    }

    @Override // defpackage.ah9
    public void l() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.do7
    public void m(go7 go7Var, long j, long j2, boolean z) {
        ((y14) this.b).w((bqa) go7Var, j, j2);
    }

    @Override // defpackage.co7
    public void o(fo7 fo7Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        x77 x77Var = (x77) ((AtomicReference) this.b).accumulateAndGet((x77) obj2, new px3());
        if (x77Var != null) {
            x77Var.start();
        }
    }

    @Override // defpackage.abe
    public List p(long j) {
        return j >= 0 ? (List) this.b : Collections.emptyList();
    }

    @Override // defpackage.ah9
    public void q() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.ah9
    public void r() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.ah9
    public void s() {
        c50.f((c50) this.b);
    }

    @Override // defpackage.ah9
    public void t() {
        c50.f((c50) this.b);
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return wg0.g(((long[]) this.b).length, "Subject{organizationIds=", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.abe
    public int u() {
        return 1;
    }

    @Override // defpackage.do7
    public void v(go7 go7Var, long j, long j2) {
        bqa bqaVar = (bqa) go7Var;
        y14 y14Var = (y14) this.b;
        y14Var.getClass();
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        y14Var.m.getClass();
        y14Var.q.z(yn7Var, bqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        y14Var.L = ((Long) bqaVar.Y).longValue() - j;
        y14Var.y(true);
    }

    @Override // defpackage.e8
    public void x(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        c cVar = (c) this.b;
        i16 i16Var = (i16) cVar.F.pollFirst();
        if (i16Var == null) {
            return;
        }
        a aVarC = cVar.c.c(i16Var.a);
        if (aVarC == null) {
            return;
        }
        aVarC.J0(i16Var.b, strArr, iArr);
    }

    @Override // defpackage.co7
    public void y(fo7 fo7Var, long j, long j2) {
        boolean z;
        y8 y8Var = (y8) this.b;
        if (y8Var != null) {
            synchronized (nu0.A0) {
                z = nu0.B0;
            }
            if (z) {
                y8Var.y();
                return;
            }
            IOException iOException = new IOException(new ConcurrentModificationException());
            x14 x14Var = (x14) y8Var.a;
            x14Var.getClass();
            fm9.c("Failed to resolve time offset.", iOException);
            x14Var.s(true);
        }
    }

    @Override // defpackage.co7
    public b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        y8 y8Var = (y8) this.b;
        if (y8Var != null) {
            x14 x14Var = (x14) y8Var.a;
            x14Var.getClass();
            fm9.c("Failed to resolve time offset.", iOException);
            x14Var.s(true);
        }
        return jo7.X;
    }

    public /* synthetic */ w4d(int i, boolean z) {
        this.a = i;
    }

    public w4d(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        new sh(oneMeRoomDatabase, 22);
    }

    public w4d(bj6 bj6Var) {
        this.a = 29;
        this.b = (TorchFlashRequiredFor3aUpdateQuirk) bj6Var.e(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public w4d(int i) {
        this.a = i;
        switch (i) {
            case 20:
                this.b = new wpa();
                break;
            case 21:
            default:
                this.b = new m4(this);
                break;
            case 22:
                this.b = new qqd(100);
                break;
        }
    }

    public w4d(je3 je3Var) {
        this.a = 28;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), je3Var);
    }

    public w4d(v4 v4Var) {
        this.a = 21;
        this.b = new khe(new ot2(v4Var, 11));
    }
}
